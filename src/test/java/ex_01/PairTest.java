package ex_01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class PairTest {

    @Test
    void simpleTest() {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        assertThat(pair.getFirst()).isEqualTo(1);
        assertThat(pair.getSecond()).isEqualTo("hello");

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        assertTrue(pair.equals(pair2));
        assertTrue(pair.hashCode() == pair2.hashCode());
    }

    @Test
    void nullableTest() {
        Pair<String, LocalDate> pair = Pair.of("Mark", null);
        Pair<String, LocalDate> nullFirst = Pair.of(null, LocalDate.now());
        Pair<String, LocalDate> clonePair = Pair.of("Mark", null);

        assertTrue(pair.getFirst().equals("Mark"));
        assertNull(pair.getSecond());

        assertNull(nullFirst.getFirst());
        assertNotNull(nullFirst.getSecond());

        assertNotEquals(pair, nullFirst);
        assertNotEquals(nullFirst, pair);

        assertEquals(pair, clonePair);
        assertEquals(pair.hashCode(), clonePair.hashCode());
    }

    @Test
    void privateConstructor() {
        Constructor<?>[] constructors = Pair.class.getDeclaredConstructors();
        assertThat(constructors).hasSize(1);

        Constructor<?> constructor = constructors[0];
        int modifiers = constructor.getModifiers();
        assertThat(modifiers).isEqualTo(Modifier.PRIVATE);
    }
}
