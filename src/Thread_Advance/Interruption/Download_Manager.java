package Thread_Advance.Interruption;

public class Download_Manager {
    public static void main(String[] args) throws InterruptedException {

        Thread d1 = new Thread(new Download_Task("(Movie-1)"));
        Thread d2 = new Thread(new Download_Task("(Movie-2)"));

        d1.start();
        d2.start();

        //Lets user think to cancel download after 10 second...
        Thread.sleep(5000);
        System.out.println("User cancel the (Movie-1) download after 5s");
        d1.interrupt();  // Signaling to stop download

        d1.join();
        d2.join();
        System.out.println("All downloads completed or canceled. Main thread ends.");
    }
}
