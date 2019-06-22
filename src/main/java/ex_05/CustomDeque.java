package ex_05;

public class CustomDeque<T> implements Deque<T> {
    private Object[] dequeueArray;
    private int front;
    private int rear;

    public CustomDeque(int size) {
        dequeueArray = new Object[size];
        front = 0;
        rear = -1;
    }

    @Override
    public boolean insertFirst(T elem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean insertLast(T elem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException();
    }
}
