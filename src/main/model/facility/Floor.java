package main.model.facility;

import java.util.ArrayList;

public class Floor {
    public ArrayList<Room> roomList;

    public int floorNumber;
    public int numberOfRooms;
    public boolean inRepair;
    public boolean vacant;

    public Floor(int floorNumber, int numberOfRooms,boolean vacant, boolean inRepair){
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
        this.vacant = vacant;
        this.inRepair = inRepair;
        this.roomList = new ArrayList<Room>();
    }

    public void addRoomToFloor(int roomNumber, String type, int capacity, double cost, boolean vacant ){
        if(roomList.size()<numberOfRooms) {
            Room newRoom = new Room(roomNumber, type, capacity, cost, vacant);
            roomList.add(newRoom);
        }else{
            System.out.println("Too Many Rooms on this floor to add new room");
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isInRepair() {
        return inRepair;
    }

    public void setInRepair(boolean inRepair) {
        this.inRepair = inRepair;
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public void printRooms(){
        for(Room room : roomList){
            System.out.println(room.roomNumber);
        }
    }

    public Room getVacantRoom(){
        for (Room room :roomList){
            if(room.vacant){
                return room;
            }
        }
        System.out.println("No vacant rooms");
        return null;
    }

}
