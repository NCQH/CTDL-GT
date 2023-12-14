package MyList;

public class DoubleLinkedList<T> implements MyList<T> {
    private DoubleNode<T> head, trailer;
    public static class DoubleNode<T> {
        private T data;
        private DoubleNode<T> next, prev;

        public DoubleNode(T data, DoubleNode<T> prev, DoubleNode<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
    public DoubleLinkedList(DoubleNode<T> head, DoubleNode<T> trailer) {
        this.head.next = trailer;
        this.trailer.prev = head;
    }
    public void addFirst(T data) {

    }
    public void addLast(T data) {

    }
    public void insertAfter(T dataInsert, T nodeData) {

    }
    public T removeFirst() {

    }
}
