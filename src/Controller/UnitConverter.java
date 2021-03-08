package Controller;

public class UnitConverter {
    enum Unit{
        kb(1000),
        mb(1E+6),
        gb(1E+9),
        tb(1E+12),
        B(8),
        KB(8000),
        MB(8E+6),
        GB(8E+9),
        TB(8E+12);

        public final double value;

        private Unit(double value){
            this.value = value;
        }
    }

    public String dataUnitConv(double bits){
        return bits + " bits (b)\n"
                + (bits / Unit.kb.value) + " kilobits (kb)\n"
                + (bits / Unit.mb.value) + " megabits (mb)\n"
                + (bits / Unit.gb.value) + " gigabits (gb)\n"
                + (bits / Unit.tb.value) + " terabits (tb)\n"
                + (bits / Unit.B.value) + " Bytes (B)\n"
                + (bits / Unit.KB.value) + " KiloBytes (KB)\n"
                + (bits / Unit.MB.value) + " MegaBytes (MB)\n"
                + (bits / Unit.GB.value) + " GigaBytes (GB)\n"
                + (bits / Unit.TB.value) + " TeraBytes (TB)";
    }
}
