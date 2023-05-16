package lab3;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class RentItem {
    private Date startDate;
    private Movie movie;

    public RentItem(Date startDate, Movie movie) {
        this.startDate = startDate;
        this.movie = movie;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

//    public int getRentDays() {
//        LocalDate currentDate = LocalDate.now();
//        int periodInDays = (currentDate.getYear() * 365 + currentDate.getMonth() * 30 + cu);
//    }
}
