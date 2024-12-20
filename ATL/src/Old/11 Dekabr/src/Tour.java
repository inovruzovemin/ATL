public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPacket tourPacket;

    public Tour(int tourId, String tourName, double price, TourPacket packet) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.isReserved = false;
        this.tourPacket = packet;
    }
    public void reserveTour(){
        if(!isReserved){
            isReserved= true;
            System.out.println("Tour "+ tourName + " has been reserved");
        }
        else{
            System.out.println("Already reserved");
        }
    }

    public void cancelReserveTour(){
        if(isReserved){
            isReserved = false;
            System.out.println("Tour "+ tourName + " has been successfully canceled");
        }
        else{
            System.out.println("Tour"+ tourName + " is already free. Not reserved.");
        }
    }

    public int getTourId() {
        return tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public TourPacket getPacket() {
        return tourPacket;
    }

}
