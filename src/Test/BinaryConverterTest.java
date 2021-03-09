package Test;

import Controller.BinaryConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryConverterTest{

    @Test
    void strToDec() {
        BinaryConverter binConv = new BinaryConverter();
        double expected = 9;
        double input = binConv.strToDec("1001");

        assertEquals(expected, input);
    }

    @Test
    void decToStr() {
        BinaryConverter binConv = new BinaryConverter();
        String expected = "01001";
        String response = binConv.decToStr(9);

        assertEquals(expected, response);
    }
}