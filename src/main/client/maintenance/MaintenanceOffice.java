package main.client.maintenance;

import main.model.maintenance.MaintenanceRequest;
import main.model.maintenance.MaintenanceStaff;
import java.util.ArrayList;

public class MaintenanceOffice {
    public ArrayList<MaintenanceRequest> requestLog;
    public ArrayList<MaintenanceStaff> staffList;
    public int numCurrentRequests;
    public int numRequestsInProgress;

    public MaintenanceOffice(){
        this.requestLog = new ArrayList<MaintenanceRequest>();
        this.staffList = new ArrayList<MaintenanceStaff>();
    }

    public void addStaff(int id, boolean onDuty, int currentTask){
        MaintenanceStaff maintStaff = new MaintenanceStaff(id,onDuty,currentTask);
        staffList.add(maintStaff);
    }

    public MaintenanceStaff findMaintStaffById(int id){
        for(MaintenanceStaff staff : staffList){
            if(staff.id == id){
                return staff;
            }
        }
        return null;
    }

    public void assignMaintStaff(MaintenanceRequest request, MaintenanceStaff staff){//assign staff to request
        staff.setCurrentTask(request.id);
        request.setAssignedId(staff.id);
    }

    public void addRequest(String date, boolean inProgress, String notes, int estimateCost, int id, int assignedID){
        MaintenanceRequest maintRequest = new MaintenanceRequest(date,inProgress,notes, estimateCost, id,assignedID);
        requestLog.add(maintRequest);
    }

    public void getAllLogs(){
        for(MaintenanceRequest request : requestLog){
            System.out.println(request.toString());
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
}