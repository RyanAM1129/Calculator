package Test;

import Controller.DecimalCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalCalculatorTest {
    DecimalCalculator decCalc = new DecimalCalculator();

    @Test
    void add() {
        double expected = 998.5;
        double actual = decCalc.add(22.2, 976.3);

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        double expected = -954.0999999999999;
        double actual = decCalc.subtract(22.2, 976.3);

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        double expected = 21673.859999999997;
        double actual = decCalc.multiply(22.2, 976.3);

        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        double expected = 2.0;
        double actual = decCalc.divide(22.2, 11.1);

        assertEquals(expected, actual);
    }

    @Test
    void modular() {
        double expected = 0.0;
        double actual = decCalc.modular(22.2, 11.1);

        assertEquals(expected, actual);
    }
}