public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;
    public MaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity+1];
    }
    public Key delMax() {

    }
    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }
    private void insert(Key x) {

    }
    private void sink(int k) {

    }
}
