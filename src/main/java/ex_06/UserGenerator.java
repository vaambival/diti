package ex_06;

public class UserGenerator {
    private final int minimumTime;
    private final int maximumTime;
    private int time;

    public UserGenerator(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public boolean generate() {
        if (time == maximumTime) {
            time = 0;
            return true;
        }
        if (time >= minimumTime) {
            boolean result = Math.random() > .5;
            time = result ? 0 : time + 1;
            return result;
        }
        time++;
        return false;
    }
}
