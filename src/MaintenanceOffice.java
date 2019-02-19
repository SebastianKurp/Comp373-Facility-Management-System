import java.util.ArrayList;

public class MaintenanceOffice {
    ArrayList<MaintenanceRequest> requestLog = new ArrayList<>();
    int numCurrentRequests;
    int numRequestsInProgress;


    public void getAllLogs(){
        for(MaintenanceRequest request : requestLog){
            System.out.println(request.requestID);
        }
    }
    public MaintenanceRequest getSpecificLog(int id){ //return request or null
        for(MaintenanceRequest request :requestLog){
            if(request.requestID == id){
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
        return count;
    }
    public int getRequestsInProgress(){
        int count = 0;
        for (MaintenanceRequest request : requestLog){
            if(request.inProgress == true){
                count++;
            }
        }
        return count;
    }
}
