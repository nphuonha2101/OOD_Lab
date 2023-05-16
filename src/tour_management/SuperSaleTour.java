package tour_management;

public class SuperSaleTour extends TourDecorator {
    private final double saleRate;

    public SuperSaleTour(Tour tour, double saleRate) {
        super(tour);
        this.saleRate = saleRate;
    }

    @Override
    public double price() {
        return this.tour.price() * (1 - saleRate);
    }

    @Override
    public String getDescription() {
        return tour.getDescription() + " Super Sale!!";
    }
}
