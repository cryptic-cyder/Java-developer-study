import java.util.*;

public class Main {

    public static void main(String[] args) {
 /*try{
            // Attempt to create large arrays until OutOfMemoryError occurs
            for (int i = 1; i <= 1000000000; i++) {

                int[] largeArray = new int[1000000]; // Each array has 1 million elements
                System.out.println("Created array #" + i);
            }
        }
        catch (OutOfMemoryError outOfMemoryError){
            System.out.println(outOfMemoryError);
        }*/




        /*ArrayStack arrayStack = new ArrayStack(3);

        arrayStack.push(1);
        arrayStack.push(3);

        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.returnSize());

        arrayStack.pop();
        System.out.println(arrayStack.returnSize());

        arrayStack.push(4);
        arrayStack.push(6);
        System.out.println("Current size : "+arrayStack.returnSize());

        //arrayStack.push(7); // Will provide StackOverflow

        arrayStack.pop();  // popped 1
        arrayStack.pop();   // popped 4
        System.out.println(arrayStack.returnSize());
        arrayStack.pop();  // popped 6
        System.out.println(arrayStack.returnSize());

        System.out.println("Top element : ");*/
        //arrayStack.peek(); // Will provide EmptyStackException

        // arrayStack.pop(); // Will provide EmptyStackException


        // Queue

        /*Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(5);
        queue.offer(1);
        queue.offer(4);
        queue.offer(2);

        System.out.println(queue.poll());

        System.out.println(queue.peek());*/

        /*StackUsingQueue suq = new StackUsingQueue<>();

        suq.push(5);
        suq.push(1);
        suq.push(2);
        suq.push(7);

        //System.out.println(suq.peek());

        System.out.println(suq.pop());*/

        /*Graph graph = new Graph(5);

        graph.addEdge(1, 2);
        graph.addEdge(1, 5);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        graph.printGraph();*/

        /*int V = 5;
        Dijsktra graph = new Dijsktra(V);

        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 5, 8);
        graph.addEdge(2, 3, 10);
        graph.addEdge(2, 4, 20);
        graph.addEdge(3, 4, 2);
        graph.addEdge(2, 5, 15);
        graph.addEdge(4, 5, 11);

        int[] distance = graph.dijkstraImplement(1);

        System.out.println("Shortest distances from source vertex 0:");
        for (int i = 1; i <=V; i++) {
            System.out.println("Vertex " + i + ": " + distance[i]);
        }*/


        System.out.println("Hello from command line");

    }
}