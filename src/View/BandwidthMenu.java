package View;

import Controller.BandwidthCalculator;

import java.util.Scanner;

/**
 * BandwidthMenu is designed to display all the menu options for the Bandwidth Calculator
 * */
public class BandwidthMenu extends Menu{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    BandwidthCalculator bandCalc = new BandwidthCalculator();
    private boolean keepGoing = false;

    public void menuDisplay(){
        int userChoice = 0;
        Scanner console = new Scanner(System.in);
        while (userChoice != 5) {
            keepGoing = false;  //Ensure sentinel is false at the beginning of each iteration

            //Check if user input is number
            while (!keepGoing) {
                System.out.println(ANSI_GREEN +
                        "1 - Data Unit Converter\n2 - Down/Up Load Time Calculator\n" +
                        "3 - Website Bandwidth Calculator\n4 - Hosting Bandwidth Calculator\n" +
                        "5 - Main Menu");
                if (console.hasNextInt()) {
                    keepGoing = true;
                    userChoice = console.nextInt();
                    console.nextLine();
                } else {
                    console.next();
                    System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
                }
            }

            if (userChoice > 0 && userChoice < 6) {
                switch (userChoice) {

                    case 1: //Data Unit Converter
                        keepGoing = false;  //Update Gatekeeper

                        //Receives and checks number portion of data
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN + "Please enter amount of data " +
                                    "(Example: 500 or 0.01): ");

                            if (!console.hasNextDouble()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                                console.next();
                            } else {
                                keepGoing = true;
                                bandCalc.setData(console.nextDouble());
                                console.nextLine();
                            }
                        }
                        keepGoing = false;  //Update Gatekeeper

                        //Receives and checks unit portion of data
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN +
                                    "bits = b\t\tBytes = B\nkilobits = kb\tKiloBytes = KB" +
                                    "\nmegabits = mb\tMegaBytes = MB\ngigabits = gb" +
                                    "\tGigaBytes = GB\nterabits = tb\tTeraBytes = TB");
                            System.out.println("\nPlease enter type of data : ");
                            bandCalc.setUnit(console.nextLine());

                            if (!bandCalc.isUnit()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                            } else {
                                keepGoing = true;
                            }
                        }
                        keepGoing = false; //Update Gatekeeper

                        //Builds bandwidth field using data and unit fields
                        bandCalc.buildBandwidth();
                        //Changes bandwidth field to bits and sets it to bits field
                        bandCalc.setBits(bandCalc.toBits(bandCalc.getBandwidth()));
                        //bandCalc.unitConverter();

                        break;

                    case 2: //Down/Up Load Time Controller.Calculator
                        keepGoing = false;  //Update Gatekeeper

