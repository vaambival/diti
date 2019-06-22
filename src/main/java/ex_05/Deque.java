package ex_05;

public interface Deque<T> {

    boolean insertFirst(T elem);

    boolean insertLast(T elem);

    T removeFirst();

    T removeLast();

    boolean isEmpty();

    boolean isFull();
}
