package View;

import Controller.BigIntegerCalculator;

import java.math.BigInteger;

/**
 * BigIntegerMenu is designed to display all the menu options for the BigInteger Calculator
 * */
public class BigIntegerMenu extends Menu{
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    private boolean keepGoing = false;
    Communicator com = new Communicator();
    BigIntegerCalculator bigIntCalc = new BigIntegerCalculator();

    public void menuDisplay(){
        while (!keepGoing) {
            switch (com.getInt(1, 5, ANSI_BLUE,
                    "1 - Addition\n2 - Subtraction\n3 - Multiplication\n" +
                            "4 - Division\n5 - Main Menu")) {
                case 1: /**BigInteger Addition*/
                    while (!keepGoing) {
                        BigInteger bigAdd1 = com.getBigInt(ANSI_BLUE,
                                "Enter the first BigInteger: ");
                        BigInteger bigAdd2 = com.getBigInt(ANSI_BLUE,
                                "Enter the second BigInteger: ");
                        BigInteger result = bigIntCalc.add(bigAdd1, bigAdd2);
                        System.out.println(ANSI_YELLOW + bigAdd1 + " + " + bigAdd2 + " = " + result);
                        keepGoing = !com.doAnother(ANSI_BLUE);
                    }
                    keepGoing = false;
                    break;

                case 2: /**BigInteger Subtraction*/
                    while (!keepGoing) {
                        BigInteger bigSub1 = com.getBigInt(ANSI_BLUE,
                                "Enter the first BigInteger: ");
                        BigInteger bigSub2 = com.getBigInt(ANSI_BLUE,
                                "Enter the second BigInteger: ");
                        BigInteger result = bigIntCalc.subtract(bigSub1, bigSub2);
                        System.out.println(ANSI_YELLOW + bigSub1 + " - " + bigSub2 + " = " + result);
                        keepGoing = !com.doAnother(ANSI_BLUE);
                    }
                    keepGoing = false;
                    break;

                case 3: /**BigInteger Multiplication*/
                    while (!keepGoing) {
                        BigInteger bigMul1 = com.getBigInt(ANSI_BLUE,
                                "Enter the first BigInteger: ");
                        BigInteger bigMul2 = com.getBigInt(ANSI_BLUE,
                                "Enter the second BigInteger: ");
                        BigInteger result = bigIntCalc.multiply(bigMul1, bigMul2);
                        System.out.println(ANSI_YELLOW + bigMul1 + " * " + bigMul2 + " = " + result);
                        keepGoing = !com.doAnother(ANSI_BLUE);
                    }
                    keepGoing = false;
                    break;

                case 4: /**BigInteger Division*/
                    while (!keepGoing) {
                        BigInteger numerator = com.getBigInt(ANSI_BLUE,
                                "Please enter first BigInteger: ");
                        BigInteger denominator = null;
                        while (!keepGoing) {
                            keepGoing = true;
                            denominator = com.getBigInt(ANSI_BLUE,
                                    "Please enter second BigInteger: ");
                            if (denominator.equals(0)) {
                                keepGoing = false;
                                System.out.println(ANSI_RED + "!!!Can't Divide By Zero!!!");
                            }
                        }
                        BigInteger answer = bigIntCalc.divide(numerator, denominator);
                        BigInteger remainder = bigIntCalc.modular(numerator, denominator);
                        System.out.println(ANSI_YELLOW + numerator + " / " + denominator + " = " + answer +
                                " with remainder " + remainder);
                        keepGoing = !com.doAnother(ANSI_BLUE);
                    }
                    keepGoing = false;
                    break;

                case 5:
                    keepGoing = true;
            }
        }
    }
}
