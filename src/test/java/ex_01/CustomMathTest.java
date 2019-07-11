package ex_01;

import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomMathTest {

    @Test
    void simpleTest() {
        assertThat(CustomMath.sqrt(1)).isEqualTo(1);
        assertThat(CustomMath.sqrt(2)).isEqualTo(Math.sqrt(2));
        assertThat(CustomMath.sqrt(4)).isEqualTo(2);

        assertThrows(IllegalArgumentException.class, () -> CustomMath.sqrt(-2),
            "Expected non-negative number, got -2");

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            double n = Math.random() * random.nextInt(1000);

            assertThat(CustomMath.sqrt(n)).isEqualTo(Math.sqrt(n));

            assertThrows(IllegalArgumentException.class, () -> CustomMath.sqrt(-n - 1),
                "Expected non-negative number, got " + (-n - 1));
        }
    }
}
