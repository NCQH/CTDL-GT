import java.util.List;

public class RedBlackBSTs<Key extends Comparable<Key>, Value> {
    private static final boolean RED = false;
    private static final boolean BLACK = true;
    private Node root;
    private class Node {
        Key key;
        Value val;
        Node left, right;
        int N;
        boolean color;
        Node(Key key, Value val, int N, boolean color) {
            this.key = key; this.val = val; this.N = N; this.color = color;
        }
    }
    public void put(Key key, Value val) {
        root = put(root, key, val);
        root.color = BLACK;
    }
    private Node put(Node h, Key key, Value val) {
        if (h == null) return new Node(key, val, 1, RED);
        int cmp = key.compareTo(h.key);
        if      (cmp < 0) h.left = put(h.left, key, val);
        else if (cmp > 0) h.right = put(h.right, key, val);
        else              h.val = val;
        if (isRed(h.right) && !isRed(h.left))      h = rotateLeft(h);
        if (isRed(h.left)  &&  isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left)  &&  isRed(h.right))     flipColors(h);
        h.N = size(h.left) + size(h.right) + 1;
        return h;
    }
    public void get(Key key) {
        return get(root, key);
    }
    private Value get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else              return x.val;
    }
    private boolean isRed(Node x) {
        if (x == null) return false;
        return x.color == RED;
    }
    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left; x.left = h;
        x.color = h.color; h.color = RED;
        x.N = h.N; h.N = 1 + size(h.left) + size(h.right);
        return x;
    }
    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right; x.right = h;
        x.color = h.color; h.color = RED;
        x.N = h.N; h.N = 1 + size(h.left) + size(h.right);
        return x;
    }
    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }
    public List<Key> inOrder() {
        return inOrder(root);
    }
    private List<Key> inOrder(Node x) {
        if (x == null) return null;
        inOrder(x.left);
        System.out.println(x.key);
        inOrder(x.right);
    }
    public int size() {
        return size(root);
    }
    private int size(Node x) {
        if (x == null) return 0;
        else           return x.N;
    }

}
