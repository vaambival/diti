package ex_06;

public class User {
    private int waitInQueue;
    private int number;

    public User(int number) {
        this.number = number;
    }

    public void waitInQueue() {
        waitInQueue++;
    }

    public int waitingValue() {
        return waitInQueue;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
