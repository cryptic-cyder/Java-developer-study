package Serilization;

import java.io.*;

public class Driver1 {
    public static void main(String[] args) throws IOException {

        MySerializable object = new MySerializable(1, "geeksforgeeks");
        String filename = "file.ser";

        try{

            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            // Method for serialization of object
            outputStream.writeObject(object);

            outputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been serialized");

        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }

        try {

            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            MySerializable obj1 = (MySerializable) objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + obj1.a);
            System.out.println("b = " + obj1.b);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
