package GreedyAl;

class Bag<Item> implements Iterable<Item> {
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
}
public class EdgeWeightedGraph {
    private final int V;
    private int E;
    private Bag<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V; this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<Edge>();
    }
    public int V() { return V; }
    public int E() { return E; }
    public void addEdge(Edge e) {
        int v = e.either(), w = e.other(v);
        adj[v].add(e); adj[w].add(e);
        E++;
    }
    public Iterable<Edge> adj(int v) {
        return adj[v];
    }
    public Iterable<Edge> edges() {
        Bag<Edge> b = new Bag<Edge>();
        for (int v = 0; v < V; v++)
            for (Edge e : adj[v])
                if (e.other(v) > v) b.add(e);
        return b;
    }
}
