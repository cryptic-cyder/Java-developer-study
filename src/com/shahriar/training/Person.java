package com.shahriar.training;

import Thread_Advance.synch_Locking.MyThread;

import java.sql.SQLException;

public class Person {
    public static void main(String[] args) throws SQLException, InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();
        //myThread.join();
        for (int i = 0; i < 10; i++) {
            System.out.print("main ");
        }

        //myThread.interrupt();

//        System.out.println(Thread.currentThread().getName());
//        System.out.println(myThread.getName());
//        myThread.setName("Badhon");
//        System.out.println(myThread.getName());

        //System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(7);
//        System.out.println(myThread.getPriority());
//        myThread.setPriority(10);
//        System.out.println(myThread.getPriority());
//
//        myThread.start();


//        StringBuffer s = new StringBuffer("Haider");
//        s.append("java");
//        System.out.println(s);
//
//        String s1 =  "Hello";
//        String s2 = "Hello";
//
//        System.out.println(s1==s2);


//        try {
//            System.out.println("In the try block");
//            int result = 10 / 0;
//            System.out.println("Result: " + result);
//        }
//        catch (Exception e) {
//            System.out.println("An exception occurred: " + e.getMessage());
//        }
//        finally {
//            System.out.println("This will always execute, even if an exception occurs.");
//        }

    }
}
