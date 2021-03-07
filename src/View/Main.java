package View;

import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        //MainMenu mainMenu = new MainMenu();       Use for CLI
        //mainMenu.menuDisplay();

        JFrame frame = new JFrame("TestCalc1");
        frame.setContentPane(new CalculatorGUI().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
