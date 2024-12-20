import java.util.List;

public class Customer {
    private String name;
    private int customerId;
    private List<Tour> reserveTours;

    public Customer(String name, List<Tour> tours) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void displayDetails() {
        System.out.println(" Customer name='" + name + '\'' +
                ", customerId=" + customerId +
                ", reserveTours=" + reserveTours);
    }
}
