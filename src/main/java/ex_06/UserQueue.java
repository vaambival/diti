package ex_06;

import java.util.ArrayDeque;
import java.util.Queue;

public class UserQueue {
    private final Queue<User> users = new ArrayDeque<>();

    public void offer(User user) {
        users.offer(user);
    }

    public boolean isEmpty() {
        return users.isEmpty();
    }


    public User poll() {
        return users.poll();
    }

    public void waiting() {
        for (User user : users) {
            user.waitInQueue();
        }
    }
}
