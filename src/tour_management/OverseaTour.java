package tour_management;

public class OverseaTour extends Tour {
    private String country;
    private double visaSurtax;

    public OverseaTour(String name, String description, int days, double basePrice, String country, double visaSurtax) {
        this.name = name;
        this.description = description;
        this.days = days;
        this.basePrice = basePrice;
        this.country = country;
        this.visaSurtax = visaSurtax;
    }

    @Override
    public double price() {
        return this.basePrice + visaSurtax;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
