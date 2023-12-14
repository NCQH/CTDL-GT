public class ResizingArrayStack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    public ResizingArrayStack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1;
    }
    public void push(T data) {
        if (top == capacity - 1) {
            resize(2 * capacity);
        }
        stack[++top] = data;
    }

    public T pop() {
        T x = stack[top--];
        if (top == capacity / 4) {
            resize(capacity / 2);
        }
        return x;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    private void resize(int newCapacity) {
        T[] newStack = (T[]) new Object[newCapacity];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;
    }
}
