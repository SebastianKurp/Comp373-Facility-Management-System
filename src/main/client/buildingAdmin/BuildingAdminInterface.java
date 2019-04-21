package main.client.buildingAdmin;

import main.model.facility.MailRoom;
import main.model.user.User;
import main.model.user.UserRegistry;
import main.model.facility.Room;

public interface BuildingAdminInterface {
    //constructor method for most models
    void createNewBuilding();
    void createNewFloor();
    void createNewRoom();
    void createNewMailRoom();
    void createNewMaintenanceOffice();
    void createNewUser();
    void createNewStaff();

    //methods for users
    void findUserByName(UserRegistry userRegistry,String name);
    void findUserById(UserRegistry userRegistry,int id);
    void findUserByRoom(UserRegistry userRegistry,int roomNumber);
    void findUserByEmail(UserRegistry userRegistry,String email);
    void indUserByPhoneNumber(UserRegistry userRegistry, String phonenumber);

    //methods for maintenance
    void MaintenanceRequest(int id, String date, boolean inProgress, String notes, int estimateCost, int assignedId, Room room);

    //methods for mail
    void findMailByReciepient(MailRoom mailRoom, User reciepient);
    void findMailByRoomNumber(MailRoom mailRoom, int roomNumber);
}
