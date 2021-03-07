package Model;

import Controller.BinaryConverter;

/**
 * Binary is an abstract data type designed to hold binary bit string and decimal value
 * */
public class Binary extends Number{
    private StringBuilder bitString;
    private int decimal;

    /** Constructor for Decimal --> Binary
     * @param value is the given decimal value ex.59*/
    public Binary(int value){
        this.decimal = value;
        BinaryConverter binCon = new BinaryConverter();
        this.bitString = new StringBuilder(binCon.decToStr(value));
    }

    /** Constructor for Binary --> Decimal
     * @param bitString is the given binary string ex. 100101*/
    public Binary(String bitString){
        this.bitString = new StringBuilder("0" + bitString);
        BinaryConverter binCon = new BinaryConverter();
        this.decimal = binCon.strToDec(bitString);
    }

    public int getDecimal(){
        return this.decimal;
    }
    public String getBitStr(){
        return this.bitString.toString();
    }

    public String toString(){
        return this.bitString + "(" + this.decimal + ")";
    }
}
