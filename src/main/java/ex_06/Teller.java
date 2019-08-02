package ex_06;

public class Teller {
    private final int minimumTime;
    private final int maximumTime;
    private boolean isBusy;
    private int time;

    public Teller(int minimumTime, int maximumTime) {
        if (maximumTime < minimumTime || minimumTime <= 0) {
            throw new IllegalArgumentException();
        }
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void startWork() {
        if (isBusy) {
            throw new RuntimeException("Already works");
        }
        isBusy = true;
        this.time = 0;
    }

    public void work() {
        if (!isBusy) {
            throw new RuntimeException("Not starting work");
        }
        this.time++;
        if (this.time == maximumTime) {
            isBusy = false;
        } else if (this.time < minimumTime) {
            return;
        } else {
            isBusy = Math.random() > .5;
        }
    }
}
