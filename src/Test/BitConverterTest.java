package Test;

import Controller.BitConverter;

import static org.junit.jupiter.api.Assertions.*;

class BitConverterTest {

    @org.junit.jupiter.api.Test
    void toBits() {
        BitConverter bitConv = new BitConverter();
        double expected = 8E9;
        double input = bitConv.toBits("1000MB");

        assertEquals(expected, input);
    }
}