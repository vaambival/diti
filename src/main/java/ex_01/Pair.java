package ex_01;

import java.util.Objects;

/**
 * Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий
 * элементам принимать значение null.
 *
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of().
 * Конструктор должен быть закрытым (private).
 */
public class Pair<T, V> {

    public T getFirst() {
        throw new UnsupportedOperationException();
    }

    public V getSecond() {
        throw new UnsupportedOperationException();
    }

    Pair(T first, V second) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    public static<T, V> Pair of(T first, V second) {
        throw new UnsupportedOperationException();
    }
}
