package ex_06;

public class LinkedList<T> implements List<T> {

    private Link<T> first;
    private int size;

    public LinkedList() {
        this.size = 0;
        first = null;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void insertFirst(T elem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T deleteFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T find(T key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T delete(T key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }

    private static class Link<T> {
        T data;
        Link<T> next;

        public Link(T data) {
            this.data = data;
        }
    }
}
