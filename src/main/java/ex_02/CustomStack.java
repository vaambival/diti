package ex_02;

public class CustomStack<T> implements Stack<T> {
    private Object[] stackArray;
    private int top;

    public CustomStack(int maxSize) {
        stackArray = new Object[maxSize];
        top = -1;
    }

    @Override
    public boolean push(T elem) {
        if (!isFull()) {
            stackArray[++top] = elem;
            return true;
        }
        //TODO: здесь по идее должен возникать StackOverflowError
        return false;
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            return (T) stackArray[top--];
        }
        return null;
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return (T) stackArray[top];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == stackArray.length - 1;
    }
}
