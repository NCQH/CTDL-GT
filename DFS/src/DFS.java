public class DFS {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;
    
    public DFS(Graph G, int s) {
        
        dfs(G, s);
    }
    
    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj((v))) 
            if (!marked[w]) {
                dfs(G, w);
                edgeTo[w] = v;
            }
    }
}
