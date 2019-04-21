package main.model.BuildingAdmin;

import main.client.maintenance.MaintenanceOffice;
import main.model.facility.Building;
import main.model.facility.Floor;
import main.model.facility.MailRoom;
import main.model.facility.Room;
import main.model.user.User;
import main.model.staff.Staff;
import main.model.user.UserRegistry;

public class BuildingAdmin {

    //constructors for all models
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

    //methods for userRegistry
    public UserRegistry findUserByName(UserRegistry userRegistry,String name){
        User u = userRegistry.findUserByName(name);
        return u;
    }

    public UserRegistry findUserById(UserRegistry userRegistry,int id){
        User u = userRegistry.findUserById(id);
        return u;
    }

    public UserRegistry findUserByRoom(UserRegistry userRegistry,int roomNumber){
        User u = userRegistry.findUserByRoom(roomNumber);
        return u;
    }

    public UserRegistry findUserByEmail(UserRegistry userRegistry,String email){
        User u = userRegistry.findUserByEmail(email);
        return u;
    }

    public UserRegistry findUserByPhoneNumber(UserRegistry userRegistry, String phonenumber){
        User u = userRegistry.findUserByPhoneNumber(phonenumber);
        return u;
    }

}

