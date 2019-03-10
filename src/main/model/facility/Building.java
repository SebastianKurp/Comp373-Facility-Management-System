package main.model.facility;


import main.model.facility.Floor;

import java.util.ArrayList;

public class Building {
    public ArrayList<Floor> floorList;
    public String name;
    public int numberOfRooms;
    public int numberOfVacantRooms;
    public String buildingNotes;

    public Building(String name,int numberOfRooms, int numberOfVacantRooms,String buildingNotes){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfVacantRooms = numberOfVacantRooms;
        this.buildingNotes = buildingNotes;
        this.floorList = new ArrayList<Floor>();
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