import java.util.ArrayList;
import java.util.List;

public class TourAgency{
    private String agencyName;
    private List<Tour>tours;
    private List<Customer>customers;

    public TourAgency(String agencyName) {
        this.agencyName = agencyName;
        this.tours = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public void addTour(Tour newTourName){
        tours.add(newTourName);
        System.out.println("Tour " + newTourName.getTourName() + " added to list");
    }
    public void addCustomer (Customer newCustomer) {
        customers.add(newCustomer);
        System.out.println("Customer " + newCustomer.getName() + " added to list");
    }

    public void displayInfo() {
        System.out.println("AgencyName='" + agencyName + '\'' +
                ", tours=" + tours.toString() +
                ", customers=" + customers.toString() +
                '}');
    }
}
