public class Room {
    int roomNumber;
    String type;
    int capacity;
    double cost;
    boolean inRepair;


    public Room( int roomNumber, String type, int capacity, double cost, boolean inRepair){
        this.roomNumber = roomNumber;
        this.type = type;
        this.capacity = capacity;
        this.cost = cost;
        this.inRepair = inRepair;

        System.out.println(String.format("==Room # %d ==", roomNumber));
        System.out.println(String.format("Room Type: %s",type));
        System.out.println(String.format("Capacity: %d",capacity));
        System.out.println(String.format("Cost Per Month: %f",cost));
        System.out.println(String.format("inRepair: %b", inRepair));
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

    public void setInRepair(boolean inRepair) {
        this.inRepair = inRepair;
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

    public boolean getInRepair(){
        return inRepair;
    }
}
