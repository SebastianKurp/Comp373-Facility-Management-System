package main.model.maintenance;

import main.client.maintenance.MaintenanceRequestInterface;
import main.model.facility.Room;


public class MaintenanceRequest implements MaintenanceRequestInterface {
    public MaintOff maintOff;
    public int id;
    public String date;
    public boolean inProgress;
    public String notes;
    public int estimateCost;
    public int assignedId;
    public Room room;

    public MaintenanceRequest(){
    }

    public MaintOff getMaintOff() {
        return maintOff;
    }

    public void setMaintOff(MaintOff maintOff) {
        this.maintOff = maintOff;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addRequest(MaintenanceRequest request){
        maintOff.addRequest(request);
    }

    public void getAllLogs(){
        maintOff.getAllLogs();
    }

    public MaintenanceRequest getSpecificLog(int id){
        return maintOff.getSpecificLog(id);
    }

    public int getNumberOfRequests(){
        return maintOff.getNumberOfRequests();
    }
    public int getNumberRequestsInProgress(){
        return maintOff.getNumberRequestsInProgress();
    }
}
