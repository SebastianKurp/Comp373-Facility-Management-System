package test.model;

import main.model.user.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void setUserIdTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        int id = 1234;
        u.setUserId(id);
        assertEquals(id,u.id);
    }

    @Test
    public void setUserRoomTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        int room = 14;
        u.setUserRoom(room);
        assertEquals(room,u.room);
    }

    @Test
    public void setUserPhonenumberTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        String pn = "6406776713";
        u.setUserPhonenumber(pn);
        assertEquals(pn,u.phoneNumber);
    }

    @Test
    public void setUserEmailTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        String email = "NewTestUser@gmail.com";
        u.setUserEmail(email);
        assertEquals(email,u.email);
    }

    @Test
    public void setUserNameTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        String name = "NewUser";
        u.setUserName(name);
        assertEquals(name,u.name);
    }

    @Test
    public void getUserIdTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        int id = u.getUserId();
        assertEquals(id,u.id);
    }

    @Test
    public void getUserRoomTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        int room = u.getUserRoom();
        assertEquals(room,u.room);
    }

    @Test
    public void getUserPhonenumberTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        String pn = u.getUserPhonenumber();
        assertEquals(pn,u.phoneNumber);
    }

    @Test
    public void getUserEmailTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        String email = u.getUserEmail();
        assertEquals(email,u.email);
    }

    @Test
    public void getUserNameTest(){
        User u = new User(1, 1, "6406776743","testUser1","Test main.model.user.User");
        String name = u.getUserName();
        assertEquals(name,u.name);
    }
}
