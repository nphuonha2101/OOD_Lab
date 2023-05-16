package tour_management;

public abstract class TourDecorator extends Tour {
    protected final Tour tour;
    public TourDecorator(Tour tour) {
        this.tour = tour;
    }
    @Override
    public abstract double price();

    @Override
    public abstract String getDescription();
}
