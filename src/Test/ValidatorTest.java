package Test;

import Controller.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    Validator testValid = new Validator();

    @Test
    void isDecimal() {
        boolean expected, actual;
        expected = false;
        actual = testValid.isDecimal("no");

        assertEquals(expected, actual);
    }

    @Test
    void isInt() {
        boolean expected, actual;
        expected = false;
        actual = testValid.isInt("no");

        assertEquals(expected, actual);
    }

    @Test
    void isBigInt() {
        boolean expected, actual;
        expected = false;
        actual = testValid.isBigInt("no");

        assertEquals(expected, actual);
    }

    @Test
    void isBinary() {
        boolean expected, actual;
        expected = false;
        actual = testValid.isDecimal("no");

        assertEquals(expected, actual);
    }

    @Test
    void isHexadec() {
        boolean expected, actual;
        expected = false;
        actual = testValid.isDecimal("no");

        assertEquals(expected, actual);
    }
}