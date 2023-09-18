package list;

public class MyLinkedList {
    private MyNode head;
    public MyLinkedList() {

    }
    public void addFirst(String data) {
        MyNode newNode = new MyNode(data, head);
        head = newNode;
    }
    public void append(String data) {
        MyNode node;
        node = head;
        if (node == null) {
            head = new MyNode(data, null);
        } else {
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new MyNode(data, null));
        }
    }
    public String print() {
        // Duyet DSLK
        String result = "";
        MyNode node = head;
        while (node != null) {
            result = result + node.getData() + " ";
            node = node.getNext();
        }
        return result;
    }
}
