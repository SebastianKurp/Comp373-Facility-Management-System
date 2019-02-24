import java.util.ArrayList;

public class Floor {
    ArrayList<Room> roomList;

    int floorNumber;
    int numberOfRooms;
    boolean inRepair;

    public Floor(int floorNumber, int numberOfRooms, boolean inRepair){
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
        this.roomList = new ArrayList<Room>();
    }

    public void addRoomToFloor(int floorNumber, int roomNumber, String type, int capacity, double cost, boolean inRepair ){
        Room newRoom = new Room(floorNumber,roomNumber,type,capacity,cost, inRepair);
        roomList.add(newRoom);
    }

    public void printRooms(){

    }

}
