import java.util.ArrayList;

public class MaintenanceRequest{
    int id;
    String date;
    boolean inProgress;
    String notes;
    int estimateCost;
    int assignedId;

    public MaintenanceRequest(String date, boolean inProgress, String notes, int estimateCost, int id, int assignedId){
        this.inProgress = inProgress;
        this.notes = notes;
        this.estimateCost = estimateCost;
        this.id = id;
        this.date = date;
        this.assignedId = assignedId;
    }

    public String toString(){
        return "Date:" + getDate() + " InProgress:" + isInProgress() + " Notes:" + getNotes() + " EstimateCost:" + getEstimateCost() +
                " ID:" + getId() + " assignedId: " + getAssignedId();
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setInProgress(boolean inProgress){
        this.inProgress = inProgress;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }

    public void setEstimateCost(int estimateCost){
        this.estimateCost = estimateCost;
    }

    public void setAssignedId(int id){
        this.assignedId = id;
    }

    public String getDate(){
        return this.date;
    }

    public String getNotes(){
        return  this.notes;
    }

    public int getEstimateCost(){
        return this.estimateCost;
    }

    public boolean isInProgress(){
        return this.inProgress;
    }

    public int getId(){
        return this.id;
    }

    public int getAssignedId(){
        return this.assignedId;
    }
}
