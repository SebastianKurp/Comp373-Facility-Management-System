package main.model.staff;

import main.client.facility.AdminInterface;

import java.util.ArrayList;
import java.util.List;

public class StaffRegistry implements AdminInterface {
//    private List<Object> stafflist = new ArrayList<Staff>(20);
    public ArrayList<Staff> staffList;

    public StaffRegistry(){
        this.staffList = new ArrayList<Staff>();
    }

    public void addNewStaffMember(int id, String postion, boolean onDuty, boolean isAdmin){
        Staff newStaff = new Staff( id, postion, onDuty, isAdmin);
        staffList.add(newStaff);
    }

    public Staff findStaffMemberById(int id){
        for(Staff staff : staffList){
            if (staff.id == (id)) {
                return staff;
            }
        }
        System.out.println(String.format("StaffMember with id: %d not found...", id));
        return null;
    }

    public void printAllOnDutyStaff(){
        for( Staff staff : staffList){
            if(staff.onDuty == true){
                System.out.println(String.format("StaffMember with id %d is on duty", staff.id));
            }
            System.out.println("No staff is onDuty at the moment");
        }
    }

    public void printAllStaffList(){
        for( Staff staff : staffList){
            System.out.println(String.format("StaffMember with id %d is on duty", staff.id));
        }
    }
}
