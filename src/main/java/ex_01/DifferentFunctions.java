package ex_01;

import java.math.BigInteger;
import lombok.experimental.UtilityClass;

@UtilityClass
public class DifferentFunctions {

    /**
     * Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
     * Во всех остальных случаях метод должен возвращать false.
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        //TODO: fix it
        return a && b && c && d;
    }

    /**
     * В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.
     * Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно.
     * @param year текущий год
     * @return количество високосных лет от 0-го года до года year
     */
    public static int leapYearCount(int year) {
        //TODO: fix it
        return year;
    }

    /**
     * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
     * Допустимая погрешность – 0.0001 (1E-4)
     *
     * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean doubleExpression(double a, double b, double c) {
        //TODO: fix it
        return a + b == c;
    }

    /**
     * Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
     * Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая).
     * При определении "палиндромности" строки должны учитываться только буквы и цифры.
     * А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
     * Гарантируется, что в метод попадают только строки,
     * состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
     * Т.е. русских, китайских и прочих экзотических символов в строке не будет.
     *
     * Подсказки (не читайте, если хотите решить сами):
     *
     * 1. для удаления из строки всех символов, не являющихся буквами и цифрами,
     * можно воспользоваться регулярным выражением "[^a-zA-Z0-9]";
     * найдите в классе String метод, выполняющий замену по регулярному выражению;
     * 2. для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(),
     * который находится в классе StringBuilder;
     * 3. в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        return false;
    }

    /**
     * Реализуйте метод, вычисляющий факториал заданного натурального числа.
     *
     * Факториал N вычисляется как 1⋅2⋅...⋅N.
     *
     * Поскольку это очень быстро растущая функция, то даже для небольших N вместимости
     * типов int и long очень скоро не хватит.
     * Поэтому будем использовать BigInteger.
     * @param value
     * @return
     */
    public static BigInteger factorial(int value) {
        return BigInteger.ONE;
    }
}