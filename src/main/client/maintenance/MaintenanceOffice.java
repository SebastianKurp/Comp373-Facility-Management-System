package main.client.maintenance;

import main.model.maintenance.MaintenanceRequest;
import main.model.maintenance.MaintenanceStaff;
import java.util.ArrayList;

public interface MaintenanceOffice {
    public void addStaff(int id, boolean onDuty, int currentTask);
    public MaintenanceStaff findMaintStaffById(int id);
    public void assignMaintStaff(MaintenanceRequest request, MaintenanceStaff staff);
}


