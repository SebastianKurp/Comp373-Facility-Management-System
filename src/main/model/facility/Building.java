package main.model.facility;

import main.client.facility.BuildingInterface;

import java.util.ArrayList;
import java.util.List;

public class Building implements BuildingInterface {
    public List<Floor> floorList;
    public String name;
    public int numberOfRooms;
    public int numberOfVacantRooms;
    public String buildingNotes;

    public Building(){
        this.floorList = new ArrayList<>();
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

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }
}
