package Controller;

public class Validator {
    public boolean isDecimal(String str){
        try { Integer.parseInt(str); return true; }
        catch (NumberFormatException nfe){ return false; }
    }
}
