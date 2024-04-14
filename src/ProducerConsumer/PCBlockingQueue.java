package ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class PCBlockingQueue {
    public static void main(String[] args) {

        BlockingQueue<String > blockingQueue = new ArrayBlockingQueue<>(4);

        Producer producer1 = new Producer(blockingQueue, "Producer-1");
        Consumer consumer1 = new Consumer(blockingQueue, "Consumer-1");
    }
}
