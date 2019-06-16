package ex_03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayWithRemoveMaxTest {
    @Test
    @DisplayName("Удаление максимального элемента из пустого массива")
    void removeMaxFromEmpty() {
        int[] actual = new int[0];
        ArrayWithRemoveMax arrayWithRemoveMax = new ArrayWithRemoveMax(actual);

        assertThat(arrayWithRemoveMax.removeMax()).isEqualTo(-1);
        assertThat(arrayWithRemoveMax.getNumbers()).isEmpty();
    }

    @Test
    @DisplayName("Удаление максимального элемента из массива")
    void removeMax() {
        int[] forTest = new int[]{1, 2, 3, 4, 5};
        ArrayWithRemoveMax array = new ArrayWithRemoveMax(forTest);
        assertThat(array.removeMax()).isEqualTo(5);
        assertThat(array.getNumbers()).containsExactly(new int[]{1, 2, 3, 4});
    }

    @Test
    @DisplayName("Удаление максимального элемента из массива с дубликатами")
    void removeMaxFromArrWithDuplicates() {
        int[] forTest = new int[]{1, 55, 3, 55, 5};
        ArrayWithRemoveMax array = new ArrayWithRemoveMax(forTest);
        assertThat(array.removeMax()).isEqualTo(55);
        assertThat(array.getNumbers()).containsExactly(new int[]{1, 3, 55, 5});
    }
}
