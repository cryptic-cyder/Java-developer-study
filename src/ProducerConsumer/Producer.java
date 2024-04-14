package ProducerConsumer;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{

    BlockingQueue<String> blockingQueue;
    Thread thread;
    String name;

    Producer(BlockingQueue<String> blockingQueue, String name){

        this.name = name;
        this.blockingQueue = blockingQueue;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {

        while(true){

            try{

                if(blockingQueue.size() >= 4){
                    System.out.println("Queue is full...");
                    Thread.sleep(500);
                }

                blockingQueue.put("Cake "+blockingQueue.size());
                Thread.sleep(500);
                System.out.println(name+" created cake "+blockingQueue.size());
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
