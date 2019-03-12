package main.model.facility;

import main.client.facility.MailInterface;
import main.model.user.User;

import java.util.ArrayList;

public class MailRoom implements MailInterface {
    public ArrayList<Mail> mailInvetory;

    public MailRoom() {
        this.mailInvetory = new ArrayList<Mail>();
    }

    public void addMail(Mail newMail) {
        mailInvetory.add(newMail);
    }

    public Mail findMailByReciepent(User reciepent) {
        for(Mail mail : mailInvetory){
            if (mail.reciepent.equals(reciepent)) {
                return mail;
            }

        }
        System.out.println(String.format("No Mail for %s found...", reciepent));
        return null;
    }

    public Mail findMailByRoomNumber(int roomNumber){
        for (Mail mail : mailInvetory){
            if(mail.roomNumber == roomNumber) {
                return mail;
            }
        }
        System.out.println(String.format("No Mail with roomnumber: %d found", roomNumber));
        return null;
    }



    public void printAllMail(){
        for(Mail mail : mailInvetory){
            System.out.println(String.format("== Room Number # %d ==", mail.roomNumber));
            System.out.println(String.format("Name: %s", mail.reciepent));
            System.out.println(String.format("Type: %s", mail.mailType));
            System.out.println(String.format("Date of Arrival: %s", mail.dateOfArrival));
        }

    }
}
