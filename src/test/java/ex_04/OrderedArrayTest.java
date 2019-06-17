package ex_04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderedArrayTest {

    @Test
    @DisplayName("Проверка, что упорядоченный массив создается")
    void checkThatObjectIsCreated() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        assertThat(new OrderedArray(arr)).isNotNull();
    }

    @Test
    @DisplayName("Проверка, что выполняется проверка на упорядоченность")
    void checkValidating() {
        int[] notOrderedArray = new int[] {5, 1, 2, 3, 4};
        assertThrows(IllegalArgumentException.class, () -> new OrderedArray(notOrderedArray));
    }

    @Test
    @DisplayName("Проверка операций в пустом массиве")
    void checkFindInEmptyArr() {
        int[] emptyArray = new int[0];
        OrderedArray array = new OrderedArray(emptyArray);
        assertThat(array.find(3)).isEqualTo(-1);
        array.insert(5);
        assertThat(array.getNumbers()).containsExactly(5);
        assertThat(array.delete(6)).isFalse();
        assertThat(array.getNumbers()).containsExactly(5);
        assertThat(array.delete(5)).isTrue();
        assertThat(array.getNumbers()).isEmpty();
        assertThat(array.delete(5)).isFalse();
        assertThat(array.getNumbers()).isEmpty();
    }

    @Test
    @DisplayName("Проверка операций в массиве")
    void checkOrderedArray() {
        int[] arr = new int[]{1, 2, 5, 7, 9};
        OrderedArray array = new OrderedArray(arr);
        assertThat(array.find(0)).isEqualTo(-1);
        assertThat(array.find(1)).isEqualTo(0);
        assertThat(array.find(2)).isEqualTo(1);
        assertThat(array.find(3)).isEqualTo(-3);
        assertThat(array.find(4)).isEqualTo(-3);
        assertThat(array.find(5)).isEqualTo(2);
        assertThat(array.find(6)).isEqualTo(-4);
        assertThat(array.find(7)).isEqualTo(3);
        assertThat(array.find(8)).isEqualTo(-5);
        assertThat(array.find(9)).isEqualTo(4);
        assertThat(array.find(10)).isEqualTo(-6);
        assertThat(array.getNumbers()).containsExactly(arr);

        array.insert(3);
        array.insert(0);
        array.insert(10);
        assertThat(array.getNumbers()).containsExactly(0, 1, 2, 3, 5, 7, 9, 10);
        assertThat(array.delete(17)).isFalse();
        assertThat(array.getNumbers()).containsExactly(0, 1, 2, 3, 5, 7, 9, 10);
        assertThat(array.delete(3)).isTrue();
        assertThat(array.delete(10)).isTrue();
        assertThat(array.delete(0)).isTrue();
        assertThat(array.getNumbers()).containsExactly(arr);

        array.insert(1);
        array.insert(5);
        array.insert(9);
        assertThat(array.getNumbers()).containsExactly(1, 1, 2, 5, 5, 7, 9, 9);
        assertThat(array.delete(1)).isTrue();
        assertThat(array.delete(5)).isTrue();
        assertThat(array.delete(9)).isTrue();
        assertThat(array.getNumbers()).containsExactly(arr);
    }

    @Test
    @DisplayName("Проверка слияния двух массивов")
    void checkMergeArraysWithEqualLength() {
        int[] firstArr = new int[]{2, 4, 5, 7, 8};
        int[] secondArr = new int[] {3, 4, 6, 9, 11};
        OrderedArray first = new OrderedArray(firstArr);
        OrderedArray second = new OrderedArray(secondArr);

        OrderedArray result = first.merge(second);
        assertThat(first.getNumbers()).containsExactly(firstArr);
        assertThat(second.getNumbers()).containsExactly(secondArr);
        assertThat(result.getNumbers()).containsExactly(2, 3, 4, 4, 5, 6, 7, 8, 9, 11);

        OrderedArray anotherResult = second.merge(first);
        assertThat(result.getNumbers()).containsExactly(anotherResult.getNumbers());
    }

    @Test
    @DisplayName("Проверка слияния двух пустых массивов")
    void checkBothEmptyArraysMerge() {
        OrderedArray first = new OrderedArray(new int[0]);
        OrderedArray second = new OrderedArray(new int[0]);

        assertThat(first.merge(second).getNumbers()).isEmpty();
        assertThat(second.merge(first).getNumbers()).isEmpty();
    }

    @Test
    @DisplayName("Проверка слияния пустого и непустого массивов")
    void checkOneEmptyArrayMerge() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        OrderedArray first = new OrderedArray(new int[0]);
        OrderedArray second = new OrderedArray(arr);

        assertThat(first.merge(second).getNumbers()).containsExactly(arr);
        assertThat(second.merge(first).getNumbers()).containsExactly(arr);
    }

    @Test
    @DisplayName("Проверка слияния массивов разной длины")
    void checkDifferentLengthArrayMerge() {
        int[] firstArr = new int[]{2, 4, 5, 7, 8, 13, 19, 22};
        int[] secondArr = new int[] {0, 3, 4, 6, 9, 11};
        OrderedArray first = new OrderedArray(firstArr);
        OrderedArray second = new OrderedArray(secondArr);

        OrderedArray result = first.merge(second);
        assertThat(first.getNumbers()).containsExactly(firstArr);
        assertThat(second.getNumbers()).containsExactly(secondArr);
        assertThat(result.getNumbers()).containsExactly(0, 2, 3, 4, 4, 5, 6, 7, 8, 9, 11, 13, 19, 22);

        OrderedArray anotherResult = second.merge(first);
        assertThat(result.getNumbers()).containsExactly(anotherResult.getNumbers());
    }

    @Test
    @DisplayName("Проверка слияния непересекающихся по диапазону массивов")
    void checkArrayMerge() {
        int[] firstArr = new int[]{2, 4, 5, 7, 8, 10};
        int[] secondArr = new int[] {13, 14, 16, 19, 111};
        OrderedArray first = new OrderedArray(firstArr);
        OrderedArray second = new OrderedArray(secondArr);

        OrderedArray result = first.merge(second);
        assertThat(first.getNumbers()).containsExactly(firstArr);
        assertThat(second.getNumbers()).containsExactly(secondArr);
        assertThat(result.getNumbers()).containsExactly(2, 4, 5, 7, 8, 10, 13, 14, 16, 19, 111);

        OrderedArray anotherResult = second.merge(first);
        assertThat(result.getNumbers()).containsExactly(anotherResult.getNumbers());
    }

    @Test
    @DisplayName("Проверка удаления дубликатов из пустого массива")
    void checkRemoveDupFromEmptyArr() {
        int[] empty = new int[0];
        OrderedArray emptyArr = new OrderedArray(empty);
        emptyArr.removeDuplicates();
        assertThat(emptyArr.getNumbers()).isEmpty();
    }

    @Test
    @DisplayName("Проверка удаления дубликатов из массива")
    void checkRemoveDupFromArr() {
        int[] arr = new int[]{1, 1, 2, 3, 5, 5, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 9, 11, 11, 11, 13, 13, 13, 13};
        OrderedArray orderedArray = new OrderedArray(arr);
        orderedArray.removeDuplicates();
        assertThat(orderedArray.getNumbers()).containsExactly(1, 2, 3, 5, 7, 9, 11, 13);
    }
}
