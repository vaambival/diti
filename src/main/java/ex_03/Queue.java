package ex_03;

public interface Queue<T> {
    boolean insert(T elem);

    T remove();

    T peekFront();

    boolean isEmpty();

    boolean isFull();

    int size();
}
