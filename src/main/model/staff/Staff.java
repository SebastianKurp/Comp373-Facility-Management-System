package main.model.staff;

import main.client.user.StaffInterface;

public class Staff extends StaffRegistry implements StaffInterface {
    public int id;
    public String position;
    public boolean onDuty;

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

}