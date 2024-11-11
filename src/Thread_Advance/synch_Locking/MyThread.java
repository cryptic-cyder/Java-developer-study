package Thread_Advance.synch_Locking;

public class MyThread extends Thread{
    static Thread t = Thread.currentThread();

    Display display = new Display();
    String name;

    public MyThread() {
    }

    MyThread(Display display, String name){
        this.display = display;
        this.name = name;
    }

    public void run(){

        display.wish(name);

//        try {
//            t.join();
//        }
//        catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        for (int i = 0; i < 10; i++) {
////            if(Thread.currentThread().isInterrupted()){
////                System.out.println("Child thread is interrupted");
////                break;
////            }
//
//            System.out.print("child ");
//        }
    }
}
