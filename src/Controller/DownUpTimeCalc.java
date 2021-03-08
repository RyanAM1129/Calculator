package Controller;

import Model.Bandwidth;
import Model.FileSize;

public class DownUpTimeCalc {
    TimeConverter timeConv = new TimeConverter();

    public String downUpTime(Bandwidth bw, FileSize fs){
        return timeConv.convertTime((fs.getBits() / bw.getBitPerSec()));
    }
}
