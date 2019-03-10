package test.model;

import main.model.facility.Mail;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MailTest {

    @Test
    public void setRoomNumberTest(){
        Mail m = new Mail(1, "package", "01-01-2019","testUser1");
        int rn = 2;
        m.setRoomNumber(rn);
        assertEquals(rn,m.roomNumber);
    }

    @Test
    public void setMailTypeTest(){
        Mail m = new Mail(1, "package", "01-01-2019","testUser1");
        String mt = "letter";
        m.setMailType(mt);
        assertEquals(mt,m.mailType);
    }

    @Test
    public void setDateOfArrivalTest(){
        Mail m = new Mail(1, "package", "01-01-2019","testUser1");
        String doa = "01-02-2019";
        m.setDateOfArrival(doa);
        assertEquals(doa,m.dateOfArrival);
    }

    @Test
    public void setReciepentTest(){
        Mail m = new Mail(1, "package", "01-01-2019","testUser1");
        String r = "testUser2";
        m.setReciepent(r);
        assertEquals(r,m.reciepent);
    }

    @Test
    public void getRoomNumberTest() {
        Mail m = new Mail(1, "package", "01-01-2019","testUser1");
        int rn = m.getRoomNumber();
        assertEquals(m.roomNumber, rn);
    }

    @Test
    public void getTypeOfMailTest() {
        Mail m = new Mail(1, "package", "01-01-2019","testUser1");
        String typeOfMail = m.getTypeOfMail();
        assertEquals(m.mailType, typeOfMail);
    }

    @Test
    public void getDateOfArrivalTest() {
        Mail m = new Mail(1, "package", "01-01-2019","testUser1");
        String doa = m.getDateOfArrival();
        assertEquals(m.dateOfArrival, doa);
    }

    @Test
    public void getReciepentTest() {
        Mail m = new Mail(1, "package", "01-01-2019","testUser1");
        String r = m.getReciepent();
        assertEquals(m.reciepent, r);
    }
}
