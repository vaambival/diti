package ex_04;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomStreamUtilTest {

    @Test
    void simpleTest_01() {
        val expected = new int[]{13, 16, 25, 62, 384, 745, 502, 200, 0, 0, 0, 0};
        val actual = RandomStreamUtil.pseudoRandomStream(13);
        assertThat(actual.limit(expected.length).toArray()).containsExactly(expected);
    }

    @Test
    void simpleTest_02() {
        val expected = new int[]{0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            expected[0] = i;
            val actual = RandomStreamUtil.pseudoRandomStream(i);
            assertThat(actual.limit(expected.length).toArray()).containsExactly(expected);
        }
    }

    @Test
    void simpleTest_03() {
        for (int i = 4, k = 1; i < 7; i++, k++) {
            val expected = new int[]{i, k, 0, 0, 0, 0};
            val actual = RandomStreamUtil.pseudoRandomStream(i);
            assertThat(actual.limit(expected.length).toArray()).containsExactly(expected);
        }

        val expected = new int[]{7, 4, 1, 0, 0, 0};
        val actual = RandomStreamUtil.pseudoRandomStream(7);
        assertThat(actual.limit(expected.length).toArray()).containsExactly(expected);
    }

    @Test
    void simpleTest_04() {
        val expected = new int[]{45, 202, 80, 640, 960, 160, 560, 360, 960, 160, 560, 360, 960, 160, 560};
        val actual = RandomStreamUtil.pseudoRandomStream(45);
        assertThat(actual.limit(expected.length).toArray()).containsExactly(expected);
    }

    @Test
    void simpleTest_05() {
        val expected = new int[]{1749, 900, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        val actual = RandomStreamUtil.pseudoRandomStream(1749);
        assertThat(actual.limit(expected.length).toArray()).containsExactly(expected);
    }

    @Test
    void simpleTest_06() {
        val expected = new int[]{1111111, 36, 129, 664, 89, 792, 726, 707, 984, 825, 62, 384, 745, 502, 200, 0, 0 ,0};
        val actual = RandomStreamUtil.pseudoRandomStream(1111111);
        assertThat(actual.limit(expected.length).toArray()).containsExactly(expected);
    }
}
