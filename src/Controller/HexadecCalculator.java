package Controller;

import Model.Hexadecimal;

/**
 * HexadecCalculator is designed to do basic math functions with Hexadecimal objects
 * */
public class HexadecCalculator extends DecimalCalculator {
    public Hexadecimal add(Hexadecimal hexAdd1, Hexadecimal hexAdd2){
        return new Hexadecimal(hexAdd1.getDecimal() + hexAdd2.getDecimal());
    }

    public Hexadecimal subtract(Hexadecimal hexSub1, Hexadecimal hexSub2){
        return new Hexadecimal(hexSub1.getDecimal() - hexSub2.getDecimal());
    }

    public Hexadecimal multiply(Hexadecimal hexMul1, Hexadecimal hexMul2){
        return new Hexadecimal(hexMul1.getDecimal() * hexMul2.getDecimal());
    }

    public Hexadecimal divide(Hexadecimal numerator, Hexadecimal denominator){
        return new Hexadecimal(numerator.getDecimal() / denominator.getDecimal());
    }

    public Hexadecimal modular(Hexadecimal numerator, Hexadecimal denominator){
        return new Hexadecimal(numerator.getDecimal() % denominator.getDecimal());
    }

}
