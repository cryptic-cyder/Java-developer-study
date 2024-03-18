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




        ArrayStack arrayStack = new ArrayStack(3);

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

        System.out.println("Top element : ");
        //arrayStack.peek(); // Will provide EmptyStackException

        // arrayStack.pop(); // Will provide EmptyStackException
    }
}