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

    public User findUserByName(String name) {
        for(User user : userList){
            if (user.name.equals(name)) {
                return user;
            }

        }
        System.out.println(String.format("User %s not found...", name));
        return null;
    }

    public User findUserById(int id){
        for (User user : userList){
            if(user.id == id) {
                return user;
            }
        }
        System.out.println(String.format("User %d not found", id));
        return null;
    }
}
