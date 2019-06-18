package ex_01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DifferentFunctionsTest {

    @Test
    @DisplayName("Проверка работы с логическими выражениями")
    void testBooleanExpression() {
        assertFalse(DifferentFunctions.booleanExpression(false, false, false, false));
        assertFalse(DifferentFunctions.booleanExpression(false, false, false, true));
        assertFalse(DifferentFunctions.booleanExpression(false, false, true, false));
        assertTrue(DifferentFunctions.booleanExpression(false, false, true, true));
        assertFalse(DifferentFunctions.booleanExpression(false, true, false, false));
        assertTrue(DifferentFunctions.booleanExpression(false, true, false, true));
        assertTrue(DifferentFunctions.booleanExpression(false, true, true, false));
        assertFalse(DifferentFunctions.booleanExpression(false, true, true, true));
        assertFalse(DifferentFunctions.booleanExpression(true, false, false, false));
        assertTrue(DifferentFunctions.booleanExpression(true, false, false, true));
        assertTrue(DifferentFunctions.booleanExpression(true, false, true, false));
        assertFalse(DifferentFunctions.booleanExpression(true, false, true, true));
        assertTrue(DifferentFunctions.booleanExpression(true, true, false, false));
        assertFalse(DifferentFunctions.booleanExpression(true, true, false, true));
        assertFalse(DifferentFunctions.booleanExpression(true, true, true, false));
        assertFalse(DifferentFunctions.booleanExpression(true, true, true, true));
    }

    @Test
    @DisplayName("Проверка вычисления количества високосных лет")
    void leapYears() {
        assertThat(DifferentFunctions.leapYearCount(1000)).isEqualTo(242);
        assertThat(DifferentFunctions.leapYearCount(2020)).isEqualTo(490);
        assertThat(DifferentFunctions.leapYearCount(1)).isEqualTo(0);
        assertThat(DifferentFunctions.leapYearCount(4020)).isEqualTo(975);
    }

    @Test
    @DisplayName("Проверка double expression")
    void doubleExpression() {
        assertTrue(DifferentFunctions.doubleExpression(.1, .3, .400001));
        assertTrue(DifferentFunctions.doubleExpression(.2, .3, .2 + .3));
        assertFalse(DifferentFunctions.doubleExpression(.1, .3, .399));
    }

    @Test
    @DisplayName("Проверка палиндромов")
    void palindrome() {
        assertTrue(DifferentFunctions.isPalindrome("Too hot to hoot."));
        assertFalse(DifferentFunctions.isPalindrome("Abc def ghi jklm."));
        assertTrue(DifferentFunctions.isPalindrome("Madam, I'm Adam!"));
        assertFalse(DifferentFunctions.isPalindrome("Madam, I am Adam!"));
        assertTrue(DifferentFunctions.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(DifferentFunctions.isPalindrome("Eva, Can I Stab Bats In A Cave?"));
        assertTrue(DifferentFunctions.isPalindrome("A Man, A Plan, A Canal-Panama!"));
        assertTrue(DifferentFunctions.isPalindrome("Madam In Eden, I’m Adam"));
        assertTrue(DifferentFunctions.isPalindrome("Mr. Owl Ate My Metal Worm"));
        assertTrue(DifferentFunctions.isPalindrome("A Santa Lived As a Devil At NASA"));
        assertTrue(DifferentFunctions.isPalindrome(" Doc, Note: I Dissent. A Fast Never Prevents A Fatness. I Diet On Cod. "));
    }

    @Test
    @DisplayName("Факториал")
    void factorial() {
        assertThat(DifferentFunctions.factorial(1).toString()).isEqualTo("1");
        assertThat(DifferentFunctions.factorial(2).toString()).isEqualTo("2");
        assertThat(DifferentFunctions.factorial(3).toString()).isEqualTo("6");
        assertThat(DifferentFunctions.factorial(4).toString()).isEqualTo("24");
        assertThat(DifferentFunctions.factorial(5).toString()).isEqualTo("120");
        assertThat(DifferentFunctions.factorial(6).toString()).isEqualTo("720");
        assertThat(DifferentFunctions.factorial(7).toString()).isEqualTo("5040");
        assertThat(DifferentFunctions.factorial(8).toString()).isEqualTo("40320");
        assertThat(DifferentFunctions.factorial(16).toString()).isEqualTo("20922789888000");
        assertThat(DifferentFunctions.factorial(20).toString()).isEqualTo("2432902008176640000");
        assertThat(DifferentFunctions.factorial(35).toString()).isEqualTo("10333147966386144929666651337523200000000");
        assertThat(DifferentFunctions.factorial(44).toString()).isEqualTo("2658271574788448768043625811014615890319638528000000000");
        assertThat(DifferentFunctions.factorial(55).toString()).isEqualTo("12696403353658275925965100847566516959580321051449436762275840000000000000");
        assertThat(DifferentFunctions.factorial(255).toString()).isEqualTo("3350850684932979117652665123754814942022584063591740702576779884286208799035732771005626138126763314259280802118502282445926550135522251856727692533193070412811083330325659322041700029792166250734253390513754466045711240338462701034020262992581378423147276636643647155396305352541105541439434840109915068285430675068591638581980604162940383356586739198268782104924614076605793562865241982176207428620969776803149467431386807972438247689158656000000000000000000000000000000000000000000000000000000000000000");
    }
}
