package Serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Driver {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Shahriar\\Desktop\\IntelliJ Spring Boot Projects\\Demo.txt");
        int byteRead;

        while((byteRead=fileInputStream.read())!=-1){

            char ch = (char)byteRead;
            System.out.print(ch+" ");
        }

        System.out.println();

        fileInputStream.close();


        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Shahriar\\Desktop\\IntelliJ Spring Boot Projects\\Demo1.txt");

        byte[] data = {10,23,45};

        try{
            fileOutputStream.write(data);
            System.out.println("Data written to file successfully...");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        fileOutputStream.close();

    }
}
