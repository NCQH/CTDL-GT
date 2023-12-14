public class SeparateChaining<Key, Value> {
    private int M = 97; // number of chains
    private Node[] st = new Node[M]; // array of chains

    private static class Node {
        private Object key;
        private Object val;
        private Node next;

        public Node(Object key, Object val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public Value get(Key key) { // See Algorithm 3.2
        int i = hash(key);
        for (Node x = st[i]; x != null; x = x.next) // Search for key, return associated value.
            if (key.equals(x.key))
                return (Value) x.val; // search hit
        return null; // search miss
    }

    public void put(Key key, Value val) { // See Algorithm 3.3
        int i = hash(key);
        for (Node x = st[i]; x != null; x = x.next) // Search for key. Update value if found; grow table if new.
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        st[i] = new Node(key, val, st[i]); // Search miss: add new node.
    }
}
