package Test;

import Controller.BigIntegerCalculator;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class BigIntegerCalculatorTest {
    BigIntegerCalculator bIntCalc = new BigIntegerCalculator();

    @Test
    void add() {
        int expected = 20044;
        int actual = bIntCalc.add(new BigInteger("22"), new BigInteger("20022")).intValue();

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        int expected = 1;
        int actual = bIntCalc.subtract(new BigInteger("5000000000"), new BigInteger("4999999999")).intValue();

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int expected = 10000;
        int actual = bIntCalc.multiply(new BigInteger("100"), new BigInteger("100")).intValue();

        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        int expected = 3;
        int actual = bIntCalc.divide(new BigInteger("9000000000"),
                new BigInteger("3000000000")).intValue();

        assertEquals(expected, actual);
    }

    @Test
    void modular() {
        int expected = 3;
        int actual = bIntCalc.divide(new BigInteger("9000000000"),
                new BigInteger("2999999999")).intValue();

        assertEquals(expected, actual);
    }
}