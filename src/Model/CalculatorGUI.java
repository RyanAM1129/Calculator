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
    private JTabbedPane bandwidthTab;
    private JPanel dataUnitConvPanel;
    private JButton dataUnitConvClearButton;
    private JTextField dataUnitConvField;
    private JButton dataUnitConvKBButton;
    private JButton dataUnitConvMBButton;
    private JButton dataUnitConvBButton;
    private JButton dataUnitConvbButton;
    private JButton dataUnitConvkbButton;
    private JButton dataUnitConvmbButton;
    private JButton dataUnitConvGBButton;
    private JButton dataUnitConvgbButton;
    private JButton dataUnitConvtbButton;
    private JButton dataUnitConvTBButton;
    private JTextArea dataUnitConvAnswerDisplay;
    private JPanel dataUnitConvBotPanel;
    private JPanel dataUnitConvFieldPanel;
    private JPanel dataUnitConvFieldPanel2;
    private JPanel dataUnitConvButtonPanel;
    private JLabel dataUnitConvLabel;
    private JScrollPane dataUnitConvScroll;
    private JTextField downUpCalcAnswerDisplay;
    private JButton downUpCalculateButton;
    private JTextField downUpCalcFileField;
    private JTextField downUpCalcBandField;
    private JRadioButton downUpCalcBButton;
    private JRadioButton downUpCalcKBButton;
    private JRadioButton downUpCalcMBButton;
    private JRadioButton downUpCalcGBButton;
    private JRadioButton downUpCalcTBButton;
    private JRadioButton downUpCalctbitSButton;
    private JRadioButton downUpCalcgbitSButton;
    private JRadioButton downUpCalcmbitSButton;
    private JRadioButton downUpCalckbitSButton;
    private JRadioButton downUpCalcbitSButton;
    private JButton downUpCalcClearButton;
    private JPanel downUpCalcPanel;
    private JPanel downUpCalcAnswerPanel;
    private JPanel downUpCalcCenterPanel;
    private JLabel downUpCalcFileLabel;
    private JLabel downUpCalcBandLabel;
    private JPanel downUpCalcButtonPanel2;
    private JPanel downUpCalcButtonPanel1;
    private JPanel webCalcPanel;
    private JPanel webCalcAnswerPanel;
    private JButton webCalculateButton;
    private JTextArea webCalcAnswerDisplay;
    private JPanel webCalcCenterPanel;
    private JLabel webCalcFileLabel;
    private JLabel webCalcBandLabel;
    private JTextField webCalcSizeField;
    private JTextField webCalcViewField;
    private JPanel webCalcButtonPanel2;
    private JRadioButton webCalcWeekButton;
    private JRadioButton webCalcDayButton;
    private JRadioButton webCalcHourButton;
    private JRadioButton webCalcMinButton;
    private JRadioButton webCalcSecButton;
    private JPanel webCalcButtonPanel1;
    private JRadioButton webCalcBButton;
    private JRadioButton webCalcKBButton;
    private JRadioButton webCalcMBButton;
    private JRadioButton webCalcGBButton;
    private JRadioButton webCalcTBButton;
    private JButton webCalcClearButton;
    private JTextField webCalcRedundancyField;
    private JLabel webCalcRedundancyLabel;
    private JRadioButton webCalcMonthButton;
    private JRadioButton webCalcYearButton;
    private JTextField hostConvMonthField;
    private JTextField hostConvBandField;
    private JRadioButton hostConvBButton;
    private JRadioButton hostConvKBButton;
    private JRadioButton hostConvMBButton;
    private JRadioButton hostConvGBButton;
    private JRadioButton hostConvTBButton;
    private JRadioButton hostConvbitSButton;
    private JRadioButton hostConvKbitSButton;
    private JRadioButton hostConvMbitSButton;
    private JRadioButton hostConvGbitSButton;
    private JRadioButton hostConvTbitSButton;
    private JButton hostCalculateButton;
    private JButton hostConvClearButton;
    private JPanel hostConvPanel;
    private JPanel hostConvBotPanel;
    private JPanel hostConvCenterPanel;
    private JLabel hostConvMonthLabel;
    private JPanel hostConvButtonPanel1;
    private JLabel hostConvCenterLabel;
    private JLabel hostConvBandLabel;
    private JPanel hostConvButtonPanel2;
    Bandwidth bw;
    FileSize fs;
    Validator validator;
    DecimalCalculator decCalc;
    BigIntegerCalculator bIntCalc;
    BinaryCalculator binCalc;
    HexadecCalculator hexCalc;
    UnitConverter unitConv;
    BitConverter bitConv;
    DownUpTimeCalc downUpCalc;
    WebSiteBandCalc webCalc;
    HostBandCalc hostBandCalc;

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
            if(validator.isDecimal(decimal1.getText()) && validator.isDecimal(decimal2.getText())){
                double answer = decCalc.add(Double.parseDouble(decimal1.getText()),
                        Double.parseDouble(decimal2.getText()));
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append(decimal1.getText() + " + " + decimal2.getText() + " = " +
                        answer);
            }
            else{
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
            }
        });
        decCalcSubButton.addActionListener(ae -> {
            if(validator.isDecimal(decimal1.getText()) && validator.isDecimal(decimal2.getText())){
                double answer = decCalc.subtract(Double.parseDouble(decimal1.getText()),
                        Double.parseDouble(decimal2.getText()));
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append(decimal1.getText() + " - " + decimal2.getText() + " = " +
                        answer);
            }
            else{
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
            }
        });
        decCalcMultButton.addActionListener(ae -> {
            if(validator.isDecimal(decimal1.getText()) && validator.isDecimal(decimal2.getText())){
                double answer = decCalc.multiply(Double.parseDouble(decimal1.getText()),
                        Double.parseDouble(decimal2.getText()));
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append(decimal1.getText() + " * " + decimal2.getText() + " = " +
                        answer);
            }
            else{
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
            }
        });
        decCalcDivButton.addActionListener(ae -> {
            if(validator.isDecimal(decimal1.getText()) && validator.isDecimal(decimal2.getText()) &&
                    (Double.parseDouble(decimal2.getText()) != 0)){
                double answer = decCalc.divide(Double.parseDouble(decimal1.getText()),
                        Double.parseDouble(decimal2.getText()));
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append(decimal1.getText() + " / " + decimal2.getText() + " = " +
                        answer);
            }
            else{
                if(!decCalcAnswerDisplay.getText().isEmpty()){
                    decCalcAnswerDisplay.append("\n");
                }
                decCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!bIntAnswerDisplay.getText().isEmpty()){
                    bIntAnswerDisplay.append("\n");
                }
                bIntAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!bIntAnswerDisplay.getText().isEmpty()){
                    bIntAnswerDisplay.append("\n");
                }
                bIntAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!bIntAnswerDisplay.getText().isEmpty()){
                    bIntAnswerDisplay.append("\n");
                }
                bIntAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!bIntAnswerDisplay.getText().isEmpty()){
                    bIntAnswerDisplay.append("\n");
                }
                bIntAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!binCalcAnswerDisplay.getText().isEmpty()){
                    binCalcAnswerDisplay.append("\n");
                }
                binCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!binCalcAnswerDisplay.getText().isEmpty()){
                    binCalcAnswerDisplay.append("\n");
                }
                binCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!binCalcAnswerDisplay.getText().isEmpty()){
                    binCalcAnswerDisplay.append("\n");
                }
                binCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!binCalcAnswerDisplay.getText().isEmpty()){
                    binCalcAnswerDisplay.append("\n");
                }
                binCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!binConvAnswerDisplay.getText().isEmpty()){
                    binConvAnswerDisplay.append("\n");
                }
                binConvAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!binConvAnswerDisplay.getText().isEmpty()){
                    binConvAnswerDisplay.append("\n");
                }
                binConvAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!hexCalcAnswerDisplay.getText().isEmpty()){
                    hexCalcAnswerDisplay.append("\n");
                }
                hexCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!hexCalcAnswerDisplay.getText().isEmpty()){
                    hexCalcAnswerDisplay.append("\n");
                }
                hexCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!hexCalcAnswerDisplay.getText().isEmpty()){
                    hexCalcAnswerDisplay.append("\n");
                }
                hexCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
                else{
                    if(!hexCalcAnswerDisplay.getText().isEmpty()){
                        hexCalcAnswerDisplay.append("\n");
                    }
                    hexCalcAnswerDisplay.append("!!!Can't divide by zero!!!");
                }
            }
            else{
                if(!hexCalcAnswerDisplay.getText().isEmpty()){
                    hexCalcAnswerDisplay.append("\n");
                }
                hexCalcAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!hexConvAnswerDisplay.getText().isEmpty()){
                    hexConvAnswerDisplay.append("\n");
                }
                hexConvAnswerDisplay.append("!!!One or more values are incorrect!!!");
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
            else{
                if(!hexConvAnswerDisplay.getText().isEmpty()){
                    hexConvAnswerDisplay.append("\n");
                }
                hexConvAnswerDisplay.append("!!!One or more values are incorrect!!!");
            }
        });


        unitConv = new UnitConverter();
        bitConv = new BitConverter();
        dataUnitConvAnswerDisplay.setEditable(false);

        dataUnitConvClearButton.addActionListener(ae -> {
            if(dataUnitConvField.getText().isEmpty()){
                dataUnitConvAnswerDisplay.setText("");
            }
            else{
                dataUnitConvField.setText("");
            }
        });
        dataUnitConvbButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = Double.parseDouble(dataUnitConvField.getText());
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvBButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "B");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvkbButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "kb");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvKBButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "KB");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvmbButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "mb");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvMBButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "MB");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvgbButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "gb");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvGBButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "GB");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvtbButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "tb");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });
        dataUnitConvTBButton.addActionListener(ae -> {
            if(validator.isDecimal(dataUnitConvField.getText())) {
                double bits = bitConv.toBits(dataUnitConvField.getText() + "TB");
                dataUnitConvAnswerDisplay.setText(unitConv.dataUnitConv(bits));
            }
            else{
                dataUnitConvAnswerDisplay.setText("!!!One or more values are incorrect!!!");
            }
        });


        downUpCalcAnswerDisplay.setEditable(false);
        downUpCalc = new DownUpTimeCalc();
        downUpCalcMBButton.setSelected(true);
        downUpCalcmbitSButton.setSelected(true);

        downUpCalcClearButton.addActionListener(ae -> {
            downUpCalcAnswerDisplay.setText("");
            downUpCalcFileField.setText("");
            downUpCalcBandField.setText("");
        });
        downUpCalculateButton.addActionListener(ae -> {
            if(validator.isDecimal(downUpCalcFileField.getText()) &&
                    validator.isDecimal(downUpCalcBandField.getText())) {

                double value = Double.parseDouble(downUpCalcFileField.getText());
                if (downUpCalcBButton.isSelected()) {
                    fs = new FileSize(value, "B");
                }
                else if(downUpCalcKBButton.isSelected()){
                    fs = new FileSize(value, "KB");
                }
                else if(downUpCalcMBButton.isSelected()){
                    fs = new FileSize(value, "MB");
                }
                else if(downUpCalcGBButton.isSelected()){
                    fs = new FileSize(value, "GB");
                }
                else if(downUpCalcTBButton.isSelected()){
                    fs = new FileSize(value, "TB");
                }

                value = Double.parseDouble(downUpCalcBandField.getText());
                if (downUpCalcbitSButton.isSelected()) {
                    bw = new Bandwidth(value, "b");
                }
                else if(downUpCalckbitSButton.isSelected()){
                    bw = new Bandwidth(value, "kb");
                }
                else if(downUpCalcmbitSButton.isSelected()){
                    bw = new Bandwidth(value, "mb");
                }
                else if(downUpCalcgbitSButton.isSelected()){
                    bw = new Bandwidth(value, "gb");
                }
                else if(downUpCalctbitSButton.isSelected()){
                    bw = new Bandwidth(value, "tb");
                }
                downUpCalcAnswerDisplay.setText(downUpCalc.downUpTime(bw, fs));
            }
            else{
                downUpCalcAnswerDisplay.setText("!!!One or more inputs are incorrect!!!");
            }
        });


        webCalcAnswerDisplay.setEditable(false);
        webCalc = new WebSiteBandCalc();
        webCalcDayButton.setSelected(true);
        webCalcKBButton.setSelected(true);

        webCalcClearButton.addActionListener(ae -> {
            webCalcAnswerDisplay.setText("");
            webCalcSizeField.setText("");
            webCalcViewField.setText("");
        });
        webCalculateButton.addActionListener(ae -> {
            if(validator.isDecimal(webCalcViewField.getText()) && validator.isDecimal(webCalcSizeField.getText()) &&
                    validator.isInt(webCalcRedundancyField.getText())){
                double size = Double.parseDouble(webCalcSizeField.getText());
                double views = Double.parseDouble(webCalcViewField.getText());
                int viewFreq = 0;
                int redundancy = Integer.parseInt(webCalcRedundancyField.getText());
                if(webCalcBButton.isSelected()){
                    fs = new FileSize(size, "B");
                }
                else if(webCalcKBButton.isSelected()){
                    fs = new FileSize(size, "KB");
                }
                else if(webCalcMBButton.isSelected()){
                    fs = new FileSize(size, "MB");
                }
                else if(webCalcGBButton.isSelected()){
                    fs = new FileSize(size, "GB");
                }
                else if(webCalcTBButton.isSelected()){
                    fs = new FileSize(size, "TB");
                }

                if(webCalcSecButton.isSelected()){
                    viewFreq = 1;
                }
                else if(webCalcMinButton.isSelected()){
                    viewFreq = 2;
                }
                else if(webCalcHourButton.isSelected()){
                    viewFreq = 3;
                }
                else if(webCalcDayButton.isSelected()){
                    viewFreq = 4;
                }
                else if(webCalcWeekButton.isSelected()){
                    viewFreq = 5;
                }
                else if(webCalcMonthButton.isSelected()){
                    viewFreq = 6;
                }
                else if(webCalcYearButton.isSelected()){
                    viewFreq = 7;
                }

                webCalcAnswerDisplay.setText(webCalc.webBandCalc(viewFreq, views, fs, redundancy));
            }
            else{
                webCalcAnswerDisplay.setText("!!!One or more inputs are incorrect!!!");
            }
        });


        hostBandCalc = new HostBandCalc();
        hostConvGBButton.setSelected(true);
        hostConvMbitSButton.setSelected(true);

        hostConvClearButton.addActionListener(ae -> {
            hostConvMonthField.setText("");
            hostConvBandField.setText("");
        });
        hostCalculateButton.addActionListener(ae -> {
            if(!hostConvMonthField.getText().isEmpty() && validator.isDecimal(hostConvMonthField.getText())){
                double monthlyUse = Double.parseDouble(hostConvMonthField.getText());

                if(hostConvBButton.isSelected()){   //Bytes to ...
                    if(hostConvbitSButton.isSelected()) {   //bits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(monthlyUse, 1));
                    }
                    else if(hostConvKbitSButton.isSelected()){  //Kilobits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(monthlyUse, 2));
                    }
                    else if(hostConvMbitSButton.isSelected()){  //Megabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(monthlyUse, 3));
                    }
                    else if(hostConvGbitSButton.isSelected()){  //Gigabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(monthlyUse, 4));
                    }
                    else if(hostConvTbitSButton.isSelected()){  //Terabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(monthlyUse, 5));
                    }
                }
                else if(hostConvKBButton.isSelected()){ //KiloBytes to ...
                    double bits = bitConv.toBits(monthlyUse + "kb");
                    if(hostConvbitSButton.isSelected()) {   //bits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 1));
                    }
                    else if(hostConvKbitSButton.isSelected()){  //Kilobits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 2));
                    }
                    else if(hostConvMbitSButton.isSelected()){  //Megabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 3));
                    }
                    else if(hostConvGbitSButton.isSelected()){  //Gigabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 4));
                    }
                    else if(hostConvTbitSButton.isSelected()){  //Terabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 5));
                    }
                }
                else if(hostConvMBButton.isSelected()){ //MegaBytes to ...
                    double bits = bitConv.toBits(monthlyUse + "mb");
                    if(hostConvbitSButton.isSelected()) {   //bits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 1));
                    }
                    else if(hostConvKbitSButton.isSelected()){  //Kilobits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 2));
                    }
                    else if(hostConvMbitSButton.isSelected()){  //Megabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 3));
                    }
                    else if(hostConvGbitSButton.isSelected()){  //Gigabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 4));
                    }
                    else if(hostConvTbitSButton.isSelected()){  //Terabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 5));
                    }
                }
                else if(hostConvGBButton.isSelected()){ //GigaBytes to ...
                    double bits = bitConv.toBits(monthlyUse + "gb");
                    if(hostConvbitSButton.isSelected()) {   //bits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 1));
                    }
                    else if(hostConvKbitSButton.isSelected()){  //Kilobits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 2));
                    }
                    else if(hostConvMbitSButton.isSelected()){  //Megabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 3));
                    }
                    else if(hostConvGbitSButton.isSelected()){  //Gigabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 4));
                    }
                    else if(hostConvTbitSButton.isSelected()){  //Terabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 5));
                    }
                }
                else if(hostConvTBButton.isSelected()){ //TeraBytes to ...
                    double bits = bitConv.toBits(monthlyUse + "tb");
                    if(hostConvbitSButton.isSelected()) {   //bits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 1));
                    }
                    else if(hostConvKbitSButton.isSelected()){  //Kilobits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 2));
                    }
                    else if(hostConvMbitSButton.isSelected()){  //Megabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 3));
                    }
                    else if(hostConvGbitSButton.isSelected()){  //Gigabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 4));
                    }
                    else if(hostConvTbitSButton.isSelected()){  //Terabits per second
                        hostConvBandField.setText("" + hostBandCalc.toBandwidth(bits, 5));
                    }
                }
            }
            else if(!hostConvBandField.getText().isEmpty() && validator.isDecimal(hostConvBandField.getText())){
                double bandwidth = Double.parseDouble(hostConvBandField.getText());

                if(hostConvbitSButton.isSelected()){    //Bits per second to ...
                    if(hostConvBButton.isSelected()){   //Bytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bandwidth, 1));
                    }
                    else if(hostConvKBButton.isSelected()){ //KiloBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bandwidth, 2));
                    }
                    else if(hostConvMBButton.isSelected()){ //MegaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bandwidth, 3));
                    }
                    else if(hostConvGBButton.isSelected()){ //GigaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bandwidth, 4));
                    }
                    else if(hostConvTBButton.isSelected()){ //TeraBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bandwidth, 5));
                    }
                }
                else if(hostConvKbitSButton.isSelected()){ //KiloBits per second to ...
                    double bits = bitConv.toBits(bandwidth + "Kb");
                    if(hostConvBButton.isSelected()){   //Bytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 1));
                    }
                    else if(hostConvKBButton.isSelected()){ //KiloBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 2));
                    }
                    else if(hostConvMBButton.isSelected()){ //MegaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 3));
                    }
                    else if(hostConvGBButton.isSelected()){ //GigaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 4));
                    }
                    else if(hostConvTBButton.isSelected()){ //TeraBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 5));
                    }
                }
                else if(hostConvMbitSButton.isSelected()){ //MegaBits per second to ...
                    double bits = bitConv.toBits(bandwidth + "Mb");
                    if(hostConvBButton.isSelected()){   //Bytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 1));
                    }
                    else if(hostConvKBButton.isSelected()){ //KiloBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 2));
                    }
                    else if(hostConvMBButton.isSelected()){ //MegaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 3));
                    }
                    else if(hostConvGBButton.isSelected()){ //GigaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 4));
                    }
                    else if(hostConvTBButton.isSelected()){ //TeraBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 5));
                    }
                }
                else if(hostConvGbitSButton.isSelected()){ //GigaBits per second to ...
                    double bits = bitConv.toBits(bandwidth + "Gb");
                    if(hostConvBButton.isSelected()){   //Bytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 1));
                    }
                    else if(hostConvKBButton.isSelected()){ //KiloBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 2));
                    }
                    else if(hostConvMBButton.isSelected()){ //MegaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 3));
                    }
                    else if(hostConvGBButton.isSelected()){ //GigaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 4));
                    }
                    else if(hostConvTBButton.isSelected()){ //TeraBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 5));
                    }
                }
                else if(hostConvTbitSButton.isSelected()){ //TeraBits per second to ...
                    double bits = bitConv.toBits(bandwidth + "Tb");
                    if(hostConvBButton.isSelected()){   //Bytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 1));
                    }
                    else if(hostConvKBButton.isSelected()){ //KiloBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 2));
                    }
                    else if(hostConvMBButton.isSelected()){ //MegaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 3));
                    }
                    else if(hostConvGBButton.isSelected()){ //GigaBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 4));
                    }
                    else if(hostConvTBButton.isSelected()){ //TeraBytes per month
                        hostConvMonthField.setText("" + hostBandCalc.toMonthlyUse(bits, 5));
                    }
                }
            }
        });
    }

    public JPanel getMainPanel(){
        return this.mainPanel;
    }
}
