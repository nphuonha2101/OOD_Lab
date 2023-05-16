package lab3;

public class Movie {
    private boolean available;
    private String title;
    private ChargeCompute chargeCompute;
    private frequenceRenterPoint frequenceRenterPoint;

    public Movie(boolean available, String title, ChargeCompute chargeCompute, frequenceRenterPoint frequenceRenterPoint) {
        this.available = available;
        this.title = title;
        this.chargeCompute = chargeCompute;
        this.frequenceRenterPoint = frequenceRenterPoint;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ChargeCompute getChargeCompute() {
        return chargeCompute;
    }

    public void setChargeCompute(ChargeCompute chargeCompute) {
        this.chargeCompute = chargeCompute;
    }

    public lab3.frequenceRenterPoint getFrequenceRenterPoint() {
        return frequenceRenterPoint;
    }

    public void setFrequenceRenterPoint(lab3.frequenceRenterPoint frequenceRenterPoint) {
        this.frequenceRenterPoint = frequenceRenterPoint;
    }

    public double getCharge(int rentDays) {
        return chargeCompute.getCharge(rentDays);
    }

    public int getPoints(int rentDays) {
        return frequenceRenterPoint.getPoints(rentDays);
    }
}
