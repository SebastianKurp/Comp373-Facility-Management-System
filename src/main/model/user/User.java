package main.model.user;

import main.client.user.UserInterface;
import main.model.facility.Room;


import java.util.ArrayList;

public class User extends UserRegistry implements UserInterface {
    public UserRegistry userRegistry;
    public ArrayList<User> users;
    public int id;
    public Room room;
    public String phoneNumber;
    public String email;
    public String name;

    public User(int id, Room room, String phoneNumber, String email, String name) {
        this.id = id;
        this.room = room;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;

        //System.out.println(String.format("%s, with %d, added to registry", name, id) );
    }

    public void setUserId(int id){
        this.id = id;
    }

    public void setUserRoom(Room room){
        this.room = room;
    }

    public void setUserPhonenumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setUserEmail(String email){
        this.email = email;
    }

    public void setUserName(String name){
        this.name = name;
    }

    public int getUserId(){
        return this.id;
    }

    public Room getUserRoom(){
        return this.room;
    }

    public String getUserPhonenumber(){
        return this.phoneNumber;
    }

    public String getUserEmail(){
        return this.email;
    }

    public String getUserName(){
        return this.name;
    }

    public void setUserRegistry(UserRegistry userRegistry) {
        this.userRegistry = userRegistry;
    }

    public UserRegistry getUserRegistry(){
        return userRegistry;
    }

    public User findUserByRoom(int roomNumber){
        User u= userRegistry.findUserByRoom(roomNumber);
        return u;
    }

    public User findUserByName(String name){
        User u = userRegistry.findUserByName(name);
        return u;
    }

    public void addUser(int id, Room room, String phoneNumber, String email, String name){
        userRegistry.addUser(id,room,phoneNumber,email,name);
    }
/*
    public User findUserByRoom(int roomNumber ){
        for(User user:users){
            if(user.room.roomNumber == roomNumber){
                return user;
            }
        }
        return null;
    }
    public User findUserByName(String name){
        for(User user: users){
            if(user.name == name){
                return user;
            }
        }
        return null;
    }
    public void printAllUsers(){
        for (User user:users){
            System.out.println(user.name);
        }
    }

    public void addUser(int id, Room room, String phoneNumber, String email, String name){
        User user = new User(id,room,phoneNumber,email,name);
        users.add(user);
    }*/
}
