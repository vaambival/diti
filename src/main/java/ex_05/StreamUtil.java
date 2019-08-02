package ex_05;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StreamUtil {

    /**
     * Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
     *
     * Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
     *
     * minMaxConsumer.accept(min, max);
     * Если стрим не содержит элементов, то вызовите
     * minMaxConsumer.accept(null, null);
     * @param stream
     * @param order
     * @param minMaxConsumer
     * @param <T>
     */
    public static <T> void findMinMax(
        Stream<? extends T> stream,
        Comparator<? super T> order,
        BiConsumer<? super T, ? super T> minMaxConsumer) {

    }
}
