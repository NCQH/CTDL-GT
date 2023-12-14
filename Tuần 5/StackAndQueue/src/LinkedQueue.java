public class LinkedQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedQueue() {
        head = null;
        tail = null;
    }
    public void enqueue(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }
    public T dequeue() {
        T x = head.data;
        head = head.next;
        return x;
    }
    public boolean isEmpty() {
        return head == null;
    }
}
