public class FixedCapStack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    public FixedCapStack(int capacity) {
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
}
