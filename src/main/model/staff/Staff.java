package main.model.staff;

import main.client.user.StaffInterface;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Staff implements StaffInterface, PropertyChangeListener {
    public int id;
    public String position;
    public boolean onDuty;
    private String staffAnnouncement;

    public Staff(int id, String position, boolean onDuty, boolean isAdmin){
        this.id = id;
        this.position = position;
        this.onDuty = onDuty;
    }

    public void setStaffId(int id){
        this.id = id;
    }

    public void setposition(String position){
        this.position = position;
    }

    public void setOnDuty(boolean onDuty){
        this.onDuty = onDuty;
    }

    public int getStaffId(){
        return this.id;
    }

    public String getposition(){
        return this.position;
    }

    public boolean getOnDuty(){
        return this.onDuty;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        this.setStaffAnnouncement((String) evt.getNewValue());
    }

    public String getStaffAnnouncement() {
        if(staffAnnouncement == null){
            return "No Announcements";
        }else {
            return this.staffAnnouncement;
        }
    }

    public void setStaffAnnouncement(String staffAnnouncement) {
        this.staffAnnouncement = staffAnnouncement;
    }
}