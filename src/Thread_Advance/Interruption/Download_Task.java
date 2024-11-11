package Thread_Advance.Interruption;

public class Download_Task implements Runnable {

    private String taskName;

    Download_Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            System.out.println(taskName +
                    " is downloading...May take 10 second"
            );

            Thread.sleep(10000); // Simulate time taken to download

            if (Thread.currentThread().isInterrupted()) {
                System.out.println(taskName +
                        " - downloading was interrupted in lets say after 10 second"
                );
            }
            System.out.println(true + " download complete!");
        }
        catch (InterruptedException e) {
            System.out.println(taskName + " download interrupted during sleep. Cleaning up...");
            Thread.currentThread().interrupt();
        }
    }
}
