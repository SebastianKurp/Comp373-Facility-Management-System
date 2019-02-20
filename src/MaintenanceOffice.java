import java.util.ArrayList;

public class MaintenanceOffice {
    ArrayList<MaintenanceRequest> requestLog;
    int numCurrentRequests;
    int numRequestsInProgress;

    public MaintenanceOffice(){
        this.requestLog = new ArrayList<MaintenanceRequest>();
    }

    public void addRequest(String date, boolean inProgress, String notes, int estimateCost){
        MaintenanceRequest maintRequest = new MaintenanceRequest(date,inProgress,notes, estimateCost);
        requestLog.add(maintRequest);
    }

    public void getAllLogs(){
        for(MaintenanceRequest request : requestLog){
            System.out.println(request.notes);
        }
    }
    public MaintenanceRequest getSpecificLog(String date){ //return request or null
        for(MaintenanceRequest request :requestLog){
            if(request.date == date){
                return request;
            }
        }
        return null;
    }
    public int getNumberOfRequests(){
        int count = 0;
        for(MaintenanceRequest request : requestLog){
            count++;
        }
        System.out.println(count);
        return count;
    }
    public int getRequestsInProgress(){
        int count = 0;
        for (MaintenanceRequest request : requestLog){
            if(request.inProgress == true){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
