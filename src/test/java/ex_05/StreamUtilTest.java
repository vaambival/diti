package ex_05;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamUtilTest {

    @Test
    void randomTest() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            StreamUtil.findMinMax(random.ints(1000).boxed(), Comparator.naturalOrder(),
                (x, y) -> sb.append(x).append(y));
            assertThat(sb).isNotBlank();
            sb.delete(0, sb.length());
        }

        StreamUtil.findMinMax(Stream.empty(), null, (x, y) ->
            sb.append(Objects.isNull(x)).append(' ').append(Objects.isNull(x)));
        assertThat(sb.toString()).isEqualTo("true true");
    }
}
