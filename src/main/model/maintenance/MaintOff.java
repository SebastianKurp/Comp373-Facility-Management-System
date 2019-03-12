package main.model.maintenance;

import java.util.ArrayList;

public class MaintOff {
    public ArrayList<MaintenanceStaff> maintenanceStaffList;
    public ArrayList<MaintenanceRequest> requestLog;
    public MaintOff() {
        this.requestLog = new ArrayList<MaintenanceRequest>();
        this.maintenanceStaffList = new ArrayList<MaintenanceStaff>();
    }
    public void addRequest(String date, boolean inProgress, String notes, int estimateCost, int id, int assignedId) {
        MaintenanceRequest maintenanceRequest = new MaintenanceRequest(date, inProgress, notes, estimateCost, id, assignedId);
        requestLog.add(maintenanceRequest);
    }

    public void getAllLogs(){
        for (MaintenanceRequest request:requestLog){
            System.out.println(request.id);
        }
    }

    public MaintenanceRequest getSpecificLog(int id){ //return request or null
        for(MaintenanceRequest request : requestLog){
            if(request.id == id){
                System.out.println(request.toString());
                return request;
            }
        }
        System.out.println("Log Not Found");
        return null;
    }

    public int getNumberOfRequests(){
        int count = 0;
        for(MaintenanceRequest request : requestLog){
            count++;
        }
        System.out.println("There are " + count + " logs");
        return count;
    }
    public int getNumberRequestsInProgress() {
        int count = 0;
        for (MaintenanceRequest request : requestLog) {
            if (request.inProgress == true) {
                count++;
            }
        }
        System.out.println("There are " + count + " requests in progress");
        return count;
    }
    public void addStaff(int id, boolean onDuty, int currentTask){
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(id,onDuty,currentTask);
        maintenanceStaffList.add(maintenanceStaff);
    }

    public MaintenanceStaff findMaintStaffById(int id){
        for(MaintenanceStaff maintenanceStaff: maintenanceStaffList){
            if(maintenanceStaff.id == id){
                return maintenanceStaff;
            }
        }
        return null;
    }

    public void assignMaintStaff(MaintenanceRequest request, MaintenanceStaff staff){
        staff.setCurrentTask(request.id);
        request.setAssignedId(staff.id);
    }


}
