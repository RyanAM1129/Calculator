package View;

import Controller.BinaryCalculator;
import Model.Binary;

/**
 * BinaryMenu is designed to show all the menu options for the Binary Calculator
 * */
public class BinaryMenu extends Menu {
    private boolean keepGoing = false;
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    Communicator com = new Communicator();
    BinaryCalculator binCalc = new BinaryCalculator();

    public void menuDisplay(){
        while (!keepGoing) {
            switch (com.getInt(1, 6, ANSI_CYAN,
                    "1 - Addition\n2 - Subtraction\n3 - Multiplication\n" +
                            "4 - Division\n5 - Conversion\n6 - Main Menu")) {
                case 1: /**Binary Addition*/
                    while (!keepGoing) {
                        Binary binAdd1 = com.getBinary(ANSI_CYAN, "Please enter first binary: ");
                        Binary binAdd2 = com.getBinary(ANSI_CYAN, "Please enter second binary: ");
                        Binary answer = binCalc.add(binAdd1, binAdd2);
                        System.out.println(ANSI_YELLOW +
                                binAdd1.getBitStr() + "(" + binAdd1.getDecimal() + ") + " +
                                binAdd2.getBitStr() + "(" + binAdd2.getDecimal() + ") = " +
                                answer.getBitStr() + "(" + answer.getDecimal() + ")");
                        keepGoing = !com.doAnother(ANSI_CYAN);
                    }
                    keepGoing = false;
                    break;

                case 2: /**Binary Subtraction*/
                    while (!keepGoing) {
                        Binary binSub1 = com.getBinary(ANSI_CYAN, "Please enter first binary: ");
                        Binary binSub2 = com.getBinary(ANSI_CYAN, "Please enter second binary: ");
                        Binary answer = binCalc.subtract(binSub1, binSub2);
                        System.out.println(ANSI_YELLOW +
                                binSub1.getBitStr() + "(" + binSub1.getDecimal() + ") - " +
                                binSub2.getBitStr() + "(" + binSub2.getDecimal() + ") = " +
                                answer.getBitStr() + "(" + answer.getDecimal() + ")");
                        keepGoing = !com.doAnother(ANSI_CYAN);
                    }
                    keepGoing = false;
                    break;

                case 3: /**Binary Multiplication*/
                    while (!keepGoing) {
                        Binary binMul1 = com.getBinary(ANSI_CYAN, "Please enter first binary: ");
                        Binary binMul2 = com.getBinary(ANSI_CYAN, "Please enter second binary: ");
                        Binary answer = binCalc.multiply(binMul1, binMul2);
                        System.out.println(ANSI_YELLOW +
                                binMul1.getBitStr() + "(" + binMul1.getDecimal() + ") * " +
                                binMul2.getBitStr() + "(" + binMul2.getDecimal() + ") = " +
                                answer.getBitStr() + "(" + answer.getDecimal() + ")");
                        keepGoing = !com.doAnother(ANSI_CYAN);
                    }
                    keepGoing = false;
                    break;

                case 4: /**Binary Division*/
                    while (!keepGoing) {
                        Binary numerator = com.getBinary(ANSI_CYAN,
                                "Please enter first binary: ");
                        Binary denominator = null;
                        while (!keepGoing) {
                            keepGoing = true;
                            denominator = com.getBinary(ANSI_CYAN,
                                    "Please enter second binary: ");
                            if (denominator.getDecimal() == 0) {
                                keepGoing = false;
                                System.out.println(ANSI_RED + "!!!Can't Divide By Zero!!!");
                            }
                        }
                        Binary answer = new Binary(
                                numerator.getDecimal() / denominator.getDecimal());
                        Binary remainder = new Binary(
                                numerator.getDecimal() % denominator.getDecimal());
                        System.out.println(ANSI_YELLOW +
                                numerator.getBitStr() + "(" + numerator.getDecimal() + ") / " +
                                denominator.getBitStr() + "(" + denominator.getDecimal() + ") = " +
                                answer.getBitStr() + "(" + answer.getDecimal() + ") with remainder: " +
                                remainder.getBitStr() + "(" + remainder.getDecimal() + ")");
                        keepGoing = !com.doAnother(ANSI_CYAN);

                    }
                    keepGoing = false;
                    break;

                case 5: /**Binary Conversion*/
                    while (!keepGoing) {
                        switch (com.getInt(1, 3, ANSI_CYAN,
                                "1 - Decimal --> Binary\n" +
                                        "2 - Binary --> Decimal\n3 - Back")) {
                            case 1: /**Decimal to Binary*/
                                Binary decToBin = new Binary(com.getInt(ANSI_CYAN,
                                        "Enter any whole number: "));
                                System.out.println(ANSI_YELLOW +
                                        decToBin.getDecimal() + " is " + decToBin.getBitStr() +
                                        " in binary.");
                                break;

                            case 2: /**Binary to Decimal*/
                                Binary binToDec = com.getBinary(ANSI_CYAN,
                                        "Enter a binary number:");
                                System.out.println(ANSI_YELLOW + binToDec.getBitStr() + " is equal to " +
                                        binToDec.getDecimal() + ".");
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
