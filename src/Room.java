public class Room {
    int roomNumber;
    String type;
    int capacity;
    double cost;
    boolean inRepair;


    public Room(int roomNumber, String type, int capacity, double cost, boolean inRepair){
        this.roomNumber = roomNumber;
        this.type = type;
        this.capacity = capacity;
        this.cost = cost;
        this.inRepair = inRepair;

        System.out.println(String.format("==Room #%d==", roomNumber));
//        System.out.println(String.format("Floor Location: %d",'\n',floorNumber));
//        System.out.println(String.format("Room Type: %s",'\n',type));
//        System.out.println(String.format("Capacity: %d",'\n',capacity));
//        System.out.println(String.format("Cost Per Month: %c",'\n',cost));
//        System.out.println(String.format("inRepair: %b",'\n', inRepair));
        System.out.println("=========");
    }
}
