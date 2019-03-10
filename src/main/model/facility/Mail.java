package main.model.facility;

public class Mail {
    public int roomNumber;
    public String mailType; //package or letter/bills
    public String dateOfArrival;
    public String reciepent;


    public Mail( int roomNumber, String mailType, String dateOfArrival, String reciepent){
        this.roomNumber = roomNumber;
        this.mailType = mailType;
        this.dateOfArrival = dateOfArrival;
        this.reciepent = reciepent;

        System.out.println(String.format("==Room # %d ==", roomNumber));
        System.out.println(String.format("Reciepent %s",reciepent));
        System.out.println(String.format("Date of Arrival %s",dateOfArrival));
        System.out.println(String.format("Type of Mail %s",mailType));
        System.out.println("=========");
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    public void setDateOfArrival(String dateOfArrival){ this.dateOfArrival = dateOfArrival; }

    public void setReciepent(String reciepent ){ this.reciepent = reciepent ;}

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getTypeOfMail(){
        return mailType;
    }

    public String getDateOfArrival() { return dateOfArrival;}

    public String getReciepent() { return reciepent;}
}
