package graph;

class Bag<Item> {
    private Node first;
    private class Node {
        Item item;
        Node next;
    }
    public void add(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    public int size() {
        int size = 0;
        for(Node x = first; x != null; x = x.next) {
            size++;
        }
        return size;
    }
}
public class Graph {
    private final int V;
    private Bag<Integer>[] adj;
    public Graph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for(int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
    public int V() {
        return V;
    }
    public int E() {
        int edges = 0;
        for(int v = 0; v < V; v++) {
            edges += adj[v].size();
        }
        return edges / 2;
    }
}
