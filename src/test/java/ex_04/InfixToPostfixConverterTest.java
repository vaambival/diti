package ex_04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InfixToPostfixConverterTest {
    @Test
    @DisplayName("Тестирование конвертации обычной записи в постфиксную (обратная польская нотация)")
    void testInfixToPostfix() {
        assertThat(InfixToPostfixConverter.convert("1+2-3")).isEqualTo("12+3-");
        assertThat(InfixToPostfixConverter.convert("1*2/3")).isEqualTo("12*3/");
        assertThat(InfixToPostfixConverter.convert("1+2*3")).isEqualTo("123*+");
        assertThat(InfixToPostfixConverter.convert("1*2-3")).isEqualTo("12*3-");
        assertThat(InfixToPostfixConverter.convert("1*(2-3)")).isEqualTo("123-*");
        assertThat(InfixToPostfixConverter.convert("1*2+3*4")).isEqualTo("12*34*+");
        assertThat(InfixToPostfixConverter.convert("(1+2)*(3-4)")).isEqualTo("12+34-*");
        assertThat(InfixToPostfixConverter.convert("((1+2)*3)-4")).isEqualTo("12+3*4-");
        assertThat(InfixToPostfixConverter.convert("1+2*(3-4/(5+6))")).isEqualTo("123456+/-*+");
    }
}
