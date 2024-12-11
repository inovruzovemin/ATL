
public class DeluxeRoom extends Room {
    private final boolean balconyAvailable;
    public DeluxeRoom(int roomNumber, double price, RoomType roomType) {
        super(roomNumber, price, roomType);
        this.balconyAvailable = true;
    }

//    @Override
//    public void displayInfo() {
//        System.out.println("Room number: "+ getRoomNumber()
//                +" Price: "+getPrice()+
//                " Kitchen " +
//                (balconyAvailable?"Available":"Not available"));
//    }

}
