package Test;

import Controller.DownUpTimeCalc;
import Model.Bandwidth;
import Model.FileSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DownUpTimeCalcTest {
    DownUpTimeCalc testCalc = new DownUpTimeCalc();

    @Test
    void downUpTime() {
        String expected = "1.25E-4 seconds ";
        String actual = testCalc.downUpTime(new Bandwidth(5000, "MB"), new FileSize(5, "mb"));

        assertEquals(expected, actual);
    }
}