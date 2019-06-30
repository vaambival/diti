package ex_06;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {

    @Test
    void emptyListTest() {
        List<String> lst = new LinkedList<>();

        assertThat(lst.delete("Hello")).isNull();
        assertThat(lst.deleteFirst()).isNull();
        assertThat(lst.find("Hello")).isNull();
        assertTrue(lst.isEmpty());
        assertThat(lst.toString()).isEqualTo("{}");
        assertThat(lst.size()).isEqualTo(0);

        lst.insertFirst("Hello");
        assertThat(lst.size()).isEqualTo(1);
        assertFalse(lst.isEmpty());
        assertThat(lst.toString()).isEqualTo("{Hello}");
    }

    @Test
    void listTest() {
        List<Integer> lst = new LinkedList<>();
        lst.insertFirst(1);
        lst.insertFirst(2);
        lst.insertFirst(3);
        lst.insertFirst(4);
        lst.insertFirst(5);

        assertThat(lst.toString()).isEqualTo("{5, 4, 3, 2, 1}");
        assertFalse(lst.isEmpty());
        assertThat(lst.size()).isEqualTo(5);

        assertThat(lst.find(6)).isNull();
        assertThat(lst.delete(6)).isNull();

        assertThat(lst.toString()).isEqualTo("{5, 4, 3, 2, 1}");
        assertThat(lst.size()).isEqualTo(5);

        lst.insertFirst(6);

        assertThat(lst.toString()).isEqualTo("{6, 5, 4, 3, 2, 1}");
        assertFalse(lst.isEmpty());
        assertThat(lst.size()).isEqualTo(6);

        assertThat(lst.find(6)).isEqualTo(6);
        assertThat(lst.toString()).isEqualTo("{6, 5, 4, 3, 2, 1}");
        assertThat(lst.size()).isEqualTo(6);
        assertThat(lst.delete(6)).isEqualTo(6);

        assertThat(lst.toString()).isEqualTo("{5, 4, 3, 2, 1}");
        assertThat(lst.size()).isEqualTo(5);
    }
}
