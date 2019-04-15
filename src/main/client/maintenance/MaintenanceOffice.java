package main.client.maintenance;

import main.model.maintenance.MaintenanceRequest;
import main.model.maintenance.MaintenanceStaff;

public interface MaintenanceOffice {
    public void addStaff(MaintenanceStaff staff);
    public MaintenanceStaff findMaintStaffById(int id);
    public void assignMaintStaff(MaintenanceRequest request, MaintenanceStaff staff);
}


