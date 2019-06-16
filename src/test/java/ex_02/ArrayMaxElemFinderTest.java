package ex_02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayMaxElemFinderTest {

    @Test
    @DisplayName("Поиск в пустом массиве")
    void searchEmpty() {
        assertThat(ArrayMaxElemFinder.getMax(new int[0])).isEqualTo(-1);
    }

    @Test
    @DisplayName("Поиск в непустом массиве")
    void searchAscArray() {
        assertThat(ArrayMaxElemFinder.getMax(new int[]{1, 2, 3, 4, 5})).isEqualTo(5);
    }

    @Test
    @DisplayName("Поиск в массиве с дубликатами")
    void searchWithDuplicateArray() {
        assertThat(ArrayMaxElemFinder.getMax(new int[]{1, 55, 3, 55, 5})).isEqualTo(55);
    }
}
