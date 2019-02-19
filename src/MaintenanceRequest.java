import java.util.ArrayList;

public class MaintenanceRequest{
    int requestID;
    String dateIssued;
    String dateCompleted;
    String dateStarted;
    boolean inProgress;
    ArrayList<String> notes;
    int issuerID;
    int idOfStaffMember;
    int estimateCost;

    public MaintenanceRequest(int requestID,String dateIssued,String dateStarted,String dateCompleted,boolean inProgress,
                              ArrayList<String> notes,int issuerID, int idOfStaffMember, int estimateCost){
        this.requestID = requestID;
        this.dateIssued = dateIssued;
        this.dateCompleted = dateCompleted;
        this.dateStarted = dateStarted;
        this.inProgress = inProgress;
        this.notes = notes;
        this.issuerID = issuerID;
        this.idOfStaffMember = idOfStaffMember;
        this.estimateCost = estimateCost;
    }

    public void createLog(){
    }

    public void deleteLog(String log){

    }

    public void editLog(String log){

    }
}
