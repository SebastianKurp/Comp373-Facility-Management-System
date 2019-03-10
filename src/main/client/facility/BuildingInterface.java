package main.client.facility;

import main.model.facility.Building;
import main.model.facility.Floor;
import java.util.ArrayList;

public class BuildingInterface  {
    public ArrayList<Floor> floorList;

    public void addFloorToBuilding(Floor floor){
        floorList.add(floor);
    }

}
