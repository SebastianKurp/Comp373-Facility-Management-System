package main.client.building;

import main.model.facility.Room;
import main.model.facility.Floor;

import java.util.ArrayList;

public class FloorInterface {
    public ArrayList<Room> roomList;

    public int floorNumber;
    public int numberOfRooms;
    public boolean inRepair;
    public boolean vacant;

    public FloorInterface(int floorNumber, int numberOfRooms, boolean vacant, boolean inRepair){
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
        this.vacant = vacant;
        this.inRepair = inRepair;
        this.roomList = new ArrayList<Room>();
    }

    public void addRoomToFloor(int roomNumber, String type, int capacity, double cost, boolean inRepair ){
        if(roomList.size()<numberOfRooms) {
            Room newRoom = new Room(roomNumber, type, capacity, cost, inRepair);
            roomList.add(newRoom);
        }else{
            System.out.println("Too Many Rooms on this floor to add new room");
        }
    }

    public void printRooms(){
        for(Room room : roomList){
            System.out.println(room.roomNumber);
        }
    }

}
