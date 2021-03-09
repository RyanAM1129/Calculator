package Test;

import Controller.BinaryCalculator;
import Model.Binary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCalculatorTest {
    BinaryCalculator binCalc = new BinaryCalculator();

    @Test
    void add() {
        double expected = 9.0;
        double actual = binCalc.add(new Binary(5), new Binary(4)).getDecimal();

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        double expected = 1.0;
        double actual = binCalc.subtract(new Binary(5), new Binary(4)).getDecimal();

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        double expected = 20.0;
        double actual = binCalc.multiply(new Binary(5), new Binary(4)).getDecimal();

        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        double expected = 1.0;
        double actual = binCalc.divide(new Binary(5), new Binary(4)).getDecimal();

        assertEquals(expected, actual);
    }

    @Test
    void modular() {
        double expected = 1.0;
        double actual = binCalc.modular(new Binary(5), new Binary(4)).getDecimal();

        assertEquals(expected, actual);
    }
}