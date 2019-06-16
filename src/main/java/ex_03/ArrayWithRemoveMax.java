package ex_03;

public class ArrayWithRemoveMax {
    private int[] numbers;

    public ArrayWithRemoveMax(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Функция удаления первого максимального элемента из массива
     * Можно использовать ArrayMaxElemFinder.getMax(int[]).
     * Совет: посмотреть в документации System.arraycopy
     * @return Максимальное значение среди элементов массива, которое будет удалено. Если массив пуст, то -1
     */
    public int removeMax() {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
