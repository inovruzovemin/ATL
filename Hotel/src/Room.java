public  class Room {
    private int roomNumber;
    private double price;
    private boolean isBooked;
//    private RoomType roomType;

//    public abstract class getRoomType() {
//        return roomType;
//    }

    public Room(int roomNumber, double price, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = true;
//        this.roomType = roomType;
    }
    public void displayInfo () {

    }
    public void RoomType(){

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void Reserve(){
        if(isBooked){
            System.out.println(getRoomNumber() + " № room has been successfully booked.");
            isBooked = false;
        }
        else {
            System.out.println( roomNumber + " № room is already booked.");
        }
    }

    public void CanselReserve() {
        if(!isBooked) {
            System.out.println(getRoomNumber() + " № rooms reservation has been successfully canceled.");
            isBooked=true;
        }
        else {
            System.out.println(getRoomNumber() + " № room is available, not reserved.");
        }
    }


    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}';
    }
}
