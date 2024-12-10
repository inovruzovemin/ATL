public class Main {
    public static void main(String[] args) {

    Room room1 =  new Room(101,150, RoomType.STANDARD);
    Room room2 = new Room(201,200, RoomType.SUITE);
    Room room3 = new Room(301, 300,RoomType.DELUXE);
    Room []rooms = new Room[3];
    rooms [0]= room1;
    rooms [1]= room2;
    rooms [2]= room3;


//        Room [] rooms = new Room[3];
//        rooms[0]= standartRoom;
//        rooms[1]= suiteRoom;
//        rooms[2]= deluxeRoom;
//        standartRoom.Reserve();
//        suiteRoom.Reserve();

        for(Room room : rooms){
           if(room.isBooked()){
               System.out.println(room1);
           }
        }


    }
}