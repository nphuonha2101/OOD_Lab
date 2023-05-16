package tour_management;

public class FiveStarTour extends TourDecorator {
    public FiveStarTour(Tour tour) {
        super(tour);
    }

    @Override
    public double price() {
       return tour.price() * 1.5;
    }

    @Override
    public String getDescription() {
        return tour.getDescription() + " Five Star Tour";
    }
}
