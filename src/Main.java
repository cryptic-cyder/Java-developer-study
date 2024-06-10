import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.*;


import static java.nio.file.Files.lines;

public class Main{

    public static void main(String[] args) {

        try{

            //Path path = Paths.get("C:\\Users\\Shahriar\\Desktop\\IntelliJ Spring Boot Projects\\Demo.txt");

            /*boolean isExists = Files.exists(path);
            System.out.println(isExists);

            FileTime lastModifiedDate = Files.getLastModifiedTime(path);
            System.out.println(lastModifiedDate);

            UserPrincipal owner = Files.getOwner(path);
            System.out.println(owner);*/

            /* Creating new directory
            Path newDirectory = Files.createDirectories(path.getParent().resolve("newDirectory"));
            System.out.println(newDirectory);*/

            // Easier one to create folder
            File dir = new File("C:\\Users\\Shahriar\\Desktop\\IntelliJ Spring Boot Projects\\anotherDirectory");
            dir.mkdir();
            //String location = dir.getAbsolutePath();
            //System.out.println(location);
            //dir.delete();

            String path = dir.getAbsolutePath(); // Get the directory's path

            File student = new File(path+"\\student.txt");

            student.createNewFile(); // Create file in the path directory


            //Creating new files
            /*Path newFile = Files.createFile(newDirectory.resolve("New.txt"));*/

            //Path pathToNewFile = Paths.get("C:\\Users\\Shahriar\\Desktop\\IntelliJ Spring Boot Projects\\newDirectory\\New.txt");

            /*FileWriter fileWriterWithoutBuffer  = new FileWriter(student);
            long startTimeWithoutBuffer = System.nanoTime();
            for(int i=0; i<10000; i++){
                fileWriterWithoutBuffer.write("Data "+i+" \n");
            }
            fileWriterWithoutBuffer.close();
            long endTimeWithoutBuffer = System.nanoTime();
            System.out.println("Time needed without buffer : "+(endTimeWithoutBuffer-startTimeWithoutBuffer)/1000000 +" ms");
*/

            /*BufferedWriter fileWriterWithBuffer = new BufferedWriter(new FileWriter(student));
            long startTimeWithBuffer = System.nanoTime();
            for(int i=0; i<10000; i++){
                fileWriterWithBuffer.write("Data "+i+" \n");
            }
            fileWriterWithBuffer.close();
            long endTimeWithBuffer = System.nanoTime();
            System.out.println("Time needed with buffer : "+(endTimeWithBuffer-startTimeWithBuffer)/1000000 +" ms");*/

            //Writing to the file using buffer
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(student, true));
            bufferedWriter.write("\nHello...inside the file...");
            bufferedWriter.close();

            //Reading from the line
            Scanner scanner = new Scanner(new File(student.toURI()));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

            //Updating in the third line
            List<String> lines = Files.readAllLines(Paths.get(student.toURI()));
            lines.set(1, "This is the updated text in line 2");
            Files.write(Paths.get(student.toURI()), lines);

        }
        catch (Exception e){
            System.out.println("Cannot write to file");
        }


        //Using another projects("Test") package here

        //Test_Class test_class = new Test_Class();
        //test_class.test_method();



        /*Class c=ClassLoader.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
*/

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


        //System.out.println("Hello from command line");


    }
}