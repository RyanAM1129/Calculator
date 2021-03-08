package Controller;

import Model.Hexadecimal;

import java.math.BigInteger;

public class Validator {
    public boolean isDecimal(String check){
        try { Double.parseDouble(check); return true; }
        catch (NumberFormatException nfe){ return false; }
    }

    public boolean isInt(String check){
        try {Integer.parseInt(check); return true;}
        catch (NumberFormatException nfe) { return false; }
    }

    public boolean isBigInt(String check){
        try { BigInteger test = new BigInteger(check); return true; }
        catch (NumberFormatException nfe){ return false; }
    }

    public boolean isBinary(String check){
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) != '0' && check.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public boolean isHexadec(String check){
        String hexabet = "0123456789ABCDEF";

        for (int i = 0; i < check.length(); i++) {
            char c = Character.toUpperCase(check.charAt(i));
            int index = hexabet.indexOf(c);

            if (index == -1) {
                return false;
            }
        }

        return true;
    }

//    public boolean isUnit(String check){
//        String[] units = {"b", "B", "kb", "KB", "mb", "MB", "gb", "GB", "tb", "TB"};
//        boolean result = false;
//
//        for (String unit : units)
//        {
//            if (check.equals(unit))
//            {
//                result = true;
//                break;
//            }
//        }
//
//        return result;
//    }
}
