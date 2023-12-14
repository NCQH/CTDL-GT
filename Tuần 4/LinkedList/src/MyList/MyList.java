package MyList;

public interface MyList<T> {
    void insertAfter(T dataInsert, T nodeData);
    void addLast(T data);
    void addFirst(T data);
    T removeFirst();
}
