package main.model.maintenance;

import main.model.facility.Room;

import java.util.ArrayList;
import java.util.List;

public class MaintOff {
    public List<MaintenanceStaff> maintenanceStaffList;
    public List<MaintenanceRequest> requestLog;
    public MaintOff() {
        this.requestLog = new ArrayList<MaintenanceRequest>();
        this.maintenanceStaffList = new ArrayList<MaintenanceStaff>();
    }
    public void addRequest(MaintenanceRequest request){
        requestLog.add(request);
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
    public void addStaff(MaintenanceStaff maintenanceStaff){
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
    public List<MaintenanceStaff> getMaintenanceStaffList() {
        return maintenanceStaffList;
    }

    public void setMaintenanceStaffList(List<MaintenanceStaff> maintenanceStaffList) {
        this.maintenanceStaffList = maintenanceStaffList;
    }

    public List<MaintenanceRequest> getRequestLog() {
        return requestLog;
    }

    public void setRequestLog(List<MaintenanceRequest> requestLog) {
        this.requestLog = requestLog;
    }

}
