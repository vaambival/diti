package ex_03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.byLessThan;

public class AreaCalculatorTest {

    @Test
    void areaCalculatorTest() {
        assertThat(AreaCalculator.integrate(x -> 1, 0, 10))
            .isCloseTo(10.0, byLessThan(1e-5));
        assertThat(AreaCalculator.integrate(x -> x + 2, 0, 10))
            .isCloseTo(70.0, byLessThan(1e-5));
        assertThat(AreaCalculator.integrate(x -> Math.sin(x) / x, 1, 5))
            .isCloseTo(0.603848, byLessThan(1e-5));
        assertThat(AreaCalculator.integrate(x -> Math.sqrt(x + 1), 0, 7))
            .isCloseTo(14.418277, byLessThan(1e-5));
    }
}
