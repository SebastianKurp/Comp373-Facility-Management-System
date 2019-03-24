package main.client.facility;

import main.model.staff.Staff;

public interface AdminInterface {
    public void addNewStaffMember(int id, String position, boolean onDuty, boolean isAdmin);
    public Staff findStaffMemberById(int id);
    public void printAllOnDutyStaff();
    public void printAllStaffList();



}
