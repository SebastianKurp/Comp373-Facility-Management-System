package main.client.user;

import main.model.facility.Room;
import main.model.user.User;

public interface UserInterface {
    public User findUserByRoom(int roomNumber );
    public User findUserByName(String name);
    public void printAllUsers();
    public void addUser(int id, Room room, String phoneNumber, String email, String name);

}
