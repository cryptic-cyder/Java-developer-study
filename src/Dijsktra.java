import java.util.*;

public class Dijsktra {

    private int V;
    private  LinkedList<Node>[] arrayOfList; // Adjacency list representation

        public Dijsktra(int V) {

            this.V = V;
            arrayOfList = new LinkedList[V+1];

            Arrays.fill(arrayOfList, new LinkedList<Node>());
        }

        public void addEdge(int source, int destination, int weight){

            arrayOfList[source].add(new Node(destination, weight));
            arrayOfList[destination].add(new Node(source, weight));
        }

        public int[] dijkstraImplement(int source) {

            int[] distance = new int[V + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);

            distance[source] = 0;

            PriorityQueue<Node> pq = new PriorityQueue<>();
            pq.offer(new Node(source, 0));

            while (!pq.isEmpty()) {

                Node currentNode = pq.poll();
                int currentSource = currentNode.u;

                for (Node neighbour : arrayOfList[currentSource]) {
                    int currentDestination = neighbour.u;
                    int currentWeight = neighbour.v;

                    if (distance[currentSource] != Integer.MAX_VALUE &&
                            distance[currentDestination] > distance[currentSource] + currentWeight) {

                        distance[currentDestination] = distance[currentSource] + currentWeight;
                        pq.offer(new Node(currentDestination, distance[currentDestination]));
                    }
                }
            }
            return distance;
        }
}


