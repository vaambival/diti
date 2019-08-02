package ex_07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CustomRandom {
    private static final Random random = new Random();

    /**
     * Случайное число в диапазоне от a, до b включительно
     * @param a левая граница
     * @param b правая граница
     * @return a <= result <= b
     */
    public static int random(int a, int b) {
        return a;
    }

    private static int random() {
        return random.nextInt(2);
    }

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>(Comparator.nullsFirst(String::compareTo));
        map.put(null, "hello");
        System.out.println(map);
    }
}
