package list;

public class LinkedListQueue<Item> {

    private static class Node<Item> {
        Item item;
        Node<Item> next;
    }

    private Node<Item> first;
    void enqueue(Item item) {
        Node<Item> oldlast = last;
        last = new Node<Item>; 
    }

    Item dequeue() {
        Item d_item = first.item;
        first = first.next;
        return d_item;
    }

    boolean isEmpty() {
        return true;
    }

    int size() {

    }
}
