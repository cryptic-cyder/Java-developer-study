import java.util.LinkedList;

public class Graph {

    private int v;
    private LinkedList<Integer>[] arrayOfList;

    public Graph(int v){

        this.v = v;
        arrayOfList = new LinkedList[v+1];

        for(int i=0; i<=v; i++){
            arrayOfList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination){

        arrayOfList[source].add(destination);
    }

    public void printGraph(){
        for(int i=1; i<v; i++){
            System.out.print("Node "+i+" is connected to : ");
            for(Integer value: arrayOfList[i]){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
