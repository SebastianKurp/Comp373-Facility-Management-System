package main.model.facility;

public class Room {
    public int roomNumber;
    public String type;
    public int capacity;
    public double cost;
    public boolean vacant;


    public Room( int roomNumber, String type, int capacity, double cost, boolean vacant){
        this.roomNumber = roomNumber;
        this.type = type;
        this.capacity = capacity;
        this.cost = cost;
        this.vacant = vacant;

        System.out.println(String.format("==main.model.facility.Room # %d ==", roomNumber));
        System.out.println(String.format("main.model.facility.Room Type: %s",type));
        System.out.println(String.format("Capacity: %d",capacity));
        System.out.println(String.format("Cost Per Month: %f",cost));
        System.out.println(String.format("vacant: %b", vacant));
        System.out.println("=========");
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setCost(float cost){
        this.cost = cost;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType(){
        return type;
    }

    public int getCapacity(){
        return  capacity;
    }

    public double getCost(){
        return  cost;
    }

    public boolean getVacant(){
        return vacant;
    }

}
