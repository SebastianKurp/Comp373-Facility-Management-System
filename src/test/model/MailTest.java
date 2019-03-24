package test.model;

import main.model.facility.Mail;
import main.model.user.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MailTest {
    User user = new User(1,null,"6366369999","fake@gmail.com","testUser1");
    @Test
    public void setRoomNumberTest(){
        Mail m = new Mail(1, "package", "01-01-2019",user);
        int rn = 2;
        m.setRoomNumber(rn);
        assertEquals(rn,m.roomNumber);
    }

    @Test
    public void setMailTypeTest(){
        Mail m = new Mail(1, "package", "01-01-2019",user);
        String mt = "letter";
        m.setMailType(mt);
        assertEquals(mt,m.mailType);
    }

    @Test
    public void setDateOfArrivalTest(){
        Mail m = new Mail(1, "package", "01-01-2019",user);
        String doa = "01-02-2019";
        m.setDateOfArrival(doa);
        assertEquals(doa,m.dateOfArrival);
    }

    @Test
    public void setreciepientTest(){
        Mail m = new Mail(1, "package", "01-01-2019",user);
        User user = new User(1,null,"6366369999","fake@gmail.com","testUser2");
        m.setreciepient(user);
        assertEquals(user,m.recipient);
    }

    @Test
    public void getRoomNumberTest() {
        Mail m = new Mail(1, "package", "01-01-2019",user);
        int rn = m.getRoomNumber();
        assertEquals(m.roomNumber, rn);
    }

    @Test
    public void getTypeOfMailTest() {
        Mail m = new Mail(1, "package", "01-01-2019",user);
        String typeOfMail = m.getTypeOfMail();
        assertEquals(m.mailType, typeOfMail);
    }

    @Test
    public void getDateOfArrivalTest() {
        Mail m = new Mail(1, "package", "01-01-2019",user);
        String doa = m.getDateOfArrival();
        assertEquals(m.dateOfArrival, doa);
    }

    @Test
    public void getreciepientTest() {
        Mail m = new Mail(1, "package", "01-01-2019",user);
        User user = m.getreciepient();
        assertEquals(m.recipient, user);
    }
}
