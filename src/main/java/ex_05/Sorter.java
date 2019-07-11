package ex_05;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Sorter {
    /**
     * Сортировка слиянием
     * @param array
     */
    public static void sort(int[] array) {
        if (array.length == 1) {
            return;
        }
        //TODO: отсортировать левую половину
        //TODO: отсортировать правую половину
        //TODO: выполнить слияние половин массивов в исходный массив
    }

    /**
     * Слияние левого и правого массивов в исходный массив
     * @param array исходный массив
     * @param leftArr левый массив
     * @param rightArr правый массив
     */
    private static void merge(int[] array, int[] leftArr, int[] rightArr) {
        throw new UnsupportedOperationException();
    }
}
