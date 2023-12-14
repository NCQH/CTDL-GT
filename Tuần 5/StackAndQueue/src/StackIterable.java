public class StackIterable<T> implements Iterable<T> {
    private T[] stack;
    private int top;
    private int capacity;

    public StackIterable(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1;
    }
    public void push(T data) {
        stack[++top] = data;
    }

    public T pop() {
        return stack[top--];
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        private int i = top;
        public boolean hasNext() {
            return i > 0;
        }
        public T next() {
            return stack[i--];
        }
        public void remove() {
        }
    }
}
