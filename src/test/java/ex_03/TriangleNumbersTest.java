package ex_03;

import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleNumbersTest {

    @Test
    void simpleTest() {
        assertThat(TriangleNumbers.triangleRecursive(5)).isEqualTo(15);
        assertThat(TriangleNumbers.triangleIterative(5)).isEqualTo(15);
        assertThat(TriangleNumbers.triangleConstantTime(5)).isEqualTo(15);

        assertThat(TriangleNumbers.triangleRecursive(4)).isEqualTo(10);
        assertThat(TriangleNumbers.triangleIterative(4)).isEqualTo(10);
        assertThat(TriangleNumbers.triangleConstantTime(4)).isEqualTo(10);

        assertThat(TriangleNumbers.triangleRecursive(3)).isEqualTo(6);
        assertThat(TriangleNumbers.triangleIterative(3)).isEqualTo(6);
        assertThat(TriangleNumbers.triangleConstantTime(3)).isEqualTo(6);

        assertThat(TriangleNumbers.triangleRecursive(2)).isEqualTo(3);
        assertThat(TriangleNumbers.triangleIterative(2)).isEqualTo(3);
        assertThat(TriangleNumbers.triangleConstantTime(2)).isEqualTo(3);

        assertThat(TriangleNumbers.triangleRecursive(1)).isEqualTo(1);
        assertThat(TriangleNumbers.triangleIterative(1)).isEqualTo(1);
        assertThat(TriangleNumbers.triangleConstantTime(1)).isEqualTo(1);

        assertThat(TriangleNumbers.triangleRecursive(0)).isEqualTo(0);
        assertThat(TriangleNumbers.triangleIterative(0)).isEqualTo(0);
        assertThat(TriangleNumbers.triangleConstantTime(0)).isEqualTo(0);

        assertThrows(IllegalArgumentException.class, () -> TriangleNumbers.triangleRecursive(-1));
        assertThrows(IllegalArgumentException.class, () -> TriangleNumbers.triangleIterative(-1));
        assertThrows(IllegalArgumentException.class, () -> TriangleNumbers.triangleConstantTime(-1));
    }

    @Test
    void randomTest() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int argument = random.nextInt(10_000) + 1;
            int result = TriangleNumbers.triangleRecursive(argument);
            assertThat(TriangleNumbers.triangleIterative(argument)).isEqualTo(result);
            assertThat(TriangleNumbers.triangleConstantTime(argument)).isEqualTo(result);

            assertThrows(IllegalArgumentException.class, () -> TriangleNumbers.triangleRecursive(-argument));
            assertThrows(IllegalArgumentException.class, () -> TriangleNumbers.triangleIterative(-argument));
            assertThrows(IllegalArgumentException.class, () -> TriangleNumbers.triangleConstantTime(-argument));
        }
    }
}
