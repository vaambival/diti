package ex_03;

public class CustomQueue<T> implements Queue<T> {
    private Object[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CustomQueue(int maxSize) {
        queueArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    @Override
    public boolean insert(T elem) {
        if (isFull()) {
            return false;
        }
        if (queueArray.length - 1 == rear) {
            rear = -1;
        }
        queueArray[++rear] = elem;
        nItems++;
        return true;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T elem = (T) queueArray[front++];
        if (front == queueArray.length) {
            front = 0;
        }
        nItems--;
        return elem;
    }

    @Override
    public T peekFront() {
        if (isEmpty()) {
            return null;
        }
        return (T) queueArray[front];
    }

    @Override
    public boolean isEmpty() {
        return nItems == 0;
    }

    @Override
    public boolean isFull() {
        return nItems == queueArray.length;
    }

    @Override
    public int size() {
        return nItems;
    }
}
