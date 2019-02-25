import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistryTest {

    @Test
    public void addUserTest(){
        UserRegistry userRegistry = new UserRegistry();
        int arraySize = userRegistry.userList.size();
        userRegistry.addUser(1, 1, "6406776743","testUser1@gmail.com","Test User");
        assertEquals(arraySize,userRegistry.userList.size() - 1);
        userRegistry.addUser(2, 2, "6406776743","testUser2@gmail.com","Test User 2");
        assertEquals(arraySize,userRegistry.userList.size() - 2);
    }

    @Test
    public void findUserByName(){
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.addUser(1, 1, "6406776743","testUser1@gmail.com","Test User");
        userRegistry.addUser(2, 2, "6406776743","testUser2@gmail.com","Test User 2");
        User returnedUser = userRegistry.findUserByName("Test User");
        assertEquals(returnedUser.name,"Test User");
    }

}
