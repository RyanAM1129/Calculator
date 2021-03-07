package View;

import Model.CalculatorGUI;

import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        //MainMenu mainMenu = new MainMenu();       Use for CLI
        //mainMenu.menuDisplay();

        JFrame frame = new JFrame("CalculatorGUI");
        frame.setContentPane(new CalculatorGUI().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
