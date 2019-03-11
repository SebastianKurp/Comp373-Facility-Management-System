package test.model;

import main.model.facility.MailRoom;
import main.model.facility.Mail;
import org.junit.Test;
import static org.junit.Assert.*;

public class MailRoomTest {

    @Test
    public void addUserTest(){
        MailRoom mailRoom = new MailRoom();
        int arraySize = mailRoom.mailInvetory.size();
        mailRoom.addMail(1, "letter", "01-01-2019","TestUser1");
        assertEquals(arraySize,mailRoom.mailInvetory.size() - 1);
        mailRoom.addMail(2, "package", "01-02-2019","TestUser1");
        assertEquals(arraySize,mailRoom.mailInvetory.size() - 2);
    }

    @Test
    public void findMailByReciepentTest(){
        MailRoom mailRoom = new MailRoom();
        mailRoom.addMail(1, "letter", "01-01-2019","TestUser1");
        mailRoom.addMail(2, "package", "01-02-2019","TestUser1");
        Mail mail = mailRoom.findMailByReciepent("TestUser1");
        assertEquals(mail.reciepent,"TestUser1");
        Mail dontFindMail = mailRoom.findMailByReciepent("Test User3");
        assertEquals(dontFindMail,null);
    }

    @Test
    public void findMailByRoomNumberTest(){
        MailRoom mailRoom = new MailRoom();
        mailRoom.addMail(1, "letter", "01-01-2019","TestUser1");
        mailRoom.addMail(2, "package", "01-02-2019","TestUser1");
        Mail mail = mailRoom.findMailByRoomNumber(1);
        assertEquals(mail.roomNumber,1);
        Mail dontFindMail = mailRoom.findMailByRoomNumber(3);
        assertEquals(dontFindMail,null);
    }
}
