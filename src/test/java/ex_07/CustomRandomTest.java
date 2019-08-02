package ex_07;

import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class CustomRandomTest {

    @Test
    void simpleTest() {
        Random random = new Random();
        final int size = 100_000;
        int countBoards = 0;
        for (int i = 0; i < size; i++) {
            int b = random.nextInt(1_000_000) + 1;
            int a = random.nextInt(b);

            int result = CustomRandom.random(a, b);
            assertThat(result).isLessThanOrEqualTo(b).isGreaterThanOrEqualTo(a);
            if (result == a || result == b) {
                countBoards++;
            }
        }
        if (countBoards == 2 * (int) Math.ceil(Math.log(size) / Math.log(2))) {
            fail("Often uses boards");
        }
    }
}
