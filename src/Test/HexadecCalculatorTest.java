package Test;

import Controller.HexadecCalculator;
import Model.Hexadecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecCalculatorTest {
    HexadecCalculator testCalc = new HexadecCalculator();

    @Test
    void add() {
        double expected = 12.0;
        double actual = testCalc.add(new Hexadecimal(8), new Hexadecimal(4)).getDecimal();

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        double expected = 4.0;
        double actual = testCalc.subtract(new Hexadecimal(8), new Hexadecimal(4)).getDecimal();

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        double expected = 32.0;
        double actual = testCalc.multiply(new Hexadecimal(8), new Hexadecimal(4)).getDecimal();

        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        double expected = 2.0;
        double actual = testCalc.divide(new Hexadecimal(8), new Hexadecimal(4)).getDecimal();

        assertEquals(expected, actual);
    }

    @Test
    void modular() {
        double expected = 0.0;
        double actual = testCalc.modular(new Hexadecimal(8), new Hexadecimal(4)).getDecimal();

        assertEquals(expected, actual);
    }
}