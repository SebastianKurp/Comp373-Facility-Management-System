package main.model.staff;

import main.client.user.StaffInterface;

public class Staff extends StaffRegistry implements StaffInterface {
    public int id;
    public String postion;
    public boolean onDuty;

    public Staff(int id, String postion, boolean onDuty, boolean isAdmin){
        this.id = id;
        this.postion = postion;
        this.onDuty = onDuty;
    }

    public void setStaffId(int id){
        this.id = id;
    }

    public void setPostion(String postion){
        this.postion = postion;
    }

    public void setOnDuty(boolean onDuty){
        this.onDuty = onDuty;
    }

    public int getStaffId(){
        return this.id;
    }

    public String getPostion(){
        return this.postion;
    }

    public boolean getOnDuty(){
        return this.onDuty;
    }

}