package Controller;

import java.util.Stack;

/**
 * BinaryConverter is designed to convert decimals to bit strings and bit strings to decimals
 * */
public class BinaryConverter extends Converter{
    public int strToDec(String str){
        Stack<Integer> bin = new Stack<>();
        int decimal = 0;

        for(int i = 0; i < str.length(); i++)
        {
            bin.push(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        for(int i = 0; bin.size() > 0; i++)
        {
            decimal += bin.pop() * Math.pow(2, i);
        }

        return decimal;
    }

    public String decToStr(int decimal){
        StringBuilder bitString;
        if(decimal < 0){

            bitString = new StringBuilder("-0");
        }
        else {
            bitString = new StringBuilder("0");
        }
        decimal = Math.abs(decimal);
        Stack<Integer> bin = new Stack<>();

        //Collects builder values
        while(decimal != 0)
        {
            bin.push(decimal % 2);
            decimal = decimal / 2;
        }

        //Builds builder string
        while(!bin.isEmpty())
        {
            bitString.append(bin.pop());
        }
        return bitString.toString();
    }
}
