package Controller;

import Model.Bandwidth;

public class HostBandCalc {
    public double toBandwidth(double bytes, int bandUnit){
        double answer = 0.0;
        switch (bandUnit){
            case 1: //bits per second
                answer = bytes * 3.0420564301468E-6;
                break;
            case 2: //kilobits per second
                answer = bytes * 3.0420564301468E-9;
                break;
            case 3: //megabits per second
                answer = bytes * 3.0420564301468E-12;
                break;
            case 4: //gigabits per second
                answer = bytes * 3.0420564301468E-15;
                break;
            case 5: //terabits per second
                answer = bytes * 3.0420564301468E-18;
                break;
        }
        return answer;
    }

    public double toMonthlyUse(double bits, int monthUseUnit){
        double answer = 0.0;
        switch(monthUseUnit){
            case 1: //Bytes per month
                answer = bits * 328725;
                break;
            case 2: //KiloBytes per month
                answer = bits * 328.725;
                break;
            case 3: //MegaBytes per month
                answer = bits * 0.328725;
                break;
            case 4: //GigaBytes per month
                answer = bits * 0.000328725;
                break;
            case 5: //TeraBytes per month
                answer = bits * 3.28725E-7;
                break;
        }
        return answer;
    }
}
