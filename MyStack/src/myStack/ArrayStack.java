package myStack;

public class ArrayStack<Item> {
    private Item[] item;

    public ArrayStack() {
        item = new Item[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item piteam) {
        if (N == item.length) resize(2 * item.length);
        item[N++] = piteam;
    }

    private void resize(int capacity) {
        Item[] copy = new Item[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = item[i];
        }
        item = copy;
    }
    public Item pop() {
        Item pitem = item[--N];
        item[N] = null;
        if (N > 0 && N == item.length/4) resize(item.length/2);
        return pitem;
    }

}
