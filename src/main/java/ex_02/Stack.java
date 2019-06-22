package ex_02;

public interface Stack<T> {
    boolean push(T elem);

    T pop();

    T peek();

    boolean isEmpty();

    boolean isFull();
}
