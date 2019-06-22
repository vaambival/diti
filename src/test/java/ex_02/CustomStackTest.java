package ex_02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CustomStackTest {

    @Test
    @DisplayName("Простой тест стека")
    void stackTest() {
        Stack<Long> stack = new CustomStack<>(5);

        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());
        assertNull(stack.peek());
        assertNull(stack.pop());
        assertTrue(stack.push(5L));

        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());
        assertThat(stack.peek()).isEqualTo(5L);
        assertThat(stack.pop()).isEqualTo(5L);

        assertTrue(stack.push(1L));
        assertTrue(stack.push(2L));
        assertTrue(stack.push(3L));
        assertTrue(stack.push(4L));
        assertTrue(stack.push(5L));

        assertFalse(stack.isEmpty());
        assertTrue(stack.isFull());
        assertFalse(stack.push(6L));
        assertThat(stack.pop()).isEqualTo(5L);
        assertThat(stack.pop()).isEqualTo(4L);
        assertThat(stack.pop()).isEqualTo(3L);
        assertThat(stack.pop()).isEqualTo(2L);
        assertThat(stack.pop()).isEqualTo(1L);
    }
}
