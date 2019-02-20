import java.util.ArrayList;

public class MaintenanceRequest{
    String date;
    boolean inProgress;
    String notes;
    int estimateCost;

    public MaintenanceRequest(String data, boolean inProgress, String notes, int estimateCost){
        this.inProgress = inProgress;
        this.notes = notes;
        this.estimateCost = estimateCost;
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
}
