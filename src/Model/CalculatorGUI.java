package Model;

import Controller.*;

import javax.swing.*;
import java.math.BigInteger;

public class CalculatorGUI {
    private JTabbedPane calculatorTabPane;
    private JPanel mainPanel;
    private JTabbedPane binaryTab;
    private JTextField decimal1;
    private JTextField decimal2;
    private JButton decCalcAddButton;
    private JButton decCalcSubButton;
    private JButton decCalcMultButton;
    private JButton decCalcDivButton;
    private JTextArea decCalcAnswerDisplay;
    private JPanel decCalcTab;
    private JPanel decCalcOperandPanel;
    private JScrollPane decCalcAnswerScroll;
    private JButton decCalcClearButton;
    private JPanel bIntCalcTab;
    private JTextField bigInteger1;
    private JTextField bigInteger2;
    private JPanel bIntCalcOperandPanel;
    private JScrollPane bIntCalcAnswerScroll;
    private JButton bIntClearButton;
    private JTextArea bIntAnswerDisplay;
    private JButton bIntCalcAddButton;
    private JButton bIntCalcSubButton;
    private JButton bIntCalcMultButton;
    private JButton bIntCalcDivButton;
    private JPanel binCalcPanel;
    private JTextField binary1;
    private JTextField binary2;
    private JPanel binCalcOperandPanel;
    private JButton binCalcAddButton;
    private JButton binCalcSubButton;
    private JButton binCalcMultButton;
    private JButton binCalcDivButton;
    private JScrollPane binCalcScroll;
    private JButton binCalcClearButton;
    private JPanel binConvPanel;
    private JTextField binConvField;
    private JButton toBinaryButton;
    private JButton binToDecimalButton;
    private JPanel binConvOperandPanel;
    private JTextArea binConvAnswerDisplay;
    private JScrollPane binConvScroll;
    private JTextArea binCalcAnswerDisplay;
    private JButton binConvClearButton;
    private JTabbedPane hexadecimalTab;
    private JPanel hexCalcPanel;
    private JPanel hexConverterPanel;
    private JTextField hexadecimal1;
    private JTextField hexadecimal2;
    private JPanel hexCalcOperandPanel;
    private JButton hexCalcAddButton;
    private JButton hexCalcSubButton;
    private JButton hexCalcMultButton;
    private JButton hexCalcDivButton;
    private JScrollPane hexCalcScroll;
    private JButton hexCalcClearButton;
    private JTextArea hexCalcAnswerDisplay;
    private JPanel hexConvOperandPanel;
    private JTextField hexConvField;
    private JButton toHexadecimalButton;
    private JButton hexToDecimalButton;
    private JButton hexConvClearButton;
    private JScrollPane hexConvScroll;
    private JTextArea hexConvAnswerDisplay;
    Validator validator;
    DecimalCalculator decCalc;
    BigIntegerCalculator bIntCalc;
    BinaryCalculator binCalc;
    HexadecCalculator hexCalc;

