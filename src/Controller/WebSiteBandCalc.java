package Controller;

import Model.FileSize;

public class WebSiteBandCalc {
    public String webBandCalc(int viewFreq, double viewRate, FileSize ps, int redundancy){
        StringBuilder answer = new StringBuilder();
        double megaBits = 0.0;
        double gigaBytes = 0.0;

        switch(viewFreq) {
            case 1: // per Second
                megaBits = viewRate * ps.getBits() * 1E-6;
                gigaBytes = (megaBits * 328.5);

                answer.append("Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 2: // per Minute
                megaBits = (viewRate * ps.getBits() * 1E-6) / 60 ;
                gigaBytes = (megaBits * 328.5);

                answer.append("Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 3: //per Hour
                megaBits = (viewRate * ps.getBits() * 1E-6) / 3600;
                gigaBytes = (megaBits * 328.5);

                answer.append("Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 4: //per Day
                megaBits = (viewRate * ps.getBits() * 1E-6) / 86400;
                gigaBytes = (megaBits * 328.5);

                answer.append("Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 5: //per Week
                megaBits = (viewRate * ps.getBits() * 1E-6) / 604800;
                gigaBytes = (megaBits * 328.5);

                answer.append("Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 6: //per Month
                megaBits = (viewRate * ps.getBits() * 1E-6) / 2.628E+6;
                gigaBytes = (megaBits * 328.5);

                answer.append("Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 7: //per Year
                megaBits = (viewRate * ps.getBits() * 1E-6) / 3.154E+7;
                gigaBytes = (megaBits * 328.5);

                answer.append("Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;
        }

        if(redundancy > 1){
            answer.append("\nWith redundancy factor of " + redundancy +
                    ", the bandwidth needed is " + (megaBits) * redundancy + "Mbits/s or " +
                    String.format("%6.3e",gigaBytes * redundancy) + "GB per month");
        }
        return answer.toString();
    }
}
