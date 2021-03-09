package Test;

import Controller.HostBandCalc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HostBandCalcTest {
    HostBandCalc testCalc = new HostBandCalc();

    @Test
    void toBandwidth() {
        double expected = 3.0420564301468003E-9;
        double actual = testCalc.toBandwidth(1000, 3);

        assertEquals(expected, actual);
    }

    @Test
    void toMonthlyUse() {
        double expected = 328.72499999999997;
        double actual = testCalc.toMonthlyUse(1000, 3);

        assertEquals(expected, actual);
    }
}