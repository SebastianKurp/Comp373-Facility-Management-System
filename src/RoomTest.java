import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void RoomTest(){
        Room room = new Room(1,"Studio", 2,750.00, false);
    }

    @Test
    public void getRoomNumberTest(){
        Room room = new Room(10,"studio",1,750.00,false);
        int roomNumber = room.getRoomNumber();
        assertEquals(room.roomNumber, roomNumber);
    }

    @Test
    public void setRoomNumberTest(){
        Room room = new Room(10,"studio",1,750.00,false);
        room.setRoomNumber(67);
        assertEquals(room.roomNumber, 67);
    }

    @Test
    public void setRoomTypeTest(){
        Room room = new Room(10,"studio",1,750.00,false);
        room.setType("double");
        assertEquals(room.type, "double");
    }

    @Test
    public void getRoomTypeTest(){
        Room room = new Room(10,"studio",1,750.00,false);
        String roomtype = room.getType();
        assertEquals(room.type, "studio");
    }

    @Test
    public void setRoomCapacityTest(){
        Room room = new Room(10,"studio",1,750.00,false);
        room.setCapacity(3);
        assertEquals(room.capacity, 3);
    }

    @Test
    public void getRoomCapacityTest(){
        Room room = new Room(10,"studio",1,750.00,false);
        int roomCapcity = room.getCapacity();
        assertEquals(room.capacity, roomCapcity);
    }

    @Test
    public void setInRepairTest(){
        Room room = new Room(10,"studio",1,750.00,false);
        room.setInRepair(false);
        assertEquals(room.inRepair, false);
    }

    @Test
    public void getInRepairTest(){
        Room room = new Room(10,"studio",1,750.00,false);
        boolean repairStatus = room.getInRepair();
        assertEquals(room.inRepair, false);
    }
}
