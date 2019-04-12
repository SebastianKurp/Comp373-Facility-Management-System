package main.model.staff;

import main.client.facility.AdminInterface;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class StaffRegistry implements AdminInterface{
//    private List<Object> stafflist = new ArrayList<Staff>(20);
    private List<Staff> staffList;
    private String staffAnnouncement;
    private PropertyChangeSupport support;

    public StaffRegistry(){
        this.staffList = new ArrayList<Staff>();
        support = new PropertyChangeSupport(this);
    }

    public void addNewStaffMember(int id, String position, boolean onDuty, boolean isAdmin){
        Staff newStaff = new Staff( id, position, onDuty, isAdmin);
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

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setStaffAnnouncement(String announcement){
        support.firePropertyChange("staffAnnouncement",this.staffAnnouncement,announcement);
        this.staffAnnouncement = announcement;
    }

    public String getStaffAnnouncement(){
        return staffAnnouncement;
    }
}
