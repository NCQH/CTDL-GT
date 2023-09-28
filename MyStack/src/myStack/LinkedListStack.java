package myStack;

public class LinkedListStack<Item> {
    private Node<Item> first = null;

    private static class Node<Item> {
        Item item;
        Node<Item> next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
    }
}
