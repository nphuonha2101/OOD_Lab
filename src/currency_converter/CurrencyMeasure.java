package currency_converter;

public abstract class CurrencyMeasure {
    protected CurrencyUnit unit;
    protected double value;

//    public CurrencyMeasure(CurrencyUnit unit, double value) {
//        this.unit = unit;
//        this.value = value;
//    }

    public CurrencyUnit getUnit() {
        return unit;
    }

    public void setUnit(CurrencyUnit unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
