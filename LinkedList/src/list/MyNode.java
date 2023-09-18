package list;

import java.lang.invoke.MethodHandle;

public class MyNode {
    private String data;
    private MyNode next;

    public MyNode() {

    }
    public MyNode(String data, MyNode next) {
        this.data = data;
        this.next = next;
    }
    public String getData() {
        return data;
    }
    public MyNode getNext() {
        return next;
    }
    public void setNext(MyNode p) { this.next = p; }
}
