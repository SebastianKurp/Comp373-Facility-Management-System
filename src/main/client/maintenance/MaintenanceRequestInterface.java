package main.client.maintenance;

import main.model.facility.Room;
import main.model.maintenance.MaintenanceRequest;

public interface MaintenanceRequestInterface {
    public void addRequest(String date, boolean inProgress, String notes, int estimateCost,
                           int id, int assignedID, Room room);
    public void getAllLogs();
    public MaintenanceRequest getSpecificLog(int id);
    public int getNumberOfRequests();
    public int getNumberRequestsInProgress() ;
}
