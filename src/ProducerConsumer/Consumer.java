package ProducerConsumer;
import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable{

    BlockingQueue<String> blockingQueue;
    Thread thread;
    String name;

    Consumer(BlockingQueue<String> blockingQueue, String name){

        this.name = name;
        this.blockingQueue = blockingQueue;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {

        while(true){

            try{

                if(blockingQueue.size()==0){
                    System.out.println("Queue is empty...");
                    Thread.sleep(500);
                }

                System.out.println(name+" got "+blockingQueue.take());
                Thread.sleep(500);

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
