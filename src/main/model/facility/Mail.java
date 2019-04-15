package main.model.facility;

import main.model.user.User;

public class Mail{
    public MailRoom mailRoom;
    public int roomNumber;
    public String mailType; //package or letter/bills
    public String dateOfArrival;
    public User recipient;

    public Mail(){}


    public MailRoom getMailRoom() {
        return mailRoom;
    }

    public void setMailRoom(MailRoom mailRoom) {
        this.mailRoom = mailRoom;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    public void setDateOfArrival(String dateOfArrival){ this.dateOfArrival = dateOfArrival; }

    public void setreciepient(User reciepient ){ this.recipient = reciepient ;}

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getTypeOfMail(){
        return mailType;
    }

    public String getDateOfArrival() { return dateOfArrival;}

    public User getreciepient() { return recipient;}

    public void addMail(Mail mail){
        mailRoom.addMail(mail);
    }

    public void printAllMail(){
        mailRoom.printAllMail();
    }
}
