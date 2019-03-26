package main.model.facility;

import main.model.user.User;

public class Mail extends MailRoom {
    public int roomNumber;
    public String mailType; //package or letter/bills
    public String dateOfArrival;
    public User recipient;

    public Mail( int roomNumber, String mailType, String dateOfArrival, User recipient){
        this.roomNumber = roomNumber;
        this.mailType = mailType;
        this.dateOfArrival = dateOfArrival;
        this.recipient = recipient;

        /*System.out.println(String.format("==Room # %d ==", roomNumber));
        System.out.println(String.format("recipient %s",recipient.name));
        System.out.println(String.format("Date of Arrival %s",dateOfArrival));
        System.out.println(String.format("Type of Mail %s",mailType));
        System.out.println("=========");*/
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
}
