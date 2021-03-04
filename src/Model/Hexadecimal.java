package Model;

import Controller.HexadecConverter;

public class Hexadecimal extends Number {
    private StringBuilder hexString;
    private int decimal;

    /**Constructor for Decimal --> Hexadecimal
     * @param decimal is the given decimal value ex.59*/
    public Hexadecimal(int decimal){
        this.decimal = decimal;
        HexadecConverter hexCon = new HexadecConverter();
        this.hexString = new StringBuilder(hexCon.decToStr(decimal));
    }

    /**Constructor for Hexadecimal --> Decimal
     * @param hexString is the given hexadecimal string ex. FA8*/
    public Hexadecimal(String hexString){
        this.hexString = new StringBuilder(hexString.toUpperCase());
        HexadecConverter hexCon = new HexadecConverter();
        this.decimal = hexCon.strToDec(hexString);
    }

    public String getHexStr(){
        return this.hexString.toString();
    }
    public int getDecimal(){
        return this.decimal;
    }
}
