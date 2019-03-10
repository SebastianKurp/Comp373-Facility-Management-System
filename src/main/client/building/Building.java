package main.client.building;

import java.util.ArrayList;

public class Building {
    public ArrayList<FloorInterface> floorInterfaceList;
    public String name;
    public int numberOfRooms;
    public int numberOfVacantRooms;
    public String buildingNotes;

    public Building(String name,int numberOfRooms, int numberOfVacantRooms,String buildingNotes){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfVacantRooms = numberOfVacantRooms;
        this.buildingNotes = buildingNotes;
        this.floorInterfaceList = new ArrayList<FloorInterface>();
    }

    public void addFloorToBuilding(FloorInterface floorInterface){
        floorInterfaceList.add(floorInterface);
    }

}
