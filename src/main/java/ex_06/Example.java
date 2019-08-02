package ex_06;

import java.util.Arrays;

public class Example {
    private static final int MIN_ARRIVE_INTERVAL = 1;
    private static final int MAX_ARRIVE_INTERVAL = 10;
    private static final int MIN_DURATION = 10;
    private static final int MAX_DURATION = 20;
    private static final int TELLERS_COUNT = 4;

    private static int COUNTER = 0;

    private static final int SIZE = 100;

    public static void main(String[] args) {
        Teller[] tellers = new Teller[TELLERS_COUNT];
        for (int i = 0; i < TELLERS_COUNT; i++) {
            tellers[i] = new Teller(MIN_DURATION, MAX_DURATION);
        }

        UserGenerator generator = new UserGenerator(MIN_ARRIVE_INTERVAL, MAX_ARRIVE_INTERVAL);
        UserQueue clients = new UserQueue();
        int[] waitings = new int[SIZE];
        while (COUNTER != SIZE) {
            if (generator.generate()) {
                clients.offer(new User(++COUNTER));
                System.out.println("Come " + COUNTER);
            }

            for (Teller teller : tellers) {
                if (teller.isBusy()) {
                    teller.work();
                } else if (!clients.isEmpty()){
                    teller.startWork();
                    User client = clients.poll();
                    System.out.println("Outcome: " + client);
                    System.out.println("Wait: " + client.waitingValue());
                    waitings[COUNTER - 1] = client.waitingValue();
                }
            }
            clients.waiting();
        }

        //TODO: вывести среднее ожидание в очереди
    }
}
