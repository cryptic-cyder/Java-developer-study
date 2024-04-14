package Socket;

import java.io.*;

import java.net.Socket;
import java.util.Scanner;

public class Client {

    static Socket socket;
    static String serverResponse;
    static String clientName;


    public static void main(String[] args) throws IOException {

        try {

            creatingClient();

            createConnection(clientName);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            new Thread(() -> sendMessage(objectOutputStream)).start();
            new Thread(() -> receivingResponse(objectInputStream)).start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void creatingClient() {

        System.out.println("Enter client name : ");
        Scanner scanner = new Scanner(System.in);
        clientName = scanner.nextLine();

    }

    public static void createConnection(String clientName) {

        try {

            socket = new Socket("localhost", 2000);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeUTF(clientName);
            objectOutputStream.flush();


            System.out.println(clientName + " client started...");

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void sendMessage(ObjectOutputStream objectOutputStream) {

        Runnable sendMessageToServer = () -> {

            try {

                while (true) {

                    System.out.println("Client -> Enter your message : ");

                    Scanner scanner = new Scanner(System.in);
                    String messageToBeSent = scanner.nextLine();

                    objectOutputStream.writeUTF(clientName +":"+messageToBeSent);
                    objectOutputStream.flush();
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

        new Thread(sendMessageToServer).start();
    }

    public static void receivingResponse(ObjectInputStream objectInputStream) {

        Runnable receiveMessageFromServer = () -> {
            try {
                while (true) {
                    serverResponse = objectInputStream.readUTF();
                    System.out.println("Client -> Message from server : " + serverResponse);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

        new Thread(receiveMessageFromServer).start();
    }
}