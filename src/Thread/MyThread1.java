package Thread;

import java.util.Map;

class NewThread implements Runnable{

    Thread thread;
    String name;

    NewThread(String name){

        this.name = name;
        thread = new Thread(this, name);

        thread.start();
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(name+" "+this.thread.isAlive());
            System.out.println(name+"."+i);
        }
    }
}

public class MyThread1 {
    public static void main(String[] args) throws InterruptedException {

        NewThread newThread1 = new NewThread("Thread 1");
        NewThread newThread2 = new NewThread("Thread 2");
        NewThread newThread3 = new NewThread("Thread 3");

        /*Map<Thread, StackTraceElement[]> threads = Thread.getAllStackTraces();

        System.out.println("Names of currently running threads:");
        for (Thread thread : threads.keySet()) {
            System.out.println(thread.getName());
        }*/
    }
}
