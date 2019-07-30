package ex_02;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SetUtilTest {

    @Test
    void simpleTest() {
        Set<String> first = new HashSet<>();
        first.add("one");
        first.add("two");
        first.add("three");

        Set<String> second = new HashSet<>();
        second.add("one");
        second.add("five");
        second.add("three");

        assertThat(SetUtil.symmetricDifference(first, second)).isEqualTo(SetUtil.symmetricDifference(second, first));
        assertThat(SetUtil.symmetricDifference(first, second)).containsExactlyInAnyOrder("two", "five");
        assertThat(first).hasSize(3);
        assertThat(second).hasSize(3);
        assertThat(first).isNotEqualTo(second);
        assertThat(first).containsExactlyInAnyOrder("one", "two", "three");
        assertThat(second).containsExactlyInAnyOrder("one", "five", "three");
    }

    @Test
    void intTest() {
        Set<Integer> first = new HashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);

        Set<Integer> second = new HashSet<>();
        second.add(0);
        second.add(1);
        second.add(2);

        assertThat(SetUtil.symmetricDifference(first, second)).isEqualTo(SetUtil.symmetricDifference(second, first));
        assertThat(SetUtil.symmetricDifference(first, second)).containsExactlyInAnyOrder(0, 3);
    }

    @Test
    void boardTest() {
        Set<Integer> first = new HashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);

        Set<Integer> empty = new HashSet<>();

        assertThat(SetUtil.symmetricDifference(first, first)).isEmpty();
        assertThat(SetUtil.symmetricDifference(first, empty)).isEqualTo(first);
        assertThat(SetUtil.symmetricDifference(empty, first)).isEqualTo(first);
    }
}
