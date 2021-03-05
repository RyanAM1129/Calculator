package Model;

import Controller.BinaryCalculator;
import Controller.DecimalCalculator;

import javax.swing.*;

public class CalculatorGUI {
    private JTabbedPane calculatorTabPane;
    private JPanel mainPanel;
    private JTabbedPane bandwidthTabPane;
    private JPanel decimalCalcPanel;
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
    private JTabbedPane binaryTabPane;
    private JPanel binCalculatorPanel;
    private JTextField binCalcDisplay;
    private JButton binCalcClearButton;
    private JButton binCalc1Button;
    private JButton binCalc0Button;
    private JButton binCalcAddButton;
    private JButton binCalcSubtractButton;
    private JButton binCalcMultiplyButton;
    private JButton binCalcDivisionButton;
    private JButton binCalcEqualButton;
    private JButton binCalcNegateButton;
    private JPanel binCalcOperatorPanel;
    private JPanel binCalcButtonPanel;
    private JLabel binCalcAnswerLabel;
    private JPanel binCalcDisplayPanel;
    private JPanel binaryToDecimalPanel;
    private JPanel decimalToBinaryPanel;
    private JButton binToDecNegateButton;
    private JButton toDecimalButton;
    private JTextField decToBinDisplay;
    private JButton decToBinClearButton;
    private JLabel decToBinAnswerLabel;
    private JLabel binToDecAnswerLabel;
    private JButton binToDecClearButton;
    private JTextField binToDecDisplay;
    private JButton binToDec1Button;
    private JButton binToDec0Button;
    private JPanel binToDecDisplayPanel;
    private JPanel binToDecButtonPanel;
    private JPanel binToDecOperatorPanel;
    private JPanel decToBinDisplayPanel;
    private JPanel decToBinButtonPanel;
    private JButton decToBin7Button;
    private JButton decToBin8Button;
    private JButton decToBin9Button;
    private JButton decToBin4Button;
    private JButton decToBin2Button;
    private JButton decToBin5Button;
    private JButton decToBin6Button;
    private JButton decToBin3Button;
    private JButton decToBin1Button;
    private JButton decToBin0Button;
    private JPanel decToBinOperatorPanel;
    private JButton decToBinNegateButton;
    private JButton toBinaryButton;
    private double decCalcHold;
    private int binCalcHold;
    private char decCalcOperand;
    private char binCalcOperand;
    private DecimalCalculator decCalc;
    private BinaryCalculator binCalc;
    private boolean answerDisplaying;

