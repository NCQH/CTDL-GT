import java.util.*;
import edu.princeton.cs.algs4.*;

public class Kruskal {
    private Queue<Edge> mst = new Queue<Edge>();
    public Kruskal(EdgeWeightedGraph G) {
        MinPQ<Edge> pq = new MinPQ<Edge>();
        for (Edge e : G.edges()) pq.insert(e);
        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.delMin(); // Get min weight edge on pq
            int v = e.either(), w = e.other(v); // and its vertices
            if (uf.connected(v, w)) continue; // Ignore ineligible edges
            uf.union(v, w); // Merge components
            mst.enqueue(e); // Add edge to mst
        }
    }
    public Iterable<Edge> edges() {
        return mst;
    }

}
