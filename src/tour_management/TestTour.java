package tour_management;


public class TestTour {
    public static void main(String[] args) {
        Tour tour1 = new DomesticTour("PThiet", "Phan Thiet - Mui Ne", 3, 550000);
        System.out.println(tour1.price() + "\n" + tour1.getDescription());

        Tour fiveStarTour = new FiveStarTour(tour1);
        System.out.println(fiveStarTour.getDescription() + "\n" + fiveStarTour.price());

        Tour saleTour = new SuperSaleTour(tour1, 0.5);
        System.out.println(saleTour.getDescription() + "\n" + saleTour.price());
        
        Tour superSaleFiveStarDomesticTour = new SuperSaleTour(new FiveStarTour(tour1), 0.3);
        System.out.println(superSaleFiveStarDomesticTour.getDescription() + "\n" + superSaleFiveStarDomesticTour.price());
    }
}
