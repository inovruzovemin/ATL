public class StandardRoom extends Room{

    private final boolean isSingleBed;
    public StandardRoom(int roomNumber, double price, RoomType roomType) {
        super(roomNumber, price, roomType);
        this.isSingleBed = true;
    }

//    @Override
//    public void displayInfo() {
//        System.out.println("Room number: "+ getRoomNumber()
//                +" Price: "+getPrice()+
//                " Bed count : " +
//                (isSingleBed?"Odd":"Even"));
//    }
}
