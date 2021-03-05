package Controller;

public class BandwidthCalculator extends DecimalCalculator {
    public static final String ANSI_YELLOW = "\u001B[33m";
    private double bits;
    private double viewRate;
    private StringBuilder bandwidth = new StringBuilder();
    private StringBuilder file = new StringBuilder();
    private String unit;
    private double data;

    public double toBits(String original){
        String[] unitList = {"B", "kb", "KB", "mb", "MB", "gb", "GB", "tb", "TB"};
        String unit = "";
        String check;
        double data = 0.0;
        int CASE_CHOICE = -1;

        //Splits string to get only the unit
        for(int i = 0; i < original.length(); i++)
        {
            check = original.substring(i, i+1);

            if(!isNum(check) && !check.equals("."))
            {
                data = Double.parseDouble(original.substring(0, i));

                //Ensures the rest of the method doesn't run if data is already bits
                if(check.equals("b"))
                {
                    return data;
                }

                unit = original.substring(i);
                break;
            }
        }

        //Uses the unit to decide which switch case to use
        for(int i = 0; i < unitList.length; i++)
        {
            if(unit.matches(unitList[i]))
            {
                CASE_CHOICE = i + 1;
                break;
            }
        }

        //Uses switch case to determine which calculation to use
        switch (CASE_CHOICE)
        {
            case 1: //Bytes --> bits
                data = data * 8;
                break;

            case 2: //kilobits --> bits
                data = data * 1000;
                break;

            case 3://KiloBytes --> bits
                data = data * 8000;
                break;

            case 4: //megabits --> bits
                data = data * 1000000;
                break;

            case 5: //Megabytes --> bits
                data = data * 8000000;
                break;

            case 6: //gigabits --> bits
                data = data * 1E+9;
                break;

            case 7: //GigaBytes --> bits
                data = data * 8E+9;
                break;

            case 8: //terabits --> bits
                data = data * 1E+12;
                break;

            case 9: //TeraBytes --> bits
                data = data * 8E+12;
                break;
        }
        return data;
    }

    public String convertTime(double seconds){
        StringBuilder finTime = new StringBuilder();
        int days = 0;
        int hours = 0;
        int minutes = 0;

        if(seconds / 86400 >= 1)
        {
            days = (int)(seconds / 86400);
            seconds = seconds - (days * 86400);
            finTime.append(days + " days ");
        }
        if(seconds / 3600 >= 1)
        {
            hours = (int)(seconds / 3600);
            seconds -= hours * 3600;
            finTime.append(hours + " hours ");
        }
        if(seconds / 60 >= 1)
        {
            minutes = (int)(seconds / 60);
            seconds -= minutes * 60;
            finTime.append(minutes + " minutes ");
        }
        if(seconds > 0)
        {
            finTime.append(seconds + " seconds ");
        }

        return finTime.toString();
    }

    public void unitConverter(){
        System.out.println(ANSI_YELLOW + bits + " bits (b)");
        System.out.println(ANSI_YELLOW + (bits / 1000) + " kilobits (kb)");
        System.out.println(ANSI_YELLOW + (bits / 1E+6) + " megabits (mb)");
        System.out.println(ANSI_YELLOW + (bits / 1E+9) + " gigabits (gb)");
        System.out.println(ANSI_YELLOW + (bits / 1E+12) + " terabits (tb)");
        System.out.println(ANSI_YELLOW + (bits / 8) + " Bytes (B)");
        System.out.println(ANSI_YELLOW + (bits / 8000) + " KiloBytes (KB)");
        System.out.println(ANSI_YELLOW + (bits / 8E+6) + " MegaBytes (MB)");
        System.out.println(ANSI_YELLOW + (bits / 8E+9) + " GigaBytes (GB)");
        System.out.println(ANSI_YELLOW + (bits / 8E+12) + " TeraBytes (TB)");

//        return ANSI_YELLOW + bits + " bits (b)\n"
//                + (bits / 1000) + " kilobits (kb)\n"
//                + (bits / 1E+6) + " megabits (mb)\n"
//                + (bits / 1E+9) + " gigabits (gb)\n"
//                + (bits / 1E+12) + " terabits (tb)\n"          Use this block of code for GUI
//                + (bits / 8) + " Bytes (B)\n"
//                + (bits / 8000) + " KiloBytes (KB)"
//                + (bits / 8E+6) + " MegaBytes (MB)"
//                + (bits / 8E+9) + " GigaBytes (GB)"
//                + (bits / 8E+12) + " TeraBytes (TB)";
    }

