package Controller;

public class BitConverter {
    final String[] unitList = {"B", "kb", "KB", "mb", "MB", "gb", "GB", "tb", "TB"};
    private DecimalCalculator decCalc = new DecimalCalculator();

    public double toBits(String original){
        String unit = "";
        String check;
        double data = 0.0;
        int CASE_CHOICE = -1;

        //Splits string to get only the unit
        for(int i = 0; i < original.length(); i++)
        {
            check = original.substring(i, i+1);

            if(!decCalc.isNum(check) && !check.equals("."))
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
}
