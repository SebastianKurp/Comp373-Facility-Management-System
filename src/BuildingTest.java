import org.junit.Test;

import static org.junit.Assert.*;

public class BuildingTest {

    @Test
    public void addFloorToBuilding() {
        Floor floor = new Floor(1,2,false,false);
        Floor floor2 = new Floor(2,2,false,false);
        Building building = new Building("TestBuilding",4,0,"None");
        building.addFloorToBuilding(floor);
        building.addFloorToBuilding(floor2);
        int arraySize = building.floorList.size();
        assertEquals(arraySize,2);
    }

    @Test
    public void getName() {
        Building building = new Building("TestBuilding",4,0,"None");
        String name = building.getName();
        assertEquals(building.name,name);
    }

    @Test
    public void setName() {
        Building building = new Building("TestBuilding",4,0,"None");
        building.setName("Tester");
        assertEquals(building.name,"Tester");
    }

    @Test
    public void getNumberOfRooms() {
        Building building = new Building("TestBuilding",4,0,"None");
        int rooms = building.getNumberOfRooms();
        assertEquals(rooms,building.numberOfRooms);
    }

    @Test
    public void setNumberOfRooms() {
        Building building = new Building("TestBuilding",4,0,"None");
        building.setNumberOfRooms(6);
        assertEquals(building.numberOfRooms,6);
    }

    @Test
    public void getNumberOfVacantRooms() {
        Building building = new Building("TestBuilding",4,0,"None");
        int vacant = building.getNumberOfVacantRooms();
        assertEquals(vacant,building.numberOfVacantRooms);
    }

    @Test
    public void setNumberOfVacantRooms() {
        Building building = new Building("TestBuilding",4,0,"None");
        building.setNumberOfVacantRooms(1);
        assertEquals(building.numberOfVacantRooms,1);
    }

    @Test
    public void getBuildingNotes() {
        Building building = new Building("TestBuilding",4,0,"None");
        String notes = building.getBuildingNotes();
        assertEquals(notes,building.buildingNotes);
    }

    @Test
    public void setBuildingNotes() {
        Building building = new Building("TestBuilding",4,0,"None");
        building.setBuildingNotes("Test");
        assertEquals(building.buildingNotes,"Test");
    }
}