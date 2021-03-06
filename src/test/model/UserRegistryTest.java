package test.model;
/*
import main.model.facility.Room;
import main.model.user.User;
import main.model.user.UserRegistry;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistryTest {
    Room room = new Room(1,"Double",2,1500,false);
    Room room2 = new Room(21,"Double",2,1500,false);


    public void addUserTest(){
        UserRegistry userRegistry = new UserRegistry();
        int arraySize = userRegistry.userList.size();
        userRegistry.addUser(1, room, "6406776743","testUser1@gmail.com","Test main.model.user.User");
        assertEquals(arraySize,userRegistry.userList.size() - 1);
        userRegistry.addUser(2, room2, "6406776743","testUser2@gmail.com","Test main.model.user.User 2");
        assertEquals(arraySize,userRegistry.userList.size() - 2);
    }


    public void findUserByNameTest(){
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.addUser(1, room, "6406776743","testUser1@gmail.com","Test main.model.user.User");
        userRegistry.addUser(2, room2, "6406776743","testUser2@gmail.com","Test main.model.user.User 2");
        User returnedUser = userRegistry.findUserByName("Test main.model.user.User");
        assertEquals(returnedUser.name,"Test main.model.user.User");
        User dontFindUser = userRegistry.findUserByName("Test User3");
        assertEquals(dontFindUser,null);
    }

    @Test
    public void findUserByIdTest(){
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.addUser(1, room, "6406776743","testUser1@gmail.com","Test main.model.user.User");
        userRegistry.addUser(2, room2, "6406776743","testUser2@gmail.com","Test main.model.user.User 2");
        User returnedUser = userRegistry.findUserById(2);
        assertEquals(returnedUser.id,2);
        User dontFindUser = userRegistry.findUserById(3);
        assertEquals(dontFindUser,null);
    }

    @Test
    public void findUserByRoomTest(){
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.addUser(1, room, "6406776743","testUser1@gmail.com","Test main.model.user.User");
        userRegistry.addUser(2, room2, "6406776743","testUser2@gmail.com","Test main.model.user.User 2");
        User returnedUser = userRegistry.findUserByRoom(1);
        assertEquals(returnedUser.room.roomNumber,1);
        User dontFindUser = userRegistry.findUserByRoom(3);
        assertEquals(dontFindUser,null);
    }

    @Test
    public void findUserByEmailTest(){
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.addUser(1, room, "6406776743","testUser1@gmail.com","Test main.model.user.User");
        userRegistry.addUser(2, room2, "6406776743","testUser2@gmail.com","Test main.model.user.User 2");
        User returnedUser = userRegistry.findUserByEmail("testUser1@gmail.com");
        assertEquals(returnedUser.email,"testUser1@gmail.com");
        User dontFindUser = userRegistry.findUserByEmail("testUser3@gmail.com");
        assertEquals(dontFindUser,null);
    }

    @Test
    public void findUserByPhoneNumberTest(){
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.addUser(1, room, "6406776743","testUser1@gmail.com","Test main.model.user.User");
        userRegistry.addUser(2, room2, "6406776743","testUser2@gmail.com","Test main.model.user.User 2");
        User returnedUser = userRegistry.findUserByPhoneNumber("6406776743");
        assertEquals(returnedUser.phoneNumber,"6406776743");
        User dontFindUser = userRegistry.findUserByPhoneNumber("6406776742");
        assertEquals(dontFindUser,null);
    }
}*/
