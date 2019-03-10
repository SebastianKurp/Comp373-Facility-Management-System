package test.model;

import main.client.building.FloorInterface;

import main.model.facility.Floor;

import org.junit.Test;

import static org.junit.Assert.*;

public class FloorTest {

    // @Test
    // public void addRoomToFloor() {
    // Floor floor = new Floor(1,2,false,false);
    // int arraySize = floor.roomList.size();
    // Floor.addRoomToFloor(10,"double",2,1250.00,false);
    // assertEquals(arraySize, Floor.roomList.size() - 1);
    // }

    @Test
    public void getFloorNumber() {
        Floor Floor = new Floor(1, 2, false, false);
        int floorNumber = Floor.getFloorNumber();
        assertEquals(Floor.floorNumber, floorNumber);
    }

    @Test
    public void setFloorNumber() {
        Floor floor = new Floor(1, 2, false, false);
        floor.setFloorNumber(2);
        assertEquals(floor.floorNumber, 2);
    }

    @Test
    public void getNumberOfRooms() {
        Floor floor = new Floor(1, 2, false, false);
        int numRooms = floor.getNumberOfRooms();
        assertEquals(floor.numberOfRooms, numRooms);
    }

    @Test
    public void setNumberOfRooms() {
        Floor floor = new Floor(1, 2, false, false);
        floor.setNumberOfRooms(4);
        assertEquals(floor.numberOfRooms, 4);
    }

    @Test
    public void isInRepair() {
        Floor floor = new Floor(1, 2, false, false);
        boolean repair = floor.isInRepair();
        assertEquals(floor.inRepair, repair);
    }

    @Test
    public void setInRepair() {
        Floor floor = new Floor(1, 2, false, false);
        floor.setInRepair(true);
        assertEquals(floor.inRepair, true);
    }

    @Test
    public void isVacant() {
        Floor floor = new Floor(1, 2, false, false);
        boolean vac = floor.isVacant();
        assertEquals(vac, floor.vacant);
    }

    @Test
    public void setVacant() {
        Floor floor = new Floor(1, 2, false, false);
        floor.setVacant(true);
        assertEquals(floor.vacant, true);
    }
}