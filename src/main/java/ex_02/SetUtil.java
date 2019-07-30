package ex_02;

import java.util.HashSet;
import java.util.Set;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SetUtil {

    /**
     * Реализуйте метод, вычисляющий симметрическую разность (https://ru.wikipedia.org/wiki/Симметрическая_разность) двух множеств.
     *
     * Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
     *
     * Пример
     *
     * Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
     */
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        result.removeAll(intersection);
        return result;
    }
}
