public class Main {

    public static void main(String[] args) {

        try{
            // Attempt to create large arrays until OutOfMemoryError occurs
            for (int i = 1; i <= 1000000000; i++) {

                int[] largeArray = new int[1000000]; // Each array has 1 million elements
                System.out.println("Created array #" + i);
            }
        }
        catch (OutOfMemoryError outOfMemoryError){
            System.out.println(outOfMemoryError);
        }
    }
}