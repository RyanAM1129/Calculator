package Test;

import Controller.TimeConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConverterTest {
    TimeConverter testConv = new TimeConverter();

    @Test
    void convertTime() {
        String expected = "1 minutes ";
        String actual = testConv.convertTime(60);

        assertEquals(expected, actual);
    }
}