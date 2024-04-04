package MyThread1;


class MyThread1 extends Thread{
    String process;

    public MyThread1(String process){
        this.process = process;
    }

    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Process : "+ process+" is running...");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



public class Driver{

    public static void main(String[] args) throws InterruptedException {

        MyThread1 myThread11 = new MyThread1("A");
        MyThread1 myThread12 = new MyThread1("B");
        MyThread1 myThread13 = new MyThread1("C");

        //long startThread = System.nanoTime();

        myThread11.start();
        myThread12.start();
        myThread13.start();

        myThread11.join();  // main thread will pause until MyThread1 finishes
        myThread12.join();  // main thread will pause until MyThread2 finishes
        myThread13.join();  // main thread will pause until MyThread3 finishes

        System.out.println(myThread11.isAlive()); //it gives false bcz it is after join()

        //long endThread = System.nanoTime();

        //System.out.println("Time with thread : "+ (endThread-startThread) );

        /*long startWithout = System.nanoTime();

        for(int i=1; i<=5; i++){
            System.out.println("Process A is running...");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for(int i=1; i<=5; i++){
            System.out.println("Process B is running...");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(int i=1; i<=5; i++){
            /*System.out.println("Process C is running...");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long endWithout = System.nanoTime();

        System.out.println("Time without thread : "+ (endWithout-startWithout) );*/
    }
}