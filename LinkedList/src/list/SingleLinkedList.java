package list;

public class SingleLinkedList<Item> {
    private Node<Item> head;
    public static class Node<Item> { // inner class
        Item data;
        Node<Item> next;

        public Node(Item data, Node<Item> next) {
            this.data = data;
            this.next = next;
        }
    }

    public void append(Item data) {
        head = append(data, head);
    }
    public String toString() {
        return "[" + toString(head) + "]"
    }
    public void nonRecursiveRemoveFirst(Item data) {
        if (head == null) return;
        if (head.data.equals(data)) head = head.next;
        else {
            Node<Item> node = head;
            while (node.next != null && !node.next.data.equals(data)) node = node.next;
            if (node.next != null) {
                node.next = node.next.next;
            }
        }
    }
    public void removeFirst(Item data) {

    }
    private Node<Item> removeFirst(Node<Item> node) {
        if (node == null) return new Node<>(node, null);

    }
    private String toString(Node<Item> node) {
        if (node == null) return "";
        return node.data + " " + toString(node.data);
    }
    private Node<Item> append(Item data, Node<Item> node) {
        if (node == null) return new Node<>(data, null);
        node.next = append(data, next);
        return node;
    }
}
