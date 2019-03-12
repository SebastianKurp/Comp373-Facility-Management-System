package test.model;

import main.model.facility.MailRoom;
import main.model.facility.Mail;
import main.model.user.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class MailRoomTest {
    User user = new User(1,null,"6366369999","fake@gmail.com","testUser1");
    User user1 = new User(1,null,"6366369999","fake@gmail.com","testUser2");


    @Test
    public void addMailTest(){
        MailRoom mailRoom = new MailRoom();
        int arraySize = mailRoom.mailInvetory.size();
        Mail mail = new Mail(1,"package","2/20/19",user);
        mailRoom.addMail(mail);
        assertEquals(arraySize,mailRoom.mailInvetory.size() - 1);
        Mail mail2 = new Mail(2,"package","2/20/19",user);
        mailRoom.addMail(mail2);
        assertEquals(arraySize,mailRoom.mailInvetory.size() - 2);
    }

    @Test
    public void findMailByReciepentTest(){
        MailRoom mailRoom = new MailRoom();
        Mail mail = new Mail(1,"package","2/20/19",user);
        Mail mail2 = new Mail(2,"package","2/20/19",user1);
        User user2 = new User(1,null,"6366369999","fake@gmail.com","testUser3");

        mailRoom.addMail(mail);
        mailRoom.addMail(mail2);
        Mail reciepent = mailRoom.findMailByReciepent(user);
        assertEquals(reciepent.reciepent,user);
        Mail dontFindMail = mailRoom.findMailByReciepent(user2);
        assertEquals(dontFindMail,null);
    }

    @Test
    public void findMailByRoomNumberTest(){
        MailRoom mailRoom = new MailRoom();
        Mail mail = new Mail(1,"package","2/20/19",user);
        Mail mail2 = new Mail(2,"package","2/20/19",user1);
        mailRoom.addMail(mail);
        mailRoom.addMail(mail2);
        Mail roomNumber = mailRoom.findMailByRoomNumber(1);
        assertEquals(roomNumber.roomNumber,1);
        Mail dontFindMail = mailRoom.findMailByRoomNumber(3);
        assertEquals(dontFindMail,null);
    }
}
