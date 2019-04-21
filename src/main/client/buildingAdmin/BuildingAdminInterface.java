package main.client.buildingAdmin;

import main.model.user.UserRegistry;

public interface BuildingAdminInterface {
    //constructor method for most models
    void createNewBuilding();
    void createNewFloor();
    void createNewRoom();
    void createNewMailRoom();
    void createNewMaintenanceOffice();
    void createNewUser();
    void createNewStaff();

    //getters for users
    void findUserByName(UserRegistry userRegistry,String name);
    void findUserById(UserRegistry userRegistry,int id);
    void findUserByRoom(UserRegistry userRegistry,int roomNumber);
    void findUserByEmail(UserRegistry userRegistry,String email);
    void indUserByPhoneNumber(UserRegistry userRegistry, String phonenumber);

}
