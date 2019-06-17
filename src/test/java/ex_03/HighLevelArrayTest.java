package ex_03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class HighLevelArrayTest {
    @Test
    @DisplayName("Удаление максимального элемента из пустого массива")
    void removeMaxFromEmpty() {
        int[] actual = new int[0];
        HighLevelArray highLevelArray = new HighLevelArray(actual);

        assertThat(highLevelArray.removeMax()).isEqualTo(-1);
        assertThat(highLevelArray.getNumbers()).isEmpty();
    }

    @Test
    @DisplayName("Удаление максимального элемента из массива")
    void removeMax() {
        int[] forTest = new int[]{1, 2, 3, 4, 5};
        HighLevelArray array = new HighLevelArray(forTest);
        assertThat(array.removeMax()).isEqualTo(5);
        assertThat(array.getNumbers()).containsExactly(new int[]{1, 2, 3, 4});
    }

    @Test
    @DisplayName("Удаление максимального элемента из массива с дубликатами")
    void removeMaxFromArrWithDuplicates() {
        int[] forTest = new int[]{1, 55, 3, 55, 5};
        HighLevelArray array = new HighLevelArray(forTest);
        assertThat(array.removeMax()).isEqualTo(55);
        assertThat(array.getNumbers()).containsExactly(new int[]{1, 3, 55, 5});
    }

    @Test
    @DisplayName("Проверка сортировки пустого массива")
    void sortEmptyArray() {
        int[] emptyArr = new int[0];
        HighLevelArray array = new HighLevelArray(emptyArr);
        assertThat(array.sortedArray()).isEmpty();
    }

    @Test
    @DisplayName("Проверка сортировки массива")
    void sortArray() {
        int[] arr = new int[]{5, 3, 2, 9, 7, 11, 2};
        HighLevelArray array = new HighLevelArray(arr);
        HighLevelArray arraySpy = spy(array);

        assertThat(arraySpy.sortedArray()).containsExactly(new int[] {2, 2, 3, 5, 7, 9, 11});
        verify(arraySpy, times(7)).removeMax();
    }
}
