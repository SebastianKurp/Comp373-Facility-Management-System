import java.util.ArrayList;

public class Building {
    ArrayList<Floor> floorList;
    String name;
    int numberOfRooms;
    int numberOfVacantRooms;
    String buildingNotes;

    public Building(String name,int numberOfRooms, int numberOfVacantRooms,String buildingNotes){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfVacantRooms = numberOfVacantRooms;
        this.buildingNotes = buildingNotes;
        this.floorList = new ArrayList<Floor>();
    }

    public void addFloorToBuilding(Floor floor){
        floorList.add(floor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfVacantRooms() {
        return numberOfVacantRooms;
    }

    public void setNumberOfVacantRooms(int numberOfVacantRooms) {
        this.numberOfVacantRooms = numberOfVacantRooms;
    }

    public String getBuildingNotes() {
        return buildingNotes;
    }

    public void setBuildingNotes(String buildingNotes) {
        this.buildingNotes = buildingNotes;
    }
}
