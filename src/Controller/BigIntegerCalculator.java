package Controller;

import java.math.BigInteger;

/**
 * BigIntegerCalculator is a class designed to compute basic math functions with BigIntegers
 * */
public class BigIntegerCalculator extends DecimalCalculator {

    public BigInteger add(BigInteger bigAdd1, BigInteger bigAdd2){
        return bigAdd1.add(bigAdd2);
    }

    public BigInteger subtract(BigInteger bigSub1, BigInteger bigSub2){
        return bigSub1.subtract(bigSub2);
    }

    public BigInteger multiply(BigInteger bigMul1, BigInteger bigMul2){
        return bigMul1.multiply(bigMul2);
    }

    public BigInteger divide(BigInteger numerator, BigInteger denominator){
        return numerator.divide(denominator);
    }

    public BigInteger modular(BigInteger numerator, BigInteger denominator){
        return numerator.mod(denominator);
    }
}
