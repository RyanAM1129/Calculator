package View;

public class MainMenu extends Menu{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public void menuDisplay(){
        boolean keepGoing = false;
        Communicator com = new Communicator();

        while (!keepGoing) {
            keepGoing = false;
            System.out.println(ANSI_CYAN + "1 - Binary Calculator");
            System.out.println(ANSI_PURPLE + "2 - Hexadecimal Calculator");
            System.out.println(ANSI_GREEN + "3 - Bandwidth Calculator");
            System.out.println(ANSI_BLUE + "4 - BigInteger Calculator");
            System.out.println(ANSI_WHITE + "5 - Decimal Calculator");
            System.out.println(ANSI_RED + "6 - Exit Program");

            switch (com.getInt(1, 6, ANSI_CYAN, "Enter number of choice: ")) {
                case 1: /**Binary Calculator*/
                    BinaryMenu binMenu = new BinaryMenu();
                    binMenu.menuDisplay();
                    keepGoing = false;
                    break;
                case 2: /**Hexadecimal Calculator*/
                    HexadecMenu hexMenu = new HexadecMenu();
                    hexMenu.menuDisplay();
                    keepGoing = false;
                    break;
                case 3: /**Bandwidth Calculator*/
                    BandwidthMenu bandMenu = new BandwidthMenu();
                    bandMenu.menuDisplay();
                    keepGoing = false;
                    break;
                case 4: /**BigInteger Calculator*/
                    BigIntegerMenu bigIntMenu = new BigIntegerMenu();
                    bigIntMenu.menuDisplay();
                    keepGoing = false;
                    break;
                case 5: /**Decimal Calculator*/
                    DecimalMenu decMenu = new DecimalMenu();
                    decMenu.menuDisplay();
                    keepGoing = false;
                    break;
                case 6:
                    keepGoing = true;
                    System.out.println(ANSI_RED + "Program closing...");
            }
        }
    }
}
