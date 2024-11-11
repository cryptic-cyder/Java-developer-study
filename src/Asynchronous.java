import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Asynchronous {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");

        System.out.println("Start of main method"+
                "---------------Thread name : "+Thread.currentThread().getName()
              +"----------------Time : "+ LocalDateTime.now().format(timeFormatter)
        );

        // Non-blocking call: task runs in a separate thread
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(3000);
                return "Inside asynchronous------------" +
                        "Current thread name :"+Thread.currentThread().getName()
                        +"----------------Time : "+ LocalDateTime.now().format(timeFormatter);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("End of main method"+
                "---------------Thread name : "+Thread.currentThread().getName()
                        +"----------------Time : "+ LocalDateTime.now().format(timeFormatter));

        System.out.println(future.get());
    }
}
