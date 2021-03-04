package Model;


import Controller.BitConverter;

/**
 * Bandwidth is an abstract data type designed to represent different bandwidths in bit/s
 * */
public class Bandwidth {
    private double bitPerSec;

    public Bandwidth(double value, String unit){
        BitConverter bitConverter = new BitConverter();
        this.bitPerSec = bitConverter.toBits(value + unit);
    }
}
