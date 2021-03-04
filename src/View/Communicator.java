package View;

import Model.Binary;
import Model.Hexadecimal;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Communicator is a class designed to receive and validate user inputs
 * */
public class Communicator {

    public static final String ANSI_RED = "\u001B[31m";

    private boolean keepGoing;
    Scanner console = new Scanner(System.in);

    /**
     * getInt receives and checks user input until it gets an integer
     * @param ANSI is the ANSI code for the desired color of the message
     * @param message is the message that should be repeated until valid input is received*/
    public int getInt(String ANSI, String message) {
        keepGoing = false;
        int answer = -1;

        while (!keepGoing) {                        //Uses a while loop to make sure it keeps asking
            System.out.println(ANSI + message);     //until it gets a valid input
            if (console.hasNextInt()) {             //Uses .hasNextInt to see if user input is an int
                answer = console.nextInt();
                console.nextLine();
                keepGoing = true;
            } else {
                System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                console.next();
            }
        }

        return answer;
    }

    /** getInt receives and checks user input until it gets an integer within a range
     * @param min is the minimum desired value
     * @param max is the maximum desired value
     * @param ANSI is the ANSI code for the desired color of the message
     * @param message is the message that should be repeated until valid input is received */
    public int getInt(int min, int max, String ANSI, String message) {
        keepGoing = false;
        int answer = -1;

        while (!keepGoing) {
            System.out.println(ANSI + message);
            if (console.hasNextInt()) {
                answer = console.nextInt();
                console.nextLine();
                if (answer <= max && answer >= min) {
                    keepGoing = true;
                } else {
                    System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                }
            } else {
                System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                console.next();
            }
        }

        return answer;
    }

    /** getDouble receives and checks user input until it get a double
     * @param ANSI is the ANSI code for the desired color of the message
     * @param message is the message that should be repeated until valid input is received*/
    public double getDouble(String ANSI, String message) {
        keepGoing = false;
        double answer = -1.0;

        while (!keepGoing) {
            System.out.println(ANSI + message);
            if (console.hasNextDouble()) {
                answer = console.nextDouble();
                console.nextLine();
                keepGoing = true;
            } else {
                System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                console.nextLine();
            }
        }

        if(answer % 1 == 0.0){
            return (int)answer;
        }
        return answer;
    }

    /** getDouble receives and checks user input until it gets a double within a range
     * @param min is the minimum desired value
     * @param max is the maximum desired value
     * @param ANSI is the ANSI code for the desired color of the message
     * @param message is the message that should be repeated until valid input is received */
    public double getDouble(double min, double max, String ANSI, String message) {
        keepGoing = false;
        double answer = -1.0;

        while (!keepGoing) {
            System.out.println(ANSI + message);
            if (console.hasNextDouble()) {
                answer = console.nextDouble();
                console.nextLine();
                keepGoing = true;
                if (answer > max || answer < min) {
                    System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                    keepGoing = false;
                }
            } else {
                System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                console.next();
            }
        }

        return answer;
    }

    /** getBigInt receives and checks user input until it gets an bigInteger
     * @param ANSI is the ANSI code for the desired color of the message
     * @param message is the message that should be repeated until valid input is received
     * @return returns a BigInteger object*/
    public BigInteger getBigInt(String ANSI, String message) {
        keepGoing = false;
        BigInteger answer = new BigInteger("0");

        while (!keepGoing) {
            System.out.println(ANSI + message);
            if (console.hasNextBigInteger()) {
                answer = console.nextBigInteger();
                console.nextLine();
                keepGoing = true;
                break;
            } else {
                System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                String dump = console.nextLine();
                dump = "";
            }
        }

        return answer;
    }

    /** getBinary receives and checks user input until it gets a valid binary
     * @param ANSI is the ANSI code for the desired color of the message
     * @param message is the message that should be repeated until valid input is received
     * @return returns a Binary object*/
    public Binary getBinary(String ANSI, String message) {
        keepGoing = false;
        String check = "";

        while (!keepGoing) {
            System.out.println(ANSI + message);
            check = console.nextLine();
            keepGoing = true;
            for (int i = 0; i < check.length(); i++) {
                if (check.charAt(i) != '0' && check.charAt(i) != '1') {
                    keepGoing = false;
                    System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                    break;
                }
            }

        }

        return new Binary(check);
    }

    /** getHexadecimal receives and checks user input until it gets a valid Hexadecimal
     * @param ANSI is the ANSI code for the desired color of the message
     * @param message is the message that should be repeated until valid input is received
     * @return returns a Hexadecimal object*/
    public Hexadecimal getHexadecimal(String ANSI, String message) {
        keepGoing = false;
        String check = "";
        String hexabet = "0123456789ABCDEF";

        while (!keepGoing) {
            System.out.println(ANSI + message);
            check = console.nextLine();
            keepGoing = true;

            for (int i = 0; i < check.length(); i++) {
                char c = check.charAt(i);
                int index = hexabet.indexOf(c);

                if (index == -1) {
                    keepGoing = false;
                    System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                    break;
                }
            }
        }
        return new Hexadecimal(check);
    }

    /** doAnother checks if the user would like to do another one of their current calculations
     * @param ANSI is the ANSI code for the desired color of the message
     * @return returns true if user would like to do another or false if not*/
    public boolean doAnother(String ANSI) {
        keepGoing = false;
        boolean doAnother = true;
        String answer = "";

        while (!keepGoing) {
            System.out.println(ANSI + "Would you like to do another?" +
                    "(y - yes, n - no)");
            answer = console.nextLine();
            if (answer.length() > 1 ||
                    (answer.charAt(0) != 'y' && answer.charAt(0) != 'n')) {
                System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
            } else {
                keepGoing = true;
            }

        }
        if (answer.charAt(0) == 'n') {
            doAnother = false;
        }

        return doAnother;
    }
}
