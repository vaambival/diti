package ex_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexNumberTest {
    @Test
    void complexNumberEqualsAndHashCode() {
        ComplexNumber firstComplexNumber = new ComplexNumber(1.1, 3.3);
        ComplexNumber secondComplexNumber = new ComplexNumber(1.1, 3.3);
        ComplexNumber thirdComplexNumber = new ComplexNumber(3.3, 1.1);

        assertEquals(firstComplexNumber, secondComplexNumber);
        assertNotEquals(null, firstComplexNumber);
        assertEquals(secondComplexNumber, firstComplexNumber);
        assertEquals(firstComplexNumber, firstComplexNumber);
        assertEquals(firstComplexNumber.hashCode(), secondComplexNumber.hashCode());
        assertNotEquals(firstComplexNumber, thirdComplexNumber);
        assertNotEquals(secondComplexNumber, thirdComplexNumber);
    }
}
