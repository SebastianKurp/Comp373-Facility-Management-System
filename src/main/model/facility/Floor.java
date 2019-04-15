package main.model.facility;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    public Building building;

    public List<Room> roomList;
    public int floorNumber;
    public int numberOfRooms;
    public boolean inRepair;
    public boolean vacant;

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Floor(){
        this.roomList = new ArrayList<>();
    }

    public void addRoomToFloor(Room newRoom){
        if(roomList.size()<numberOfRooms) {
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

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public void addFloorToBuilding(Floor floor){
        building.addFloorToBuilding(floor);
    }
}
