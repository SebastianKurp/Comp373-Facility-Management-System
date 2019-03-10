package main.model.user;

public class User {
    public int id;
    public int room;
    public String phoneNumber;
    public String email;
    public String name;

    public User(int id, int room, String phoneNumber, String email, String name) {
        this.id = id;
        this.room = room;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;

        System.out.println(String.format("%s, with %d, added to registry", name, id) );
    }

    public void setUserId(int id){
        this.id = id;
    }

    public void setUserRoom(int room){
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

    public int getUserRoom(){
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
}
