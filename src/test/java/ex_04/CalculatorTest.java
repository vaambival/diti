package ex_04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    @DisplayName("Тест калькулятора")
    void calculateTest() {
        assertThat(new Calculator("1+2").calculate()).isEqualTo(3);
        assertThat(new Calculator("1-2").calculate()).isEqualTo(-1);
        assertThat(new Calculator("6/2").calculate()).isEqualTo(3);
        assertThat(new Calculator("1*2").calculate()).isEqualTo(2);

        assertThat(new Calculator("3*(4+5)-6/(1+2)").calculate()).isEqualTo(25);
        assertThat(new Calculator("2*3+4").calculate()).isEqualTo(10);
    }
}
