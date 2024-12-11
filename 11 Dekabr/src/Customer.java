import java.util.List;

public class Customer {
    private int customerId;
    private List<Tour> reserveTours;

    public Customer(int customerId, List<Tour> tours) {
        this.customerId = customerId;
        this.reserveTours = tours;
    }

    public int getCustomerId() {
        return customerId;
    }

    public List<Tour> getTours() {
        return reserveTours;
    }
    public void reserveTour4C(Tour tour){
        if(!tour.isReserved()){
            tour.reserveTour();
            reserveTours.add(tour);
            System.out.println("Tour" + tour.getTourName() + " has added your list");
        }
        else{
            System.out.println("Already added");
        }

    }
    public void canselReserveTour4C(Tour tour) {
        if (reserveTours.contains(tour)){
            tour.cancelReserveTour();
            reserveTours.remove(tour);
            System.out.println("Deleted your list " + tour.getTourName());
        }
        else {
            System.out.println("Already calceled");
        }
    }
}