                        //Receives and checks number portion of file size
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN + "Please enter file size without unit" +
                                    " (Example: 500 or 0.01): ");

                            if (!console.hasNextDouble()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                                console.next();
                            } else {
                                keepGoing = true;
                                bandCalc.setData(console.nextDouble());
                                console.nextLine();
                            }
                        }
                        keepGoing = false;  //Update Sentinel

                        //Receives and checks unit portion of file
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN + "Bytes = B\nKiloBytes = KB" +
                                    "\nMegaBytes = MB\nGigaBytes = GB\nTeraBytes = TB");
                            System.out.println("\nPlease enter unit of file : ");
                            bandCalc.setUnit(console.nextLine().toUpperCase());

                            if (!bandCalc.isUnit()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                            } else {
                                keepGoing = true;
                            }
                        }
                        keepGoing = false;  //Update Sentinel

                        bandCalc.buildFile();

                        //Receives and checks bandwidth unit
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN +
                                    "Is your bandwidth in:\n\t1 - bit/s\n\t2 - kilobit/s" +
                                    "\n\t3 - megabit/s\n\t4 - gigabit/s\n\t5 - terabit/s");
                            if (console.hasNextInt()) {
                                userChoice = console.nextInt();
                                if (userChoice > 0 && userChoice <= 5) {
                                    if (userChoice == 1) {
                                        bandCalc.setUnit("b");
                                    } else if (userChoice == 2) {
                                        bandCalc.setUnit("kb");
                                    } else if (userChoice == 3) {
                                        bandCalc.setUnit("mb");
                                    } else if (userChoice == 4) {
                                        bandCalc.setUnit("gb");
                                    } else {
                                        bandCalc.setUnit("tb");
                                    }
                                    keepGoing = true;
                                } else {
                                    System.out.println(ANSI_RED +
                                            "!!!We are sorry, your choice is invalid!!!");
                                }
                            } else {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                            }
                        }
                        keepGoing = false;

                        //Receives and checks number portion of bandwidth
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN + "Please enter bandwidth without unit" +
                                    " (Example: 500 or 0.01): ");

                            if (!console.hasNextDouble()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                                console.next();
                            } else {
                                keepGoing = true;
                                bandCalc.setData(console.nextDouble());
                                console.nextLine();
                            }
                        }
                        keepGoing = false;

                        bandCalc.buildBandwidth();

                        System.out.println(ANSI_YELLOW + "Download or upload time needed is: ~" +
                                bandCalc.convertTime(bandCalc.toBits(bandCalc.getFile()) /
                                        bandCalc.toBits(bandCalc.getBandwidth())));
                        break;

                    case 3: //Website Bandwidth Controller.Calculator
                        keepGoing = false;
                        int redundancy = 1;

                        //Receive and check viewFreq switch case value
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN +
                                    "Will you be viewing the page:\n\t1 - per second" +
                                    "\n\t2 - per minute\n\t3 - per hour\n\t4 - per day" +
                                    "\n\t5 - per week\n\t6 - per month\n\t7 - per year");

                            if (console.hasNextInt()) {
                                userChoice = console.nextInt();
                                if (userChoice < 1 || userChoice > 7) {
                                    System.out.println(ANSI_RED +
                                            "!!!We are sorry, your choice is invalid!!!");
                                } else {
                                    keepGoing = true;
                                }
                            } else {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                            }
                        }
                        keepGoing = false;

                        //Use switch case to find viewRate
                        switch (userChoice) {
                            case 1: //per second
                                while (!keepGoing) {
                                    System.out.println(ANSI_GREEN + "How many times per second" +
                                            " will you view the page? ");

                                    if (!console.hasNextDouble()) {
                                        System.out.println(ANSI_RED +
                                                "!!!We are sorry, your input is invalid!!!");
                                        console.next();
                                    } else {
                                        bandCalc.setViewRate(console.nextDouble());
                                        console.nextLine();
                                        keepGoing = true;
                                    }
                                }
                                break;

                            case 2: //per minute
                                while (!keepGoing) {
                                    System.out.println(ANSI_GREEN + "How many times per minute" +
                                            " will you view the page? ");

                                    if (!console.hasNextDouble()) {
                                        System.out.println(ANSI_RED +
                                                "!!!We are sorry, your input is invalid!!!");
                                        console.next();
                                    } else {
                                        bandCalc.setViewRate(console.nextDouble());
                                        console.nextLine();
                                        keepGoing = true;
                                    }
                                }
                                break;

                            case 3: //per hour
                                while (!keepGoing) {
                                    System.out.println(ANSI_GREEN + "How many times per hour" +
                                            " will you view the page? ");

                                    if (!console.hasNextDouble()) {
                                        System.out.println(ANSI_RED +
                                                "!!!We are sorry, your input is invalid!!!");
                                        console.next();
                                    } else {
                                        bandCalc.setViewRate(console.nextDouble());
                                        console.nextLine();
                                        keepGoing = true;
                                    }
                                }
                                break;

                            case 4: //per day
                                while (!keepGoing) {
                                    System.out.println(ANSI_GREEN + "How many times per day" +
                                            " will you view the page? ");

                                    if (!console.hasNextDouble()) {
                                        System.out.println(ANSI_RED +
                                                "!!!We are sorry, your input is invalid!!!");
                                        console.next();
                                    } else {
                                        bandCalc.setViewRate(console.nextDouble());
                                        console.nextLine();
                                        keepGoing = true;
                                    }
                                }
                                break;

                            case 5: //per week
                                while (!keepGoing) {
                                    System.out.println(ANSI_GREEN + "How many times per week" +
                                            " will you view the page? ");

                                    if (!console.hasNextDouble()) {
                                        System.out.println(ANSI_RED +
                                                "!!!We are sorry, your input is invalid!!!");
                                        console.next();
                                    } else {
                                        bandCalc.setViewRate(console.nextDouble());
                                        console.nextLine();
                                        keepGoing = true;
                                    }
                                }
                                break;

                            case 6: //per month
                                while (!keepGoing) {
                                    System.out.println(ANSI_GREEN + "How many times per month" +
                                            " will you view the page? ");

                                    if (!console.hasNextDouble()) {
                                        System.out.println(ANSI_RED +
                                                "!!!We are sorry, your input is invalid!!!");
                                        console.next();
                                    } else {

                                        bandCalc.setViewRate(console.nextDouble());
                                        console.nextLine();
                                        keepGoing = true;
                                    }
                                }
                                break;

                            case 7: //per year
                                while (!keepGoing) {
                                    System.out.println(ANSI_GREEN + "How many times per year" +
                                            " will you view the page? ");

                                    if (!console.hasNextDouble()) {
                                        System.out.println(ANSI_RED +
                                                "!!!We are sorry, your input is invalid!!!");
                                        console.next();
                                    } else {
                                        bandCalc.setViewRate(console.nextDouble());
                                        console.nextLine();
                                        keepGoing = true;
                                    }
                                }
                                break;

                        }
                        keepGoing = false;

                        //Receives and checks pageSize
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN + "What is the average page size? ");
                            System.out.println(ANSI_GREEN + "(Do not include unit): ");

                            if (!console.hasNextDouble()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                                console.next();
                            } else {
                                bandCalc.setData(console.nextDouble());
                                console.nextLine();
                                keepGoing = true;
                            }
                        }
                        keepGoing = false;

                        //Receive and check pageUnit switch case value
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN +
                                    "What unit is the average page? \n\tB - Bytes" +
                                    "\n\tKB - KiloBytes\n\tMB - MegaBytes\n\tGB - GigaBytes" +
                                    "\n\tTB - TeraBytes");
                            bandCalc.setUnit(console.nextLine().toUpperCase());

                            if (!bandCalc.isUnit()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                            } else {
                                keepGoing = true;
                            }
                        }
                        keepGoing = false;

                        //Receive and check Redundancy factor
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN + "What is the redundancy factor?: ");
                            if (console.hasNextInt()) {
                                redundancy = console.nextInt();
                                console.nextLine();
                                keepGoing = true;

                                if (redundancy <= 0) {
                                    System.out.println(ANSI_RED +
                                            "!!!We are sorry, your choice is invalid!!!");
                                    keepGoing = false;
                                }
                            } else {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                                console.next();
                            }
                        }

                        //Uses buildFile() so we can convert the page size into bits
                        bandCalc.buildFile();
                        bandCalc.setBits(bandCalc.toBits(bandCalc.getFile()));

                        bandCalc.webBandCalc(userChoice, redundancy);
                        userChoice = 3; //Changes userChoice back to original value
                        break;

                    case 4: //Hosting Bandwidth Converter
                        keepGoing = false;

                        //Receive and check monthly use value
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN + "What is the Monthly Usage?: ");
                            System.out.println(ANSI_GREEN + "(Do not include unit)");

                            if (!console.hasNextDouble()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your input is invalid!!!");
                                console.next();
                            } else {
                                bandCalc.setData(console.nextDouble());
                                console.nextLine();
                                keepGoing = true;
                            }
                        }
                        keepGoing = false;  //Update Sentinel

                        //Receive and check monthly use unit
                        while (!keepGoing) {
                            System.out.println(ANSI_GREEN + "What unit is your monthly usage in?: " +
                                    "\n\t1 - Bytes\n\t2 - KiloBytes\n\t3 - MegaBytes" +
                                    "\n\t4 - GigaBytes\n\t5 - TeraBytes");

                            if (!console.hasNextInt()) {
                                System.out.println(ANSI_RED +
                                        "!!!We are sorry, your choice is invalid!!!");
                                console.next();
                            } else {
                                userChoice = console.nextInt();
                                keepGoing = true;
                                if (userChoice < 1 || userChoice > 5) {
                                    System.out.println(ANSI_RED +
                                            "!!!We are sorry, your choice is invalid!!!");
                                    keepGoing = false;
                                }

                            }
                        }
                        keepGoing = false;  //Update Sentinel

                        bandCalc.hostBandCalc(userChoice);

                        userChoice = 4;

                }
            } else {
                System.out.println(ANSI_RED + "!!!We are sorry, your choice is invalid!!!");
            }
        }
    }
}
