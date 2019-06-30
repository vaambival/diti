package ex_06;

public class StackImpl<T> implements Stack<T> {
    private List<T> lst;

    public StackImpl() {
        lst = new LinkedList<>();
    }

    @Override
    public boolean push(T elem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T pop() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }
}
