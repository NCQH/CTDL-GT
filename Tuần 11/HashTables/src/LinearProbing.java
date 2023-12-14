public class LinearProbing<Key, Value> {
    private int M = 30001; // size of hash table
    private Value[] vals = (Value[]) new Object[M];
    private Key[] keys = (Key[]) new Object[M];

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void put(Key key, Value val) { // See Algorithm 3.4
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % M) // Search for empty position.
            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }
        keys[i] = key; // Found: update value.
        vals[i] = val;
    }

    public Value get(Key key) { // See Algorithm 3.5
        for (int i = hash(key); keys[i] != null; i = (i + 1) % M) // Search for key. See Exercise 3.4.19.
            if (key.equals(keys[i]))
                return vals[i]; // search hit
        return null; // search miss
    }
}
