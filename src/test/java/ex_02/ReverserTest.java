package ex_02;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverserTest {
    private final Random random = new Random();

    @Test
    @DisplayName("Тестирование реверсирования строки")
    void reverseTest() {
        for (int i = 0; i < 1000; i++) {
            int length = random.nextInt(50);
            String original = RandomStringUtils.randomAlphanumeric(length);
            String reversed = new StringBuilder(original).reverse().toString();
            assertThat(Reverser.reverse(original)).isEqualTo(reversed);
        }
    }
}
