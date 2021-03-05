package Model;

import Controller.DecimalCalculator;

import javax.swing.*;

public class TestCalc1 {
    private JTabbedPane calculatorTabPane;
    private JPanel panel1;
    private JButton panel2Button;
    private JTabbedPane bandwidthTabPane;
    private JPanel DecimalCalcPanel;
    private JButton decClearButton;
    private JTextField decDisplay;
    private JPanel decDisplayPanel;
    private JButton decDivisionButton;
    private JButton decMultiplyButton;
    private JButton decSubtractButton;
    private JButton decAddButton;
    private JButton decEqualButton;
    private JButton dec7Button;
    private JButton dec8Button;
    private JButton dec9Button;
    private JButton dec4Button;
    private JButton dec2Button;
    private JButton dec5Button;
    private JButton dec6Button;
    private JButton dec3Button;
    private JButton dec1Button;
    private JButton dec0Button;
    private JPanel decButtonPanel;
    private JButton decDotButton;
    private JPanel decOperandPanel;
    private JButton decNegateButton;
    private double hold;
    private char operand;
    private DecimalCalculator decCalc;
    private boolean answerDisplaying;

    public TestCalc1(){
        decDisplay.setEditable(false);
        decCalc = new DecimalCalculator();

        //ActionListeners for Decimal Calculator Number Buttons
        dec0Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "0");
        });
        dec1Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "1");
        });
        dec2Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "2");
        });
        dec3Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "3");
        });
        dec4Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "4");
        });
        dec5Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "5");
        });
        dec6Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "6");
        });
        dec7Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "7");
        });
        dec8Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "8");
        });
        dec9Button.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("");
                answerDisplaying = false;
            }
            decDisplay.setText(decDisplay.getText() + "9");
        });
        decDotButton.addActionListener(ae -> {
            if(answerDisplaying){
                decDisplay.setText("0");
                answerDisplaying = false;
            }
            else if(decDisplay.getText().isEmpty()){
                decDisplay.setText("0");
            }
            decDisplay.setText(decDisplay.getText() + ".");
        });
        //ActionListeners for Decimal Calculator Operand Buttons
        decAddButton.addActionListener(ae -> {
            operand = '+';
            hold = Double.parseDouble(decDisplay.getText());
            decDisplay.setText("");
        });
        decSubtractButton.addActionListener(ae -> decDisplay.setText(decDisplay.getText() + "1"));
        decMultiplyButton.addActionListener(ae -> decDisplay.setText(decDisplay.getText() + "1"));
        decDivisionButton.addActionListener(ae -> decDisplay.setText(decDisplay.getText() + "1"));
        decEqualButton.addActionListener(ae -> {
            if(operand == '+'){
                decDisplay.setText("" + decCalc.add(hold, Double.parseDouble(decDisplay.getText())));
                operand = ' ';
            }
            else if(operand == '-'){
                decDisplay.setText("" + decCalc.subtract(hold, Double.parseDouble(decDisplay.getText())));
                operand = ' ';
                answerDisplaying = true;
            }
            else if(operand == '*'){
                decDisplay.setText("" + decCalc.multiply(hold, Double.parseDouble(decDisplay.getText())));
                operand = ' ';
                answerDisplaying = true;
            }
            else if(operand == '/'){
                decDisplay.setText("" + decCalc.divide(hold, Double.parseDouble(decDisplay.getText())));
                operand = ' ';
                answerDisplaying = true;
            }
        });
        decNegateButton.addActionListener(ae -> {
            hold = Double.parseDouble(decDisplay.getText()) * -1;
            decDisplay.setText(hold + "");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestCalc1");
        frame.setContentPane(new TestCalc1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
