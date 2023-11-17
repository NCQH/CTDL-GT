package graph;
import graph.Graph;

import java.util.Queue;

public class BFS {
    private boolean[] marked;
    private int[] edgeTo;

    private void bfs(Graph G, int s) {
        Queue<Integer> q = new Queue<Integer>();
        q.add(s);
        marked[s] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    q.add(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                }
            }
        }
    }
}
