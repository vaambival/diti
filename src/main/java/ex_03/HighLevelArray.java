package ex_03;

public class HighLevelArray {
    private int[] numbers;

    public HighLevelArray(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Функция удаления первого максимального элемента из массива
     * Использовать: removeElem(int pos)
     * Совет: посмотреть в документации System.arraycopy
     * @return Максимальное значение среди элементов массива, которое будет удалено. Если массив пуст, то -1
     */
    public int removeMax() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    /**
     * Отсортировать и вернуть отсортированный по возрастанию массив, используя метод removeMax.
     * @return Отсортированный массив
     */
    public int[] sortedArray() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    /**
     * Удаляем элемент из массива по указанной позиции
     * @param pos позиция, с которой будет удален элемент
     */
    private void removeElem(int pos) {
        if (pos < 0 || pos >= numbers.length) {
            throw new IndexOutOfBoundsException(
                String.format("Position %d is out of bounds: [0, %d)", pos, numbers.length)
            );
        }
        int[] updatedArray = new int[numbers.length - 1];
        System.arraycopy(numbers, 0, updatedArray, 0, pos);
        System.arraycopy(numbers, pos + 1, updatedArray, pos, updatedArray.length - pos);
        numbers = updatedArray;
    }
}
