package main.model.maintenance;

import main.client.maintenance.MaintenanceOffice;

import java.util.ArrayList;

public class MaintenanceStaff implements MaintenanceOffice {
    private MaintOff maintOff;
    public int id;
    public boolean onDuty;
    public int currentTask;//equal to manReq id


    public MaintenanceStaff(){
    }

    public MaintOff getMaintOff() {
        return maintOff;
    }

    public void setMaintOff(MaintOff maintOff) {
        this.maintOff = maintOff;
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

    public void addStaff(MaintenanceStaff staff){
        maintOff.addStaff(staff);
    }

    public MaintenanceStaff findMaintStaffById(int id){
        return maintOff.findMaintStaffById(id);
    }

    public void assignMaintStaff(MaintenanceRequest request, MaintenanceStaff staff) {
        maintOff.assignMaintStaff(request,staff);
    }
}
