public class SuiteRoom extends Room{
    private final boolean kitchenAvailable;
    public SuiteRoom(int roomNumber, double price, RoomType roomType ) {
        super(roomNumber, price, roomType);
        kitchenAvailable=true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Room number: "+ getRoomNumber()
                +" Price: "+getPrice()+
                " Kitchen " +
                (kitchenAvailable?"Available":"Not available"));

    }
}
