import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {

    private Queue<T> queue1;
    private Queue<T> queue2;

    public StackUsingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(T data){
        queue1.offer(data);
    }

    public T pop(){

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        while (queue1.size() > 1){
            queue2.offer(queue1.poll());
        }

        T poppedElement = queue1.poll();

        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedElement;

    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        // Move all elements from queue1 to queue2 except the last one
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        // Retrieve the last element from queue1 (which simulates peeking from the stack)
        T peekedElement = queue1.poll();

        // Move the peeked element to queue2
        queue2.offer(peekedElement);

        // Swap queue1 and queue2
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return peekedElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}