    public boolean isUnit(){
        String[] units = {"b", "B", "kb", "KB", "mb", "MB", "gb", "GB", "tb", "TB"};
        boolean result = false;

        for (String unit : units)
        {
            if (this.unit.equals(unit))
            {
                result = true;
                break;
            }
        }

        return result;
    }

    public void buildBandwidth(){
        if(this.bandwidth.length() > 0){
            this.bandwidth.delete(0, this.bandwidth.length());
        }
        this.bandwidth.append(this.data);
        this.bandwidth.append(this.unit);
    }

    public void buildFile(){
        if(this.file.length() > 0){
            this.file.delete(0, this.file.length());
        }
        file.append(this.data);
        file.append(this.unit);
    }

    public void webBandCalc(int viewFreq, int redundancy) {
        double megaBits = 0.0;
        double gigaBytes = 0.0;

        switch(viewFreq) {
            case 1: // per Second
                megaBits = this.viewRate * this.bits * 1E-6;
                gigaBytes = (megaBits * 328.5);

                System.out.println(ANSI_YELLOW + "Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 2: // per Minute
                megaBits = (this.viewRate * this.bits * 1E-6) / 60 ;
                gigaBytes = (megaBits * 328.5);

                System.out.println(ANSI_YELLOW + "Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 3: //per Hour
                megaBits = (this.viewRate * this.bits * 1E-6) / 3600;
                gigaBytes = (megaBits * 328.5);

                System.out.println(ANSI_YELLOW + "Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 4: //per Day
                megaBits = (this.viewRate * this.bits * 1E-6) / 86400;
                gigaBytes = (megaBits * 328.5);

                System.out.println(ANSI_YELLOW + "Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 5: //per Week
                megaBits = (this.viewRate * this.bits * 1E-6) / 604800;
                gigaBytes = (megaBits * 328.5);

                System.out.println(ANSI_YELLOW + "Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 6: //per Month
                megaBits = (this.viewRate * this.bits * 1E-6) / 2.628E+6;
                gigaBytes = (megaBits * 328.5);

                System.out.println(ANSI_YELLOW + "Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;

            case 7: //per Year
                megaBits = (this.viewRate * this.bits * 1E-6) / 3.154E+7;
                gigaBytes = (megaBits * 328.5);

                System.out.println(ANSI_YELLOW + "Actual bandwidth needed is " + (megaBits) +
                        "Mbits/s or " + String.format("%6.3e",gigaBytes) + "GB per month");
                break;
        }

        if(redundancy > 1){
            System.out.println(ANSI_YELLOW + "With redundancy factor of " + redundancy +
                    ", the bandwidth needed is " + (megaBits) * redundancy + "Mbits/s or " +
                    String.format("%6.3e",gigaBytes * redundancy) + "GB per month");
        }
    }

    public void hostBandCalc(int useUnit) {
        double result;
        switch(useUnit) {
            case 1: //Bytes
                result = data * 3.0420564301468E-6;
                System.out.println(ANSI_YELLOW + data + "Bytes (B) per month is equivalent to " + result +
                        " bit/s");
                result = data * 3.0420564301468E-9;
                System.out.println(ANSI_YELLOW + data + "Bytes (B) per month is equivalent to " + result +
                        " Kbit/s");
                result = data * 3.0420564301468E-12;
                System.out.println(ANSI_YELLOW + data + "Bytes (B) per month is equivalent to " + result +
                        " Mbit/s");
                result = data * 3.0420564301468E-15;
                System.out.println(ANSI_YELLOW + data + "Bytes (B) per month is equivalent to " + result +
                        " Gbit/s");
                result = data * 3.0420564301468E-18;
                System.out.println(ANSI_YELLOW + data + "Bytes (B) per month is equivalent to " + result +
                        " Tbit/s");
                break;

            case 2: //KiloBytes
                result = data * 0.0030420564301468;
                System.out.println(ANSI_YELLOW + data + "KiloBytes (B) per month is equivalent to " + result +
                        " bit/s");
                result = data * 3.0420564301468E-6;
                System.out.println(ANSI_YELLOW + data + "KiloBytes (B) per month is equivalent to " + result +
                        " Kbit/s");
                result = data * 3.0420564301468E-9;
                System.out.println(ANSI_YELLOW + data + "KiloBytes (B) per month is equivalent to " + result +
                        " Mbit/s");
                result = data * 3.0420564301468E-12;
                System.out.println(ANSI_YELLOW + data + "KiloBytes (B) per month is equivalent to " + result +
                        " Gbit/s");
                result = data * 3.0420564301468E-15;
                System.out.println(ANSI_YELLOW + data + "KiloBytes (B) per month is equivalent to " + result +
                        " Tbit/s");
                break;

            case 3: //MegaBytes
                result = data * 3.0420564301468;
                System.out.println(ANSI_YELLOW + data + "MegaBytes (B) per month is equivalent to " + result +
                        " bit/s");
                result = data * 0.0030420564301468;
                System.out.println(ANSI_YELLOW + data + "MegaBytes (B) per month is equivalent to " + result +
                        " Kbit/s");
                result = data * 3.0420564301468E-6;
                System.out.println(ANSI_YELLOW + data + "MegaBytes (B) per month is equivalent to " + result +
                        " Mbit/s");
                result = data * 3.0420564301468E-9;
                System.out.println(ANSI_YELLOW + data + "MegaBytes (B) per month is equivalent to " + result +
                        " Gbit/s");
                result = data * 3.0420564301468E-12;
                System.out.println(ANSI_YELLOW + data + "MegaBytes (B) per month is equivalent to " + result +
                        " Tbit/s");
                break;

            case 4: //GigaBytes
                result = data * 3042.0564301468;
                System.out.println(ANSI_YELLOW + data + "GigaBytes (B) per month is equivalent to " + result +
                        " bit/s");
                result = data * 3.0420564301468;
                System.out.println(ANSI_YELLOW + data + "GigaBytes (B) per month is equivalent to " + result +
                        " Kbit/s");
                result = data * 0.0030420564301468;
                System.out.println(ANSI_YELLOW + data + "GigaBytes (B) per month is equivalent to " + result +
                        " Mbit/s");
                result = data * 3.0420564301468E-6;
                System.out.println(ANSI_YELLOW + data + "GigaBytes (B) per month is equivalent to " + result +
                        " Gbit/s");
                result = data * 3.0420564301468E-9;
                System.out.println(ANSI_YELLOW + data + "GigaBytes (B) per month is equivalent to " + result +
                        " Tbit/s");
                break;

            case 5: //TeraBytes
                result = data * 3042056.4301468;
                System.out.println(ANSI_YELLOW + data + "TeraBytes (TB) per month is equivalent to " + result +
                        " bit/s");
                result = data * 3042.0564301468;
                System.out.println(ANSI_YELLOW + data + "TeraBytes (TB) per month is equivalent to " + result +
                        " Kbit/s");
                result = data * 3.0420564301468;
                System.out.println(ANSI_YELLOW + data + "TeraBytes (TB) per month is equivalent to " + result +
                        " Mbit/s");
                result = data * 0.0030420564301468;
                System.out.println(ANSI_YELLOW + data + "TeraBytes (TB) per month is equivalent to " + result +
                        " Gbit/s");
                result = data * 3.0420564301468E-6;
                System.out.println(ANSI_YELLOW + data + "TeraBytes (TB) per month is equivalent to " + result +
                        " Tbit/s");
                break;

        }
    }

    //Setters
    public void setBits(double bits){
        this.bits = bits;
    }
    public void setBandwidth(String bandwidth){
        this.bandwidth.delete(0, this.bandwidth.length() - 1);
        this.bandwidth.append(bandwidth);
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    public void setData(double data){
        this.data = data;
    }
    public void setFile(String file){
        this.file.delete(0, this.file.length() - 1);
        this.file.append(file);
    }
    public void setViewRate(double viewRate){
        this.viewRate =viewRate;
    }

    //Getters
    public double getBits(){
        return this.bits;
    }
    public String getBandwidth(){
        return this.bandwidth.toString();
    }
    public String getUnit(){
        return this.unit;
    }
    public double getData(){
        return this.data;
    }
    public String getFile(){
        return this.file.toString();
    }
    public double getViewRate(){
        return this.viewRate;
    }
}
