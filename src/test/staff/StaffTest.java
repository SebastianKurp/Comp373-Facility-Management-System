package test.staff;

import org.junit.Test;
import main.client.staff.Staff;

import static org.junit.Assert.*;

public class StaffTest {

    @Test
    public void setStaffIdTest(){
        Staff staff = new Staff( 12,"Doorman", true,false );
        staff.setStaffId(13);
        assertEquals(staff.id, 13);
    }

    @Test
    public void getStaffIdTest(){
        Staff staff = new Staff( 12,"Doorman", true,false );
        int staffID = staff.getStaffId();
        assertEquals(staff.id, staffID);
    }

    @Test
    public void setPostionTest(){
        Staff staff = new Staff( 12,"Doorman", true,false );
        staff.setPostion("Front-desk");
        assertEquals(staff.postion, "Front-desk");
    }

    @Test
    public void getStaffPostionTest(){
        Staff staff = new Staff( 12,"Doorman", true,false );
        String staffPostion = staff.getPostion();
        assertEquals(staff.postion, staffPostion);
    }

    @Test
    public void setOnDutyTest(){
        Staff staff = new Staff( 12,"Doorman", true,false );
        staff.setOnDuty(false);
        assertEquals(staff.onDuty, false);
    }

    @Test
    public void getOnDutyTest(){
        Staff staff = new Staff( 12,"Doorman", true,false );
        boolean onDuty = staff.getOnDuty();
        assertEquals(staff.onDuty, onDuty);
    }

}
