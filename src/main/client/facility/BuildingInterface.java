package main.client.facility;

import main.model.facility.Floor;

public interface BuildingInterface {

    public void setName(String name);
    public void addFloorToBuilding(Floor floor);
    public String getName();
    public int getNumberOfRooms();
    public void setNumberOfRooms(int numberOfRooms);
    public int getNumberOfVacantRooms();
    public void setNumberOfVacantRooms(int numberOfVacantRooms);
    public String getBuildingNotes();
    public void setBuildingNotes(String buildingNotes);

}
