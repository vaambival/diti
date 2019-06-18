package ex_04;

public class OrderedArray {
    private int[] orderedArray;

    public OrderedArray(int[] orderedArray) {
        validate(orderedArray);
        this.orderedArray = orderedArray;
    }

    private void validate(int[] orderedArray) {
        for (int i = 1; i < orderedArray.length; i++) {
            if (orderedArray[i] < orderedArray[i - 1]) {
                throw new IllegalArgumentException("It's not ordered array");
            }
        }
    }

    public int[] getNumbers() {
        return orderedArray;
    }

    /**
     * Находит индекс искомого элемента. Используется бинарный поиск
     * @param searchKey значение, которое ищется
     * @return индекс искомого элемента, если такого нет, то возвращается инверсированный индекс (потенциальная позиция)
     * формула: pos = -result - 1, где pos - позиция, в которой бы находился элемент, будь он в массиве.
     * Пример:
     * 1 2 4 5 6
     * Ищем: 0 => результат: -1
     * Ищем: 3 => результат: -3
     * Ищем: 7 => результат: -6
     */
    public int find(int searchKey) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    /**
     * Вставить элемент в массив, сохраняя упорядоченность.
     * Подсказка: изменять массив подобно тому, как и в HighLevelArray
     * @param value Вставляемое значение
     */
    public void insert(int value) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    /**
     * Удалить элемент из массива, сохраняя упорядоченность.
     * Подсказка: изменять массив как и в HighLevelArray
     * @param key удаляемое значение
     * @return true - если элемент удален, false - если изначально такого элемента не было
     */
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    /**
     * Слияние двух массивов. В результате получается третий массив, а первые два остаются неизменными.
     * @param other Массив для слияния
     * @return Массив, получившийся в результате слияния
     */
    public OrderedArray merge(OrderedArray other) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    /**
     * Метод удаления дубликатов из массива
     */
    public void removeDuplicates() {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