    public CalculatorGUI(){
        validator = new Validator();


        decCalc = new DecimalCalculator();
        decCalcAnswerDisplay.setEditable(false);

        decCalcClearButton.addActionListener(ae -> {
            if(decimal1.getText().isEmpty() && decimal2.getText().isEmpty()){
                decCalcAnswerDisplay.setText("");
            }
            else{
                decimal1.setText("");
                decimal2.setText("");
            }
        });
        decCalcAddButton.addActionListener(ae -> {
            if(validator.isDecimal(decimal1.getText()) && decCalc.isNum(decimal2.getText())){
                double answer = decCalc.add(Double.parseDouble(decimal1.getText()),
                        Double.parseDouble(decimal2.getText()));
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append(decimal1.getText() + " + " + decimal2.getText() + " = " +
                        answer);
            }
        });
        decCalcSubButton.addActionListener(ae -> {
            if(validator.isDecimal(decimal1.getText()) && decCalc.isNum(decimal2.getText())){
                double answer = decCalc.subtract(Double.parseDouble(decimal1.getText()),
                        Double.parseDouble(decimal2.getText()));
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append(decimal1.getText() + " - " + decimal2.getText() + " = " +
                        answer);
            }
        });
        decCalcMultButton.addActionListener(ae -> {
            if(validator.isDecimal(decimal1.getText()) && decCalc.isNum(decimal2.getText())){
                double answer = decCalc.multiply(Double.parseDouble(decimal1.getText()),
                        Double.parseDouble(decimal2.getText()));
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append(decimal1.getText() + " * " + decimal2.getText() + " = " +
                        answer);
            }
        });
        decCalcDivButton.addActionListener(ae -> {
            if(validator.isDecimal(decimal1.getText()) && decCalc.isNum(decimal2.getText()) &&
                    (Double.parseDouble(decimal2.getText()) != 0)){
                double answer = decCalc.divide(Double.parseDouble(decimal1.getText()),
                        Double.parseDouble(decimal2.getText()));
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append(decimal1.getText() + " / " + decimal2.getText() + " = " +
                        answer);
            }
        });


        bIntCalc = new BigIntegerCalculator();
        bIntAnswerDisplay.setEditable(false);

        bIntClearButton.addActionListener(ae -> {
            if(bigInteger1.getText().isEmpty() && bigInteger2.getText().isEmpty()){
                bIntAnswerDisplay.setText("");
            }
            else{
                bigInteger1.setText("");
                bigInteger2.setText("");
            }
        });
        bIntCalcAddButton.addActionListener(ae -> {
            if(validator.isBigInt(bigInteger1.getText()) && validator.isBigInt(bigInteger2.getText())){
                BigInteger answer = bIntCalc.add(new BigInteger(bigInteger1.getText()),
                        new BigInteger(bigInteger2.getText()));
                if(!bIntAnswerDisplay.getText().isEmpty()){
                    bIntAnswerDisplay.append("\n");
                }
                bIntAnswerDisplay.append(bigInteger1.getText() + " + " + bigInteger2.getText() + " = " +
                        answer.toString());
            }
        });
        bIntCalcSubButton.addActionListener(ae -> {
            if(validator.isBigInt(bigInteger1.getText()) && validator.isBigInt(bigInteger2.getText())) {
                BigInteger answer = bIntCalc.subtract(new BigInteger(bigInteger1.getText()),
                        new BigInteger(bigInteger2.getText()));
                if (!bIntAnswerDisplay.getText().isEmpty()) {
                    bIntAnswerDisplay.append("\n");
                }
                bIntAnswerDisplay.append(bigInteger1.getText() + " - " + bigInteger2.getText() + " = " +
                        answer.toString());
            }
        });
        bIntCalcMultButton.addActionListener(ae -> {
            if(validator.isBigInt(bigInteger1.getText()) && validator.isBigInt(bigInteger2.getText())) {
                BigInteger answer = bIntCalc.multiply(new BigInteger(bigInteger1.getText()),
                        new BigInteger(bigInteger2.getText()));
                if (!bIntAnswerDisplay.getText().isEmpty()) {
                    bIntAnswerDisplay.append("\n");
                }
                bIntAnswerDisplay.append(bigInteger1.getText() + " * " + bigInteger2.getText() + " = " +
                        answer.toString());
            }
        });
        bIntCalcDivButton.addActionListener(ae -> {
            if(validator.isBigInt(bigInteger1.getText()) && validator.isBigInt(bigInteger2.getText()) &&
                    !(new BigInteger(bigInteger2.getText()).equals(new BigInteger("0")))){
                BigInteger answer = bIntCalc.divide(new BigInteger(bigInteger1.getText()),
                        new BigInteger(bigInteger2.getText()));
                if(!bIntAnswerDisplay.getText().isEmpty()){
                    bIntAnswerDisplay.append("\n");
                }
                bIntAnswerDisplay.append(bigInteger1.getText() + " / " + bigInteger2.getText() + " = " +
                        answer + " with a remainder of " + bIntCalc.modular(new BigInteger(bigInteger1.getText()),
                        new BigInteger(bigInteger2.getText())));
            }
        });


        binCalc = new BinaryCalculator();
        binCalcAnswerDisplay.setEditable(false);

        binCalcClearButton.addActionListener(ae -> {
            if(binary1.getText().isEmpty() && binary2.getText().isEmpty()){
                binCalcAnswerDisplay.setText("");
            }
            else{
                binary1.setText("");
                binary2.setText("");
            }
        });
        binCalcAddButton.addActionListener(ae -> {
            if(validator.isBinary(binary1.getText()) && validator.isBinary(binary2.getText())){
                Binary tempBinary1 = new Binary(binary1.getText());
                Binary tempBinary2 = new Binary(binary2.getText());
                Binary answer = binCalc.add(tempBinary1, tempBinary2);
                if(!binCalcAnswerDisplay.getText().isEmpty()){
                    binCalcAnswerDisplay.append("\n");
                }
                binCalcAnswerDisplay.append(tempBinary1.toString() + " + " + tempBinary2.toString() + " = " +
                        answer.toString());
            }
        });
        binCalcSubButton.addActionListener(ae -> {
            if(validator.isBinary(binary1.getText()) && validator.isBinary(binary2.getText())){
                Binary tempBinary1 = new Binary(binary1.getText());
                Binary tempBinary2 = new Binary(binary2.getText());
                Binary answer = binCalc.subtract(tempBinary1, tempBinary2);
                if(!binCalcAnswerDisplay.getText().isEmpty()){
                    binCalcAnswerDisplay.append("\n");
                }
                binCalcAnswerDisplay.append(tempBinary1.toString() + " - " + tempBinary2.toString() + " = " +
                        answer.toString());
            }
        });
        binCalcMultButton.addActionListener(ae -> {
            if(validator.isBinary(binary1.getText()) && validator.isBinary(binary2.getText())){
                Binary tempBinary1 = new Binary(binary1.getText());
                Binary tempBinary2 = new Binary(binary2.getText());
                Binary answer = binCalc.multiply(tempBinary1, tempBinary2);
                if(!binCalcAnswerDisplay.getText().isEmpty()){
                    binCalcAnswerDisplay.append("\n");
                }
                binCalcAnswerDisplay.append(tempBinary1.toString() + " * " + tempBinary2.toString() + " = " +
                        answer.toString());
            }
        });
        binCalcDivButton.addActionListener(ae -> {
            if(validator.isBinary(binary1.getText()) && validator.isBinary(binary2.getText())){
                Binary tempBinary1 = new Binary(binary1.getText());
                Binary tempBinary2 = new Binary(binary2.getText());
                if(tempBinary2.getDecimal() != 0) {
                    Binary answer = binCalc.divide(tempBinary1, tempBinary2);
                    Binary remainder = binCalc.modular(tempBinary1, tempBinary2);
                    if (!binCalcAnswerDisplay.getText().isEmpty()) {
                        binCalcAnswerDisplay.append("\n");
                    }
                    binCalcAnswerDisplay.append(tempBinary1.toString() + " / " + tempBinary2.toString() + " = " +
                            answer.toString() + " with a remainder of " + remainder.toString());
                }
            }
        });

        binConvAnswerDisplay.setEditable(false);

        binConvClearButton.addActionListener(ae -> {
            if(binConvField.getText().isEmpty()){
                binConvAnswerDisplay.setText("");
            }
            else{
                binConvField.setText("");
            }
        });
        toBinaryButton.addActionListener(ae -> {
            if(validator.isInt(binConvField.getText())){
                Binary tempBinary = new Binary(Integer.parseInt(binConvField.getText()));
                if(!binConvAnswerDisplay.getText().isEmpty()){
                    binConvAnswerDisplay.append("\n");
                }
                binConvAnswerDisplay.append(tempBinary.getDecimal() + " in binary is " + tempBinary.getBitStr());
            }
        });
        binToDecimalButton.addActionListener(ae -> {
            if(validator.isBinary(binConvField.getText())){
                Binary tempBinary = new Binary(binConvField.getText());
                if(!binConvAnswerDisplay.getText().isEmpty()){
                    binConvAnswerDisplay.append("\n");
                }
                binConvAnswerDisplay.append(tempBinary.getBitStr() + " decimal value is " + tempBinary.getDecimal());
            }
        });


        hexCalc = new HexadecCalculator();
        hexCalcAnswerDisplay.setEditable(false);

        hexCalcClearButton.addActionListener(ae -> {
            if(hexadecimal1.getText().isEmpty() && hexadecimal2.getText().isEmpty()){
                hexCalcAnswerDisplay.setText("");
            }
            else{
                hexadecimal1.setText("");
                hexadecimal2.setText("");
            }
        });
        hexCalcAddButton.addActionListener(ae -> {
            if(validator.isHexadec(hexadecimal1.getText()) && validator.isHexadec(hexadecimal2.getText())){
                Hexadecimal tempHex1 = new Hexadecimal(hexadecimal1.getText());
                Hexadecimal tempHex2 = new Hexadecimal(hexadecimal2.getText());
                Hexadecimal answer = hexCalc.add(tempHex1, tempHex2);
                if(!hexCalcAnswerDisplay.getText().isEmpty()){
                    hexCalcAnswerDisplay.append("\n");
                }
                hexCalcAnswerDisplay.append(tempHex1.toString() + " + " + tempHex2.toString() + " = " +
                        answer.toString());
            }
        });
        hexCalcSubButton.addActionListener(ae -> {
            if(validator.isHexadec(hexadecimal1.getText()) && validator.isHexadec(hexadecimal2.getText())){
                Hexadecimal tempHex1 = new Hexadecimal(hexadecimal1.getText());
                Hexadecimal tempHex2 = new Hexadecimal(hexadecimal2.getText());
                Hexadecimal answer = hexCalc.subtract(tempHex1, tempHex2);
                if(!hexCalcAnswerDisplay.getText().isEmpty()){
                    hexCalcAnswerDisplay.append("\n");
                }
                hexCalcAnswerDisplay.append(tempHex1.toString() + " - " + tempHex2.toString() + " = " +
                        answer.toString());
            }
        });
        hexCalcMultButton.addActionListener(ae -> {
            if(validator.isHexadec(hexadecimal1.getText()) && validator.isHexadec(hexadecimal2.getText())){
                Hexadecimal tempHex1 = new Hexadecimal(hexadecimal1.getText());
                Hexadecimal tempHex2 = new Hexadecimal(hexadecimal2.getText());
                Hexadecimal answer = hexCalc.multiply(tempHex1, tempHex2);
                if(!hexCalcAnswerDisplay.getText().isEmpty()){
                    hexCalcAnswerDisplay.append("\n");
                }
                hexCalcAnswerDisplay.append(tempHex1.toString() + " * " + tempHex2.toString() + " = " +
                        answer.toString());
            }
        });
        hexCalcDivButton.addActionListener(ae -> {
            if(validator.isHexadec(hexadecimal1.getText()) && validator.isHexadec(hexadecimal2.getText())){
                Hexadecimal tempHex1 = new Hexadecimal(hexadecimal1.getText());
                Hexadecimal tempHex2 = new Hexadecimal(hexadecimal2.getText());
                if(tempHex2.getDecimal() != 0) {
                    Hexadecimal answer = hexCalc.divide(tempHex1, tempHex2);
                    Hexadecimal remainder = hexCalc.modular(tempHex1, tempHex2);
                    if (!hexCalcAnswerDisplay.getText().isEmpty()) {
                        hexCalcAnswerDisplay.append("\n");
                    }
                    hexCalcAnswerDisplay.append(tempHex1.toString() + " / " + tempHex2.toString() + " = " +
                            answer.toString() + " with a remainder of " + remainder.toString());
                }
            }
        });

        hexConvAnswerDisplay.setEditable(false);

        binConvClearButton.addActionListener(ae -> {
            if(hexConvField.getText().isEmpty()){
                hexConvAnswerDisplay.setText("");
            }
            else{
                hexConvField.setText("");
            }
        });
        toHexadecimalButton.addActionListener(ae -> {
            if(validator.isInt(hexConvField.getText())){
                Hexadecimal tempHex = new Hexadecimal(Integer.parseInt(hexConvField.getText()));
                if(!hexConvAnswerDisplay.getText().isEmpty()){
                    hexConvAnswerDisplay.append("\n");
                }
                hexConvAnswerDisplay.append(tempHex.getDecimal() + " in Hexadecimal is " + tempHex.getHexStr());
            }
        });
        hexToDecimalButton.addActionListener(ae -> {
            if(validator.isHexadec(hexConvField.getText())){
                Hexadecimal tempHex = new Hexadecimal(hexConvField.getText());
                if(!hexConvAnswerDisplay.getText().isEmpty()){
                    hexConvAnswerDisplay.append("\n");
                }
                hexConvAnswerDisplay.append(tempHex.getHexStr() + " decimal value is " + tempHex.getDecimal());
            }
        });
    }

    public JPanel getMainPanel(){
        return this.mainPanel;
    }
}
