package ex_04;

import java.util.*;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AnagramHelper {
    /**
     * Массив, внутри которого буквы слова
     */
    private static char[] wordArray;

    /**
     * Метод, который находит все анаграммы
     * @param word слово
     * @return множество уникальных анограм
     */
    public static Set<String> doAnagram(String word) {
        wordArray = word.toCharArray();

        return doAnagram(word.length());
    }

    /**
     * Метод, возвращающий множество анаграмм.
     * Параметр необходим для решения подзадач меньшего размера.
     * Если размер равен 1, то перестановки невозможны, и необходимо вернуть само слово.
     * Иначе n итераций, в каждой из которых надо решить задачу меньшего размера (для size - 1)
     * произвести циклический сдвиг
     * @param size размер массива
     * @return
     */
    private static Set<String> doAnagram(int size) {
        if (size == 1) {
            return Collections.singleton(new String(wordArray));
        }

        Set<String> result = new HashSet<>();
        for (int i = 0; i < size; i++) {
            result.addAll(doAnagram(size - 1));
            if (size == 2) {
                result.add(new String(wordArray));
            }
            rotate(size);
        }

        return result;
    }

    /**
     * Циклический сдвиг влево подмассива размера size
     * @param size
     */
    private static void rotate(int size) {
        throw new UnsupportedOperationException();
    }
}
