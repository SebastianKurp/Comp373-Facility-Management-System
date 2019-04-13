package main.client.user;

import main.model.facility.Room;
import main.model.user.User;

public interface UserInterface {
    public User findUserByRoom(int roomNumber );
    public User findUserByName(String name);

    public void addUser(User user);

}
