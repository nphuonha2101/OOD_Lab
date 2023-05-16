package lab3;

import java.util.List;

public class Customer {
    private String name;
    private List<RentItem> rentItemList;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RentItem> getRentItemList() {
        return rentItemList;
    }

    public void setRentItemList(List<RentItem> rentItemList) {
        this.rentItemList = rentItemList;
    }

//    public void rent(Movie movie, int rentDays) {
//        this.rentItemList.add(new RentItem());
//    }
}
