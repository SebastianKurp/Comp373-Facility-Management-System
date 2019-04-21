package main.model.BuildingAdmin;

import main.client.maintenance.MaintenanceOffice;
import main.model.facility.Building;
import main.model.facility.Floor;
import main.model.facility.MailRoom;
import main.model.facility.Room;
import main.model.maintenance.MaintenanceRequest;
import main.model.maintenance.MaintenanceStaff;
import main.model.staff.StaffRegistry;
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

    //methods for mailinterface
    public MailRoom findMailByReciepient(MailRoom mailRoom, User reciepient){
        MailRoom m = mailRoom.findMailByreciepient(reciepient);
        return m;
    }

    public MailRoom findMailByRoomNumber(MailRoom mailRoom, int roomNumber){
        MailRoom m = mailRoom.findMailByRoomNumber(roomNumber);
        return m;
    }

    //methods for maintenance request
    public MaintenanceRequest MaintenanceRequest(int id, String date, boolean inProgress, String notes, int estimateCost, int assignedId, Room room){
        return MaintenanceRequest(id, date, inProgress, notes, estimateCost, assignedId, room);
    }

    //methods for staff
    public StaffRegistry addNewStaffMember(StaffRegistry staffList ,Staff newStaff){
        StaffRegistry sL = staffList.addNewStaffMember(newStaff);
        return sL;
    }

    public StaffRegistry printStaffList(StaffRegistry staffList){
        return staffList.printAllStaffList();
    }
}

