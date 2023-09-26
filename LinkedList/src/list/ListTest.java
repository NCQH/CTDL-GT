package list;

public class ListTest {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        System.out.println(list.print());  // []

        list.append("Three");
        System.out.println(list.print());  // [Three ]

        list.addFirst("One");
        System.out.println(list.print());  // [One Three ]

        list.addFirst("Two");
        System.out.println(list.print());  // [Two One Three ]

        list.append("Two");
        System.out.println(list.print());  // [Two One Three Two ]

        list.append("Three");
        System.out.println(list.print());  // [Two One Three Two Three ]

        list.deleteFirst("Three");
        System.out.println(list.print());  // [Two One Two Three ]

        list.insertAfter("Four", "One");
        System.out.println(list.print());  // [Two One Four Two Three ]
    }
}
