package Test;

import Controller.HexadecConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecConverterTest {
    HexadecConverter testConv = new HexadecConverter();

    @Test
    void strToDec() {
        int expected = 3501;
        int actual = testConv.strToDec("DAD");

        assertEquals(expected, actual);
    }

    @Test
    void decToStr() {
        String expected = "AA";
        String actual = testConv.decToStr(170);

        assertEquals(expected, actual);
    }
}