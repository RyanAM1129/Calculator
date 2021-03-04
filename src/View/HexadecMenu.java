package View;

import Controller.HexadecCalculator;
import Model.Hexadecimal;

/**
 * HexadecMenu is designed to show all the menu options for the Hexadecimal Calculator
 * */
public class HexadecMenu extends Menu{
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RED = "\u001B[31m";
    private boolean keepGoing = false;
    Communicator com = new Communicator();
    HexadecCalculator hexCalc = new HexadecCalculator();

    public void menuDisplay(){
        while (!keepGoing) {
            switch (com.getInt(1, 6, ANSI_PURPLE,
                    "1 - Addition\n2 - Subtraction\n3 - Multiplication\n" +
                            "4 - Division\n5 - Conversion\n6 - Main Menu")) {
                case 1: /**Hexadecimal Addition*/
                    while (!keepGoing) {
                        Hexadecimal hexAdd1 = com.getHexadecimal(ANSI_PURPLE,
                                "Enter the first Hexadecimal: ");
                        Hexadecimal hexAdd2 = com.getHexadecimal(ANSI_PURPLE,
                                "Enter the second Hexadecimal: ");
                        Hexadecimal result = hexCalc.add(hexAdd1, hexAdd2);
                        System.out.println(ANSI_YELLOW + hexAdd1.getHexStr() + " (" + hexAdd1.getDecimal()
                                + ") + " + hexAdd2.getHexStr() + " (" + hexAdd2.getDecimal() + ") = " +
                                result.getHexStr() + " (" + result.getDecimal() + ")");
                        keepGoing = !com.doAnother(ANSI_PURPLE);
                    }
                    keepGoing = false;
                    break;

                case 2: /**Hexadecimal Subtraction*/
                    while (!keepGoing) {
                        Hexadecimal hexSub1 = com.getHexadecimal(ANSI_PURPLE,
                                "Enter the first Hexadecimal: ");
                        Hexadecimal hexSub2 = com.getHexadecimal(ANSI_PURPLE,
                                "Enter the second Hexadecimal: ");
                        Hexadecimal result = hexCalc.subtract(hexSub1, hexSub2);
                        System.out.println(ANSI_YELLOW + hexSub1.getHexStr() + " (" + hexSub1.getDecimal()
                                + ") - " + hexSub2.getHexStr() + " (" + hexSub2.getDecimal() + ") = " +
                                result.getHexStr() + " (" + result.getDecimal() + ")");
                        keepGoing = !com.doAnother(ANSI_PURPLE);
                    }
                    keepGoing = false;
                    break;

                case 3: /**Hexadecimal Multiplication*/
                    while (!keepGoing) {
                        Hexadecimal hexMul1 = com.getHexadecimal(ANSI_PURPLE,
                                "Enter the first Hexadecimal: ");
                        Hexadecimal hexMul2 = com.getHexadecimal(ANSI_PURPLE,
                                "Enter the second Hexadecimal: ");
                        Hexadecimal result = hexCalc.multiply(hexMul1, hexMul2);
                        System.out.println(ANSI_YELLOW + hexMul1.getHexStr() + " (" + hexMul1.getDecimal()
                                + ") * " + hexMul2.getHexStr() + " (" + hexMul2.getDecimal() + ") = " +
                                result.getHexStr() + " (" + result.getDecimal() + ")");
                        keepGoing = !com.doAnother(ANSI_PURPLE);
                    }
                    keepGoing = false;
                    break;

                case 4: /**Hexadecimal Division*/
                    while (!keepGoing) {
                        Hexadecimal numerator = com.getHexadecimal(ANSI_PURPLE,
                                "Please enter first hexadecimal: ");
                        Hexadecimal denominator = null;
                        while (!keepGoing) {
                            keepGoing = true;
                            denominator = com.getHexadecimal(ANSI_PURPLE,
                                    "Please enter second Hexadecimal: ");
                            if (denominator.getDecimal() == 0) {
                                keepGoing = false;
                                System.out.println(ANSI_RED + "!!!Can't Divide By Zero!!!");
                            }
                        }
                        Hexadecimal answer = hexCalc.divide(numerator, denominator);
                        Hexadecimal remainder = hexCalc.modular(numerator, denominator);
                        System.out.println(ANSI_YELLOW +
                                numerator.getHexStr() + "(" + numerator.getDecimal() + ") / " +
                                denominator.getHexStr() + "(" + denominator.getDecimal() + ") = " +
                                answer.getHexStr() + "(" + answer.getDecimal() + ") with remainder: " +
                                remainder.getHexStr() + "(" + remainder.getDecimal() + ")");
                        keepGoing = !com.doAnother(ANSI_PURPLE);
                    }
                    keepGoing = false;
                    break;

                case 5: /**Hexadecimal Conversion*/
                    while (!keepGoing) {
                        switch (com.getInt(1, 3, ANSI_PURPLE,
                                "1 - Decimal --> Hexadecimal\n" +
                                        "2 - Hexadecimal --> Decimal\n3 - Back")) {
                            case 1: /**Decimal to Hexadecimal*/
                                Hexadecimal decToHex = new Hexadecimal(com.getInt(ANSI_PURPLE,
                                        "Enter any whole number: "));
                                System.out.println(ANSI_YELLOW +
                                        decToHex.getDecimal() + " is " + decToHex.getHexStr() +
                                        " in Hexadecimal.");
                                break;

                            case 2: /**Hexadecimal to Decimal*/
                                Hexadecimal hexToDec = com.getHexadecimal(ANSI_PURPLE,
                                        "Enter a Hexadecimal number:");
                                System.out.println(ANSI_YELLOW + hexToDec.getHexStr() + " is equal to " +
                                        hexToDec.getDecimal() + ".");
                                break;

                            case 3:
                                keepGoing = true;
                        }
                    }
                    keepGoing = false;
                    break;

                case 6:
                    keepGoing = true;
            }
        }
    }
}
