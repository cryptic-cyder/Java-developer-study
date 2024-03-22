 class Node implements Comparable<Node> {
    int u;
    int v;

    public Node(int u, int v) {
        this.u = u;
        this.v = v;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.v, other.v);
    }
}