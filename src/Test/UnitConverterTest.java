package Test;

import Controller.UnitConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitConverterTest {
    UnitConverter testConv = new UnitConverter();

    @Test
    void dataUnitConv() {
        String expected = "100.0 bits (b)\n" +
                "0.1 kilobits (kb)\n" +
                "1.0E-4 megabits (mb)\n" +
                "1.0E-7 gigabits (gb)\n" +
                "1.0E-10 terabits (tb)\n" +
                "12.5 Bytes (B)\n" +
                "0.0125 KiloBytes (KB)\n" +
                "1.25E-5 MegaBytes (MB)\n" +
                "1.25E-8 GigaBytes (GB)\n" +
                "1.25E-11 TeraBytes (TB)";
        String actual = testConv.dataUnitConv(100);

        assertEquals(expected, actual);
    }
}