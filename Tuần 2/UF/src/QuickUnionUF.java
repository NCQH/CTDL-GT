package UF;

public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public int find(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
    public void union(int p, int q) {
        int i = find(q);
        int j = find(p);
        id[i] = j;
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}
