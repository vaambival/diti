package ex_03;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.val;
import org.junit.jupiter.api.Test;

import static ex_03.FunctionalUtil.ternaryOperator;
import static org.assertj.core.api.Assertions.assertThat;

public class FunctionUtilTest {

    @Test
    void simpleTest() {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        val lengths = Stream.of("Hello", "how", "what", "", "", null, null, "Please, give me coffee")
            .map(Objects.requireNonNull(safeStringLength))
            .collect(Collectors.toList());

        assertThat(lengths).containsExactly(5, 3, 4, 0, 0, 0, 0, "Please, give me coffee".length());

        Predicate<Integer> evenCondition = x -> Objects.nonNull(x) && x % 2 == 0;
        Function<Integer, String> even = x -> "Even " + x;
        Function<Integer, String> odd = x -> "Odd " + x;
        Function<Integer, String> parityDefiner = ternaryOperator(evenCondition, even, odd);

        val definitions = Stream.iterate(0, i -> ++i)
            .limit(10)
            .map(parityDefiner)
            .collect(Collectors.toList());
        val expectedResult = Stream.iterate(0, i -> ++i).limit(10).map(x -> {
            if (x % 2 == 0) {
                return "Even " + x;
            } else {
                return "Odd " + x;
            }
        }).collect(Collectors.toList()).toArray(new String[]{});
        assertThat(definitions).containsExactly(expectedResult);
    }
}
