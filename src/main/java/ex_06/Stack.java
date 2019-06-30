package ex_06;

public interface Stack<T> {
    boolean push(T elem);

    T pop();

    T peek();

    boolean isEmpty();

    int size();
}
