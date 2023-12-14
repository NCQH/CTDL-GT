public class MinPQ {
    private int[] pq;
    private int N;

    public MinPQ(int capacity) {
        pq = new int[capacity + 1];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(int x) {
        pq[++N] = x;
        swim(N);
    }

    public int delMin() {
        int min = pq[1];
        exch(1, N--);
        sink(1);
        return min;
    }

    private void swim(int k) {
        while (k > 1 && pq[k/2] > pq[k]) {
            exch(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && pq[j] > pq[j+1]) j++;
            if (pq[k] < pq[j]) break;
            exch(k, j);
            k = j;
        }
    }

    private void exch(int i, int j) {
        int swap = pq[i]; pq[i] = pq[j]; pq[j] = swap;
    }
}
