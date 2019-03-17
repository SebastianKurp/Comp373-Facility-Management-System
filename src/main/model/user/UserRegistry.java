package main.model.user;

import main.model.facility.Room;
import main.model.user.User;

import java.util.ArrayList;

public class UserRegistry {
    private ArrayList<User> userList;

    public UserRegistry() {
        this.userList = new ArrayList<User>();
    }

    public void addUser(int id, Room room, String phoneNumber, String email, String name) {
        User newUser = new User(id, room, phoneNumber, email, name);
        userList.add(newUser);
    }

    public User findUserByName(String name) {
        for(User user : userList){
            if (user.name.equals(name)) {
                return user;
            }

        }
        System.out.println(String.format("=User %s not found...", name));
        return null;
    }

    public User findUserById(int id){
        for (User user : userList){
            if(user.id == id) {
                return user;
            }
        }
        System.out.println(String.format("User with id: %d not found", id));
        return null;
    }

    public User findUserByRoom(int roomNumber){
        for (User user : userList){
            if(user.room.roomNumber == roomNumber) {
                return user;
            }
        }
        System.out.println(String.format("User with roomnumber: %d found", roomNumber));
        return null;
    }

    public User findUserByEmail(String email) {
        for(User user : userList){
            if (user.email.equals(email)) {
                return user;
            }

        }
        System.out.println(String.format("User with email: %s not found...", email));
        return null;
    }

    public User findUserByPhoneNumber(String phonenumber) {
        for(User user : userList){
            if (user.phoneNumber.equals(phonenumber)) {
                return user;
            }

        }
        System.out.println(String.format("User with phonenumber: %s not found...", phonenumber));
        return null;
    }

    public void printRooms(){
        for(User user : userList){
            System.out.println(String.format("== UUID # %d ==", user.id));
            System.out.println(String.format("Name: %s", user.name));
            System.out.println(String.format("Room: %d", user.room));
            System.out.println(String.format("Email: %s", user.name));
            System.out.println(String.format("PhoneNumber: %s", user.phoneNumber));
        }
    }
}
