package main.model.maintenance;

import main.client.maintenance.MaintenanceOffice;

import java.util.ArrayList;

public class MaintenanceStaff extends MaintOff implements MaintenanceOffice {
    public int id;
    public boolean onDuty;
    public int currentTask;//equal to manReq id


    public MaintenanceStaff(int id, boolean onDuty, int currentTask){
        this.id = id;
        this.onDuty = onDuty;
        this.currentTask = currentTask;
    }

    public void setCurrentTask(int taskId){
        this.currentTask = taskId;
    }

    public void removeCurrentTask(){
        this.currentTask = -1;
    }

    public void changeOnDuty(){
        if(onDuty){
            this.onDuty = false;
        }else {
            this.onDuty = true;
        }
    }



}
