package list;

public class ListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println(list.print());

        list.append("Three");
        System.out.println(list.print());

        list.addFirst("One");
        System.out.println(list.print());

        list.addFirst("Two");
        System.out.println(list.print());

        list.append("Three");
        System.out.println(list.print());
    }
}
