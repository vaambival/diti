package ex_05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TextCheckerTest {

    @Test
    @DisplayName("Тестирование анализаторов текста")
    void textCheckerSimpleTest() {
        String[] spamWords = new String[]{"hello", "prince", "money", "ilu"};
        TextAnalyzer[] textAnalyzers = new TextAnalyzer[]{
//            new SpamAnalyzer(spamWords),
//            new NegativeTextAnalyzer(),
//            new TooLongTextAnalyzer(512)
        };
        String okText = "Наверняка вы уже заметили, что SpamAnalyzer и NegativeTextAnalyzer во многом похожи – они оба " +
            "проверяют текст на наличие каких-либо ключевых слов (в случае спама мы получаем их из конструктора, " +
            "в случае негативного текста мы заранее знаем набор грустных смайликов) и в случае нахождения одного из " +
            "ключевых слов возвращают Label (SPAM и NEGATIVE_TEXT соответственно), а если ничего не нашлось – возвращают" +
            " OK.";

        assertThat(TextChecker.checkLabels(textAnalyzers, okText)).isEqualTo(Label.OK);

        String tooLongText = okText + okText;
        assertThat(TextChecker.checkLabels(textAnalyzers, tooLongText)).isEqualTo(Label.TOO_LONG);

        for (String smile : new String[]{":(", "=(", ":|"}) {
            String negativeText = okText + smile;
            assertThat(TextChecker.checkLabels(textAnalyzers, negativeText)).isEqualTo(Label.NEGATIVE_TEXT);
        }

        for (String spamWord : spamWords) {
            String spam = okText + spamWord;
            assertThat(TextChecker.checkLabels(textAnalyzers, spam)).isEqualTo(Label.SPAM);
        }
    }

    @Test
    void testStructure() {
//        Class spamAnalyzerClass = SpamAnalyzer.class;
//        assertDoesNotThrow(() -> spamAnalyzerClass.getDeclaredField("keywords"));

//        Class tooLongTextAnalyzerClass = TooLongTextAnalyzer.class;
//        assertDoesNotThrow(() -> tooLongTextAnalyzerClass.getDeclaredField("maxLength"));

//        Class negativeTextAnalyzerClass = NegativeTextAnalyzer.class;
//        assertThat(negativeTextAnalyzerClass.getSuperclass()).isEqualTo(KeywordAnalyzer.class);
//        assertThat(spamAnalyzerClass.getSuperclass()).isEqualTo(KeywordAnalyzer.class);
    }
}