    public CalculatorGUI(){
        decDisplay.setEditable(false);
        decCalc = new DecimalCalculator();
        binCalc = new BinaryCalculator();

        decClearButton.addActionListener(ae -> {
            if(decDisplay.getText().length() == 0){
                decCalcHold = 0.0;
                decCalcOperand = ' ';
            }
            else{
                decDisplay.setText("");
            }
        });
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
            decCalcOperand = '+';
            decCalcHold = Double.parseDouble(decDisplay.getText());
            decDisplay.setText("");
        });
        decSubtractButton.addActionListener(ae -> {
            decCalcOperand = '-';
            decCalcHold = Double.parseDouble(decDisplay.getText());
            decDisplay.setText("");
        });
        decMultiplyButton.addActionListener(ae -> {
            decCalcOperand = '*';
            decCalcHold = Double.parseDouble(decDisplay.getText());
            decDisplay.setText("");
        });
        decDivisionButton.addActionListener(ae -> {
            decCalcOperand = '/';
            decCalcHold = Double.parseDouble(decDisplay.getText());
            decDisplay.setText("");
        });
        decEqualButton.addActionListener(ae -> {
            if(decCalcOperand == '+'){
                decDisplay.setText("" + decCalc.add(decCalcHold, Double.parseDouble(decDisplay.getText())));
                decCalcOperand = ' ';
            }
            else if(decCalcOperand == '-'){
                decDisplay.setText("" + decCalc.subtract(decCalcHold, Double.parseDouble(decDisplay.getText())));
                decCalcOperand = ' ';
                answerDisplaying = true;
            }
            else if(decCalcOperand == '*'){
                decDisplay.setText("" + decCalc.multiply(decCalcHold, Double.parseDouble(decDisplay.getText())));
                decCalcOperand = ' ';
                answerDisplaying = true;
            }
            else if(decCalcOperand == '/'){
                decDisplay.setText("" + decCalc.divide(decCalcHold, Double.parseDouble(decDisplay.getText())));
                decCalcOperand = ' ';
                answerDisplaying = true;
            }
        });
        decNegateButton.addActionListener(ae -> {
            if(!decDisplay.getText().isEmpty()) {
                decDisplay.setText(Double.parseDouble(decDisplay.getText()) * (-1) + "");
            }
        });


        binCalcClearButton.addActionListener(ae -> {
            if(binCalcDisplay.getText().length() == 0){
                binCalcHold = 0;
                binCalcOperand = ' ';
            }
            else{
                binCalcDisplay.setText("");
            }
        });
        //ActionListeners for Binary Calculator Number Buttons
        binCalc0Button.addActionListener(ae -> {
            if(answerDisplaying){
                binCalcDisplay.setText("");
                answerDisplaying = false;
            }
            binCalcDisplay.setText(binCalcDisplay.getText() + "0");
        });
        binCalc1Button.addActionListener(ae -> {
            if(answerDisplaying){
                binCalcDisplay.setText("");
                answerDisplaying = false;
            }
            binCalcDisplay.setText(binCalcDisplay.getText() + "1");
        });
        //ActionListeners for Binary Calculator Operand Buttons
        binCalcNegateButton.addActionListener(ae -> {
            if(!binCalcDisplay.getText().isEmpty()) {
                binCalcDisplay.setText(Double.parseDouble(binCalcDisplay.getText()) * (-1) + "");
            }
        });
        binCalcAddButton.addActionListener(ae -> {
            binCalcOperand = '+';
            binCalcHold = Integer.parseInt(binCalcDisplay.getText());
            binCalcDisplay.setText("");
        });
        binCalcSubtractButton.addActionListener(ae -> {
            binCalcOperand = '-';
            binCalcHold = Integer.parseInt(binCalcDisplay.getText());
            binCalcDisplay.setText("");
        });
        binCalcMultiplyButton.addActionListener(ae -> {
            binCalcOperand = '*';
            binCalcHold = Integer.parseInt(binCalcDisplay.getText());
            binCalcDisplay.setText("");
        });
        binCalcDivisionButton.addActionListener(ae -> {
            binCalcOperand = '/';
            binCalcHold = Integer.parseInt(binCalcDisplay.getText());
            binCalcDisplay.setText("");
        });
        binCalcEqualButton.addActionListener(ae -> {
            if(binCalcOperand == '+'){
                binCalcAnswerLabel.setText("" + binCalc.add(new Binary(binCalcHold),
                        new Binary(Integer.parseInt(binCalcDisplay.getText()))).getBitStr());
                binCalcOperand = ' ';
            }
            else if(binCalcOperand == '-'){
                binCalcAnswerLabel.setText("" + binCalc.subtract(new Binary(binCalcHold),
                        new Binary(Integer.parseInt(binCalcDisplay.getText()))).getBitStr());
                binCalcOperand = ' ';
                answerDisplaying = true;
            }
            else if(binCalcOperand == '*'){
                binCalcAnswerLabel.setText("" + binCalc.multiply(new Binary(binCalcHold),
                        new Binary(Integer.parseInt(binCalcDisplay.getText()))).getBitStr());
                binCalcOperand = ' ';
                answerDisplaying = true;
            }
            else if(binCalcOperand == '/'){
                binCalcDisplay.setText("" + binCalc.divide(new Binary(binCalcHold),
                        new Binary(Integer.parseInt(binCalcDisplay.getText()))).getBitStr());
//                binCalcAnswerLabel.setText(binAdd1.getBitStr() + "(" + binAdd1.getDecimal() + ") + " +
//                        binAdd2.getBitStr() + "(" + binAdd2.getDecimal() + ") = " +
//                        answer.getBitStr() + "(" + answer.getDecimal() + ")");
                binCalcOperand = ' ';
                answerDisplaying = true;
            }
        });

    }

    public JPanel getMainPanel(){
        return this.mainPanel;
    }
}
