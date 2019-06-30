package ex_04;

import java.util.Arrays;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AsciiCharSequenceTest {

    @Test
    void simpleTest() {
//        byte[] example = {72, 101, 108, 108, 111, 33};
//        AsciiCharSequence sequence = new AsciiCharSequence(example);
//        assertThat(sequence.toString()).isEqualTo("Hello!");
//        assertThat(sequence.length()).isEqualTo(6);
//        assertThat(sequence.charAt(1)).isEqualTo('e');
//        assertThat(sequence.subSequence(1, 5))
//            .isEqualTo(new AsciiCharSequence(Arrays.copyOfRange(example, 1, 5)));
//        example[0] = 74;
//        assertThat(sequence.toString()).isEqualTo("Hello!");
//
//        assertThrows(IndexOutOfBoundsException.class, () -> sequence.charAt(-3));
//        assertThrows(IndexOutOfBoundsException.class, () -> sequence.charAt(7));
//        assertThrows(IndexOutOfBoundsException.class, () -> sequence.subSequence(-1, 3));
//        assertThrows(IndexOutOfBoundsException.class, () -> sequence.subSequence(1, -3));
//        assertThrows(IndexOutOfBoundsException.class, () -> sequence.subSequence(11, 3));
//        assertThrows(IndexOutOfBoundsException.class, () -> sequence.subSequence(3, 9));
//
//        assertThat(sequence.subSequence(0, sequence.length())).isSameAs(sequence);
    }

    @Test
    void randomTest() {
//        Random random = new Random();
//        for (int i = 0; i < 1000; i++) {
//            String expected = RandomStringUtils.randomAlphanumeric(1, 1024);
//            byte[] example = expected.getBytes();
//            AsciiCharSequence sequence = new AsciiCharSequence(example);
//
//            assertThat(sequence.toString()).isEqualTo(expected);
//            assertThat(sequence.length()).isEqualTo(expected.length());
//            assertThat(sequence.charAt(i % expected.length())).isEqualTo(expected.charAt(i % expected.length()));
//
//            int start = random.nextInt(expected.length());
//            int end = start + random.nextInt(expected.length() - start);
//            assertThat(sequence.subSequence(start, end))
//                .isEqualTo(new AsciiCharSequence(Arrays.copyOfRange(example, start, end)));
//            example[0] = 74;
//            assertThat(sequence.toString()).isEqualTo(expected);
//
//            assertThrows(IndexOutOfBoundsException.class, () -> sequence.charAt(-expected.length()));
//            assertThrows(IndexOutOfBoundsException.class, () -> sequence.charAt(expected.length() + 3));
//            assertThrows(IndexOutOfBoundsException.class, () -> sequence.subSequence(-end, 34));
//            assertThrows(IndexOutOfBoundsException.class, () -> sequence.subSequence(start, -3));
//            assertThrows(IndexOutOfBoundsException.class, () -> sequence.subSequence(end + 1, start));
//            assertThrows(IndexOutOfBoundsException.class, () -> sequence.subSequence(3, expected.length() + 1));
//
//            assertThat(sequence.subSequence(0, sequence.length())).isSameAs(sequence);
//        }
    }
}
