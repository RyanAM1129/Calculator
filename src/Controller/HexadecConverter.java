package Controller;

import java.util.Stack;

/**
 * HexadecConverter is designed to convert from Hex Strings to decimals and decimals to Hex Strings
 * */
public class HexadecConverter extends Converter{
    private final String hexabet = "0123456789ABCDEF";    //All the characters in hexadecimal

    public int strToDec(String str){
        int decimal = 0;
        Stack<Integer> hexStack = new Stack<>();

        for(int i = 0; i < str.length(); i++)
        {
            hexStack.push(this.hexabet.indexOf(str.charAt(i)));
        }

        for(int i = 0; hexStack.size() > 0; i++)
        {
            decimal += hexStack.pop() * Math.pow(16, i);
        }
        return decimal;
    }

    public String decToStr(int decimal){
        String hold = "";
        boolean isNegative = false;
        if(decimal < 0){
            isNegative = true;
        }
        decimal = Math.abs(decimal);

        //Checks if the number is 0 before computing
        if(decimal == 0) { hold = "0"; }

        //Loop to compute Hexadecimal
        while(decimal != 0)
        {
            int i = decimal % 16;

            hold = this.hexabet.charAt(i) + hold;
            decimal = decimal / 16;
        }

        //Adds the negative symbol at the end
        if(isNegative){
            hold = "-" + hold;
        }

        return hold;
    }
}
