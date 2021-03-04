package Controller;

/**
 * DecimalCalculator is designed to do basic math functions with doubles
 * */
public class DecimalCalculator extends Calculator{

    public double add(double addValue1, double addValue2){
        double addResult = addValue1 + addValue2;
        return addResult;
    }

    public double subtract(double subtractValue1, double subtractValue2){
        double subtractResult = subtractValue1 - subtractValue2;
        return subtractResult;
    }

    public double multiply(double multiplyValue1, double multiplyValue2){
        double multiplyResult = multiplyValue1 * multiplyValue2;
        return multiplyResult;
    }

    public double divide(double numerator, double denominator){
        double divideResult = numerator / denominator;
        return divideResult;
    }

    public double modular(double numerator, double denominator){
        return numerator % denominator;
    }

    public boolean isNum(String str){
        try { Integer.parseInt(str); return true; }
        catch (NumberFormatException nfe){ return false; }
    }
}