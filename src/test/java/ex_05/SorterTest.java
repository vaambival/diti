package ex_05;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class SorterTest {

    @Test
    void randomTest() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int[] array = random.ints(10_000, 0, 10_000).toArray();
            int[] expected = array.clone();

            long start = System.nanoTime();

            Arrays.sort(expected);

            long firstEnd = System.nanoTime();

            Sorter.sort(array);

            long end = System.nanoTime();
            long frst = firstEnd - start;
            long scnd = end - firstEnd;
            if (frst / 100 - scnd / 100 > 100000) {
                fail("TooLong");
            }
            assertThat(array).containsExactly(expected);
        }
    }
}
