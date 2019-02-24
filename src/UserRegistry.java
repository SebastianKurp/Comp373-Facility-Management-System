import java.util.ArrayList;

public class UserRegistry {
    ArrayList<User> userList;

    public UserRegistry() {
        this.userList = new ArrayList<User>();
    }

    public void addUser(int id, int room, String phoneNumber, String email, String name) {
        User newUser = new User(id, room, phoneNumber, email, name);
        userList.add(newUser);
    }

//    public UserRegistry findUserByName(String name) {
//        for(User user : userList){
//            if (user.name = name){
//                return user;
//            }
//        }
//    }
}
