package Thread;

import static java.lang.Thread.sleep;

public class MyThread {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        long startTime = System.nanoTime();
        a.start();
        b.start();
        c.start();
        long endTime = System.nanoTime();

        System.out.println( (endTime-startTime) + " ns") ;


    }
}
class A  extends Thread{

    public void run() {

        for (int i=1; i<=5; i++){
            System.out.println("Process A");
            //sleep(500);
        }
    }
}

class B extends Thread{

    public void run() {

        for (int i=1; i<=5; i++){
            System.out.println("Process B");

        }
    }
}

class C extends Thread{

    public void run() {

        for (int i=1; i<=5; i++){
            System.out.println("Process C");

        }
    }
}