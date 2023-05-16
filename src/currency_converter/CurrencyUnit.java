package currency_converter;

public class CurrencyUnit {
    private String symbol;
    private double valuePerUSD;

    public CurrencyUnit(String symbol, double valuePerUSD) {
        this.symbol = symbol;
        this.valuePerUSD = valuePerUSD;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getValuePerUSD() {
        return valuePerUSD;
    }

    public void setValuePerUSD(double valuePerUSD) {
        this.valuePerUSD = valuePerUSD;
    }
}
