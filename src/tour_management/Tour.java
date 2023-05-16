package tour_management;

public abstract class Tour {
    protected String name;
    protected String description;
    protected int days;
    protected double basePrice;

    public abstract double price();
    public abstract String getDescription();
}
