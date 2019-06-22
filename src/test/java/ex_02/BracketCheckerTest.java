package ex_02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BracketCheckerTest {

    @Test
    @DisplayName("Тестирование BracketChecker")
    void testBracketChecker() {
        assertDoesNotThrow(() -> BracketChecker.check("c[d]"));
        assertDoesNotThrow(() -> BracketChecker.check("a{b[c]d}e"));
        assertDoesNotThrow(() -> BracketChecker.check("{{{{{[[[[((()))]]]]}}}}}"));
        assertThrows(IllegalArgumentException.class, () -> BracketChecker.check("a{b(c]d}e"));
        assertThrows(IllegalArgumentException.class, () -> BracketChecker.check("a[b{c}d]e}"));
        assertThrows(IllegalArgumentException.class, () -> BracketChecker.check("a{b(c)"));
        assertThrows(IllegalArgumentException.class, () -> BracketChecker.check("{{{{{[[[[((()))]]]]}}}}"));
    }
}
