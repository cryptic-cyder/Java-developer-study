package Socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    static ServerSocket serverSocket;
    static String clientMessage;


    public static void main(String[] args) {

        try {

            openingPort();

            while (true) {

                Socket socket = socketConnection();

                ObjectInputStream objectInputStreamForConnection = new ObjectInputStream(socket.getInputStream());
                System.out.println("Connected with : " + objectInputStreamForConnection.readUTF());


                new Thread(() -> {

                    try {

                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

                        new Thread(() -> {
                            readMessageFromClient(objectInputStream);
                        })
                                .start();

                        new Thread(() -> {
                            sendMessageToClient(objectOutputStream);
                        }).start();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

                }).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void openingPort() {

        try {

            System.out.println(" Server started...");
            serverSocket = new ServerSocket(2000);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static Socket socketConnection() {

        try {

            Socket socket = serverSocket.accept();
            return socket;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readMessageFromClient(ObjectInputStream objectInputStream) {

        try {
            while (true) {
                clientMessage = objectInputStream.readUTF();
                String[] parts = clientMessage.split(":", 2);
                System.out.println("From " + parts[0] + " : " + parts[1]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    private static void sendMessageToClient(ObjectOutputStream objectOutputStream) {

        new Thread(() -> {
            try {
                while (true) {

                    System.out.println("Enter your message : ");
                    Scanner scanner = new Scanner(System.in);
                    String messageToBeSent = scanner.nextLine();

                    objectOutputStream.writeUTF(messageToBeSent);
                    objectOutputStream.flush();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }).start();
    }
}

