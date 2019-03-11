package main.client.facility;

import main.model.user.UserRegistry;
import main.model.facility.MailRoom;

public class FrontDesk {
    private UserRegistry listOfUsers;
    private MailRoom mailInventory;

    public void findUserByRoom(int roomNumber ){
        listOfUsers.findUserByRoom(roomNumber);
    }

    public void findUserByName(String name){
        listOfUsers.findUserByName(name);
    }

    public void printAllUsers(){
        listOfUsers.printRooms();
    }

    public void addMail(int roomNumber, String mailType, String dateOfArrival, String reciepent) {
        mailInventory.addMail(roomNumber,mailType,dateOfArrival,reciepent);
    }

    public void findAUsersMailByName(String name) {
        mailInventory.findMailByReciepent(name);
    }

    public void findMailByName(String name) {
        mailInventory.findMailByReciepent(name);
    }

    public void findAUsersMailByRoomNumber(int roomNumber) {
        mailInventory.findMailByRoomNumber(roomNumber);
    }

    public void printAllMail() {
        mailInventory.printAllMail();
    }

    public void contactMaintenanceOffice(){
        //Paul please do this one.
    }
}
