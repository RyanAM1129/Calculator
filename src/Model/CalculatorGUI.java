package Model;

import Controller.DecimalCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorGUI extends JPanel{
    private JPanel mainPanel;
    private JButton clearButton;
    private JTextField display;
    private JPanel displayPanel;
    private JPanel operatorPanel;
    private JPanel numberPanel;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton nineButton;
    private JButton sixButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton zeroButton;
    private JButton decimalButton;
    private JButton negateButton;
    private JButton equalButton;
    private JButton backButton;
    private DecimalCalculator decCalc;
    private char operand;
    private double hold;
    private boolean answerDisplaying;

    public CalculatorGUI() {
        answerDisplaying = false;
        display.setEditable(false);
        decCalc = new DecimalCalculator();

        clearButton.addActionListener(ae -> {
            if(display.getText().length() == 0){
                hold = 0.0;
                operand = ' ';
            }
            else{
                display.setText("");
            }
        });

        oneButton.addActionListener(ae -> display.setText(display.getText() + "1"));

        twoButton.addActionListener(ae -> display.setText(display.getText() + "2"));

        threeButton.addActionListener(ae -> display.setText(display.getText() + "3"));

        fourButton.addActionListener(ae -> display.setText(display.getText() + "4"));

        fiveButton.addActionListener(ae -> display.setText(display.getText() + "5"));

        sixButton.addActionListener(ae -> display.setText(display.getText() + "6"));

        sevenButton.addActionListener(ae -> display.setText(display.getText() + "7"));

        eightButton.addActionListener(ae -> display.setText(display.getText() + "8"));

        nineButton.addActionListener(ae -> display.setText(display.getText() + "9"));

        zeroButton.addActionListener(ae -> display.setText(display.getText() + "0"));

        decimalButton.addActionListener(ae -> display.setText(display.getText() + "."));

        negateButton.addActionListener(ae -> {
            hold = Double.parseDouble(display.getText()) * -1;
            display.setText(hold + "");
        });

        addButton.addActionListener(ae -> {
            operand = '+';
            hold = Double.parseDouble(display.getText());
            display.setText("");
        });

        equalButton.addActionListener(ae -> {
            if(operand == '+'){
                display.setText("" + decCalc.add(hold, Double.parseDouble(display.getText())));
                operand = ' ';
            }
            else if(operand == '-'){
                display.setText("" + decCalc.subtract(hold, Double.parseDouble(display.getText())));
                operand = ' ';
                answerDisplaying = true;
            }
            else if(operand == '*'){
                display.setText("" + decCalc.multiply(hold, Double.parseDouble(display.getText())));
                operand = ' ';
                answerDisplaying = true;
            }
            else if(operand == '/'){
                display.setText("" + decCalc.divide(hold, Double.parseDouble(display.getText())));
                operand = ' ';
                answerDisplaying = true;
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Decimal Calculator");
        frame.setContentPane(new CalculatorGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
