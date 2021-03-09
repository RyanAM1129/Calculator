package Test;

import Controller.WebSiteBandCalc;
import Model.FileSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebSiteBandCalcTest {
    WebSiteBandCalc testCalc = new WebSiteBandCalc();

    @Test
    void webBandCalc() {
        String expected, actual;
        expected = "Actual bandwidth needed is 0.23148148148148148Mbits/s or 7.604e+01GB per month\n" +
                "With redundancy factor of 2, the bandwidth needed is 0.46296296296296297Mbits/s or 1.521e+02GB per month";
        actual = testCalc.webBandCalc(4, 5000, new FileSize(500, "KB"), 2);

        assertEquals(expected, actual);
    }
}