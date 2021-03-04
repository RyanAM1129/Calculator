package Controller;

import Model.Binary;

/**
 * BinaryCalculator is designed to do basic math functions with Binary objects
 * */
public class BinaryCalculator extends DecimalCalculator{
    public Binary add(Binary binAdd1, Binary binAdd2){
        return new Binary(binAdd1.getDecimal() + binAdd2.getDecimal());
    }

    public Binary subtract(Binary binSub1, Binary binSub2){
        return new Binary(binSub1.getDecimal() - binSub2.getDecimal());
    }

    public Binary multiply(Binary binMul1, Binary binMul2){
        return new Binary(binMul1.getDecimal() * binMul2.getDecimal());
    }

    public Binary divide(Binary numerator, Binary denominator){
        return new Binary(numerator.getDecimal() / denominator.getDecimal());
    }

    public Binary modular(Binary numerator, Binary denominator){
        return new Binary(numerator.getDecimal() % denominator.getDecimal());
    }
}