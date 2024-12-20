import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TourAgency  agency = new TourAgency("PashaTour");
        Tour tour1 = new Tour(101,"Spain",1700,TourPacket.BEACH_HOLIDAY);
        Tour tour2 = new Tour(102,"Shahdagh",300,TourPacket.CITY_TOUR);
        Tour tour3 = new Tour(103,"Lankaran",550,TourPacket.MOUNTAIN_ADVENTURE);
        Tour tour4 = new Tour(103,"Khazar",750,TourPacket.CRUISE_TRIP);
        Tour tour5 = new Tour(103,"Egypt",750,TourPacket.DESERT_SAFARI);

        Customer custumer1 = new Customer("Emin", List.of(tour1));
        Customer custumer2 = new Customer("Musa", new ArrayList<>());
        Customer custumer3 = new Customer("Ali", List.of(tour3));




        agency.addTour(tour1);
        agency.addTour(tour2);
        agency.addTour(tour3);
        agency.addTour(tour4);
        agency.addTour(tour5);
        System.out.println("-------------------------");

        agency.addCustomer(custumer1);
        agency.addCustomer(custumer2);
        agency.addCustomer(custumer3);
        System.out.println("-------------------------");
        
        agency.displayInfo();
        System.out.println("-------------------------");

        }
}