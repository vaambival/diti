package ex_05;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CustomDequeTest {
    @Test
    @DisplayName("Тест 2-сторонней очереди")
    void dequeTest() {
        Deque<String> deque = new CustomDeque<>(5);

        for (int i = 0; i < 1000; i++) {

            assertTrue(deque.isEmpty());
            assertFalse(deque.isFull());
            assertThrows(NoSuchElementException.class, deque::removeFirst);
            assertThrows(NoSuchElementException.class, deque::removeLast);

            assertTrue(deque.insertFirst("First"));
            assertTrue(deque.insertLast("Last"));

            assertFalse(deque.isEmpty());
            assertFalse(deque.isFull());

            assertThat(deque.removeFirst()).isEqualTo("First");
            assertThat(deque.removeFirst()).isEqualTo("Last");

            assertTrue(deque.isEmpty());
            assertThrows(NoSuchElementException.class, deque::removeFirst);
            assertThrows(NoSuchElementException.class, deque::removeLast);

            assertTrue(deque.insertLast("1"));
            assertTrue(deque.insertLast("2"));
            assertTrue(deque.insertLast("3"));
            assertTrue(deque.insertLast("4"));
            assertTrue(deque.insertLast("5"));
            assertFalse(deque.insertLast("10"));
            assertFalse(deque.insertFirst("10"));

            assertFalse(deque.isEmpty());
            assertTrue(deque.isFull());

            assertThat(deque.removeLast()).isEqualTo("5");
            assertThat(deque.removeFirst()).isEqualTo("1");
            assertThat(deque.removeLast()).isEqualTo("4");
            assertThat(deque.removeFirst()).isEqualTo("2");
            assertThat(deque.removeFirst()).isEqualTo("3");
        }
    }
}
