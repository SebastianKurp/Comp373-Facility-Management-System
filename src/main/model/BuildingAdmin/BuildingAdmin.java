package main.model.BuildingAdmin;

import main.client.maintenance.MaintenanceOffice;
import main.model.facility.Building;
import main.model.facility.Floor;
import main.model.facility.MailRoom;
import main.model.facility.Room;
import main.model.user.User;
import main.model.staff.Staff;

public class BuildingAdmin {

    public Building createNewBuilding() {
        Building b = new Building();
        return b;
    }

    public Floor createNewFloor() {
        Floor f = new Floor();
        return f;
    }

    public Room createNewRoom() {
        Room r = new Room();
        return r;
    }

    public MailRoom createNewMailRoom(){
        MailRoom m = new MailRoom();
        return m;
    }

    public MaintenanceOffice createNewMaintenanceOffice(){
        MaintenanceOffice mO = createNewMaintenanceOffice();
        return mO;
    }

    public User createNewUser() {
        User u = new User();
        return u;
    }

    public Staff createNewStaff(){
        Staff s = new Staff();
        return s;

    }
}

