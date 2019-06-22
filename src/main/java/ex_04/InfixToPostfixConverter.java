package ex_04;

import ex_02.CustomStack;
import ex_02.Stack;
import lombok.experimental.UtilityClass;

/**
 * Смотрите преобразование в постфиксную запись: http://natalia.appmat.ru/c&c++/postfisso.html
 */
@UtilityClass
public class InfixToPostfixConverter {
    private static class InToPost {
        private Stack<Character> stack;
        private StringBuilder result;
        private String expression;

        public InToPost(String expression) {
            stack = new CustomStack<>(expression.length());
            this.expression = expression;
            this.result = new StringBuilder(expression.length());
        }

        public String convert() {
            for (char ch : expression.toCharArray()) {
                switch (ch) {
                    case '+':
                    case '-':
                        gotOperator(ch, 1);
                        break;
                    case '*':
                    case '/':
                        gotOperator(ch, 2);
                        break;
                    case '(':
                        stack.push(ch);
                        break;
                    case ')':
                        gotParent();
                        break;
                    default: {
                        if (Character.isDigit(ch)) {
                            result.append(ch);
                        } else {
                            throw new IllegalArgumentException("Недопустимые символы в выражении");
                        }
                    }
                }
            }
            return stackToPostfixExpression();
        }

        private void gotParent() {
            while (!stack.isEmpty()) {
                char chx = stack.pop();
                if (chx == '(') {
                    break;
                } else {
                    result.append(chx);
                }
            }
        }

        private void gotOperator(char operator, int priority) {
            while (!stack.isEmpty()) {
                char topOperator = stack.pop();
                if (topOperator == '(') {
                    stack.push(topOperator);
                    break;
                } else {
                    int secondPriority = definePriority(topOperator);
                    if (secondPriority < priority) {
                        stack.push(topOperator);
                        break;
                    } else {
                        result.append(topOperator);
                    }
                }
            }
            stack.push(operator);
        }

        private int definePriority(char topOperator) {
            if (topOperator == '+' || topOperator == '-') {
                return 1;
            }
            return 2;
        }

        private String stackToPostfixExpression() {
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }
            return result.toString();
        }
    }

    public static String convert(String expression) {
        return new InToPost(expression).convert();
    }
}
