package MyList;

public class SingleLinkedList<T> {
    private Node<T> head;
    public static class Node<T>{
        private T data;
        private Node<T> next;
        public Node (T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
    public void addFirst(T data) {
        head = new Node<T>(data, head);
    }
    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertAfter(T dataInsert, T nodeData) {

    }
    public T removeFirst() {
        Node<T> oldHead = head;
        head = oldHead.next;
        oldHead = null;
    }
}
