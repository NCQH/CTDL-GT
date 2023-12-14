public class LinkedStack<T> {
    private Node<T> top;

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedStack() {
        top = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        T x = top.data;
        top = top.next;
        return x;
    }
    public boolean isEmpty() {
        return top == null;
    }
}
