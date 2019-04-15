package main.client.facility;

import main.model.staff.Staff;

public interface AdminInterface {
    public void addNewStaffMember(Staff staff);
    public Staff findStaffMemberById(int id);
    public void printAllOnDutyStaff();
    public void printAllStaffList();



}
