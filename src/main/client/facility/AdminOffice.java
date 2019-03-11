package main.client.facility;

import main.model.facility.Building;
import main.model.facility.Floor;
import main.model.staff.Staff;
import main.model.staff.StaffRegistry;
import java.util.ArrayList;

public class AdminOffice  {
    private StaffRegistry staffList;

    public void addNewStaffMember(int id, String postion, boolean onDuty, boolean isAdmin){
        staffList.addNewStaffMember(id,postion,onDuty, isAdmin);
    }

    public void findStaffMemberById(int id){
        staffList.findStaffMemberById(id);
    }


    public void printOutOnDutyStaff(){
        staffList.printAllOnDutyStaff();
    }

    public void printEntireStaffList(){
        staffList.printAllStaffList();
    }

    public void changeBuildingName(Building buildingName, String name){
        buildingName.setName(name);
    }

    public void maintenanceRequestForAFloor(){
        //Paul please do this one.
    }

    public void getNumberOfRooms(){
        //Paul please do this one.
    }

    public void getNumberOfVacantRooms(){
        //Paul please do this one.
    }

    public void setBuildingNotes(){
        //Paul please do this one.
    }

}
