//package test.model;
//
//import main.client.facility.Building;
//import main.model.facility.Building;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class BuildingTest {
//
//    @Test
//    public void addFloorToBuilding() {
//        FloorInterface floorInterface = new FloorInterface(1,2,false,false);
//        FloorInterface floorInterface2 = new FloorInterface(2,2,false,false);
//        Building facility = new Building("TestBuilding",4,0,"None");
//        facility.addFloorToBuilding(floorInterface);
//        facility.addFloorToBuilding(floorInterface2);
//        int arraySize = facility.floorInterfaceList.size();
//        assertEquals(arraySize,2);
//    }
//
//    @Test
//    public void getName() {
//        Building facility = new Building("TestBuilding",4,0,"None");
//        String name = facility.getName();
//        assertEquals(facility.name,name);
//    }
//
//    @Test
//    public void setName() {
//        Building facility = new Building("TestBuilding",4,0,"None");
//        facility.setName("Tester");
//        assertEquals(facility.name,"Tester");
//    }
//
//    @Test
//    public void getNumberOfRooms() {
//        Building facility = new Building("TestBuilding",4,0,"None");
//        int rooms = facility.getNumberOfRooms();
//        assertEquals(rooms,facility.numberOfRooms);
//    }
//
//    @Test
//    public void setNumberOfRooms() {
//        Building facility = new Building("TestBuilding",4,0,"None");
//        facility.setNumberOfRooms(6);
//        assertEquals(facility.numberOfRooms,6);
//    }
//
//    @Test
//    public void getNumberOfVacantRooms() {
//        Building facility = new Building("TestBuilding",4,0,"None");
//        int vacant = facility.getNumberOfVacantRooms();
//        assertEquals(vacant,facility.numberOfVacantRooms);
//    }
//
//    @Test
//    public void setNumberOfVacantRooms() {
//        Building facility = new Building("TestBuilding",4,0,"None");
//        facility.setNumberOfVacantRooms(1);
//        assertEquals(facility.numberOfVacantRooms,1);
//    }
//
//    @Test
//    public void getBuildingNotes() {
//        Building facility = new Building("TestBuilding",4,0,"None");
//        String notes = facility.getBuildingNotes();
//        assertEquals(notes,facility.buildingNotes);
//    }
//
//    @Test
//    public void setBuildingNotes() {
//        Building facility = new Building("TestBuilding",4,0,"None");
//        facility.setBuildingNotes("Test");
//        assertEquals(facility.buildingNotes,"Test");
//    }
//}