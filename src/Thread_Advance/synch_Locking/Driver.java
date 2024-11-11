package Thread_Advance.synch_Locking;

public class Driver {
    public static void main(String[] args) {

        Display display = new Display();

        MyThread t1 = new MyThread(display, "Shahriar");
        MyThread t2 = new MyThread(display, "Badhon");

        //Multiple thread trying to use same object
        t1.start();
        t2.start();

    }
}
