package ex_04;

import ex_02.CustomStack;
import ex_02.Stack;

public class Calculator {

    private final static int STACK_SIZE = 20;

    private String expression;
    private Stack<Integer> stack;

    public Calculator(String expression) {
        this.expression = InfixToPostfixConverter.convert(expression);
        stack = new CustomStack<>(STACK_SIZE);
    }

    /**
     * Вычисляет значение выражения с помощью обратной польской нотации и стека
     * @return значение выражения
     */
    public int calculate() {
        throw new UnsupportedOperationException("Не реализовано");
    }
}
