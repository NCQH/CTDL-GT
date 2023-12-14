package UF;

public class WeightedQuickUnionWithPathUF implements UFInterface{
    private int[] id;
    private int[] sz;

    public WeightedQuickUnionWithPathUF(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
    public int find(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
    public void union(int p, int q) {
        int i = find(q);
        int j = find(p);

        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}
