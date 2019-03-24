package main.model.facility;

import main.client.facility.MailInterface;
import main.model.user.User;

import java.util.ArrayList;
import java.util.List;

public class MailRoom implements MailInterface {
    public List<Mail> mailInventory;

    public MailRoom() {
        this.mailInventory = new ArrayList<Mail>();
    }

    public void addMail(Mail newMail) {
        mailInventory.add(newMail);
    }

    public Mail findMailByreciepient(User reciepient) {
        for(Mail mail : mailInventory){
            if (mail.recipient.equals(reciepient)) {
                return mail;
            }

        }
        System.out.println(String.format("No Mail for %s found...", reciepient));
        return null;
    }

    public Mail findMailByRoomNumber(int roomNumber){
        for (Mail mail : mailInventory){
            if(mail.roomNumber == roomNumber) {
                return mail;
            }
        }
        System.out.println(String.format("No Mail with roomnumber: %d found", roomNumber));
        return null;
    }



    public void printAllMail(){
        for(Mail mail : mailInventory){
            System.out.println(String.format("== Room Number # %d ==", mail.roomNumber));
            System.out.println(String.format("Name: %s", mail.recipient.name));
            System.out.println(String.format("Type: %s", mail.mailType));
            System.out.println(String.format("Date of Arrival: %s", mail.dateOfArrival));
        }
    }

    public List<Mail> getMailInventory() {
        return mailInventory;
    }

    public void setMailInventory(List<Mail> mailInventory) {
        this.mailInventory = mailInventory;
    }
}
