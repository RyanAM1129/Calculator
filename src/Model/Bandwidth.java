package Model;


import Controller.BitConverter;

/**
 * Bandwidth is an abstract data type designed to represent different bandwidths in bit/s
 * */
public class Bandwidth {
    private double bitPerSec;
    private double value;
    private String unit;
    BitConverter bitConverter;

    public Bandwidth(double value, String unit){
        bitConverter = new BitConverter();
        this.value = value;
        this.unit = unit;
        this.bitPerSec = bitConverter.toBits(value + unit);
    }

    public double getBitPerSec(){
        return this.bitPerSec;
    }
    public double getValue(){
        return this.value;
    }
    public String getUnit(){
        return this.unit;
    }

    public String toString(){
        return this.value + this.unit + "/s";
    }
}
