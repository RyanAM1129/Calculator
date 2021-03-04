package View;

import Controller.DecimalCalculator;

/**
 * DecimalMenu is designed to show all the menu options for the Decimal Calculator
 * */
public class DecimalMenu extends Menu{
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private boolean keepGoing = false;
    Communicator com = new Communicator();
    DecimalCalculator decCalc = new DecimalCalculator();

    public void menuDisplay() {
        while (!keepGoing) {
            switch (com.getInt(1, 5, ANSI_WHITE,
                    "1 - Addition\n2 - Subtraction\n3 - Multiplication\n" +
                            "4 - Division\n5 - Main Menu")) {
                case 1: /**Addition*/
                    while (!keepGoing) {
                        double add1 = com.getDouble(ANSI_WHITE, "Please enter any real number: ");
                        double add2 = com.getDouble(ANSI_WHITE,
                                "Please enter another real number: ");
                        double result = decCalc.add(add1, add2);
                        System.out.println(ANSI_YELLOW + add1 + " + " + add2 + " = " + result);
                        keepGoing = !com.doAnother(ANSI_WHITE);
                    }
                    keepGoing = false;
                    break;

                case 2: /**Subtraction*/
                    while (!keepGoing) {
                        double sub1 = com.getDouble(ANSI_WHITE, "Please enter any real number: ");
                        double sub2 = com.getDouble(ANSI_WHITE,
                                "Please enter another real number: ");
                        double result = decCalc.subtract(sub1, sub2);
                        System.out.println(ANSI_YELLOW + sub1 + " - " + sub2 + " = " + result);
                        keepGoing = !com.doAnother(ANSI_WHITE);
                    }
                    keepGoing = false;
                    break;

                case 3: /**Multiplication*/
                    while (!keepGoing) {
                        double mul1 = com.getDouble(ANSI_WHITE, "Please enter any real number: ");
                        double mul2 = com.getDouble(ANSI_WHITE,
                                "Please enter another real number: ");
                        double result = decCalc.multiply(mul1, mul2);
                        System.out.println(ANSI_YELLOW + mul1 + " * " + mul2 + " = " + result);
                        keepGoing = !com.doAnother(ANSI_WHITE);
                    }
                    keepGoing = false;
                    break;

                case 4: /**Division*/
                    while (!keepGoing) {
                        double numerator = com.getDouble(ANSI_WHITE,
                                "Please enter any Real Number: ");
                        double denominator = 1.0;
                        while (!keepGoing) {
                            keepGoing = true;
                            denominator = com.getDouble(ANSI_WHITE,
                                    "Please enter another Real Number: ");
                            if (denominator == 0.0) {
                                keepGoing = false;
                                System.out.println(ANSI_RED + "!!!Can't Divide By Zero!!!");
                            }
                        }
                        double answer = decCalc.divide(numerator, denominator);
                        double remainder = decCalc.modular(numerator, denominator);
                        System.out.println(ANSI_YELLOW + numerator + " / " + denominator + " = " + answer +
                                " or " + Math.floor(answer) + " with remainder " + remainder);
                        keepGoing = !com.doAnother(ANSI_WHITE);
                    }
                    keepGoing = false;
                    break;

                case 5:
                    keepGoing = true;
            }
        }
    }
}
