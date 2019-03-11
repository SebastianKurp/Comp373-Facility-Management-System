package main.client.facility;

import main.model.facility.Building;
import main.model.facility.Floor;
import main.model.staff.Staff;
import main.model.staff.StaffRegistry;
import java.util.ArrayList;

public interface AdminOffice  {
    public void addNewStaffMember(int id, String postion, boolean onDuty, boolean isAdmin);
    public Staff findStaffMemberById(int id);
    public void printAllOnDutyStaff();
    public void printAllStaffList();



}
