package ex_01;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomMath {

    /**
     * Реализуйте метод sqrt(), вычисляющий квадратный корень числа.
     * В отличие от Math.sqrt(), это метод при передаче отрицательного параметра должен бросать
     * исключение java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
     * где вместо вопросика будет подставлено фактически переданное в метод число.
     * @param x
     * @return корень из числа
     * @throws java.lang.IllegalArgumentException если аргумент отрицательный
     */
    public static double sqrt(double x) {
        throw new UnsupportedOperationException();
    }
}
