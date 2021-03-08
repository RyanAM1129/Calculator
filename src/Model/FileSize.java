package Model;

import Controller.BitConverter;

public class FileSize {
    private double bits;
    private double value;
    private String unit;
    BitConverter bitConverter;

    public FileSize(double value, String unit){
        bitConverter = new BitConverter();
        this.value = value;
        this.unit = unit;
        this.bits = bitConverter.toBits(value + unit);
    }

    public double getBits(){
        return this.bits;
    }
    public double getValue(){
        return this.value;
    }
    public String getUnit(){
        return this.unit;
    }
    public String toString(){
        return this.value + this.unit;
    }
}
