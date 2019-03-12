package main.client.facility;

import main.model.facility.Mail;
import main.model.user.User;

public interface MailInterface {
    public void addMail(Mail newMail);
    public Mail findMailByReciepent(User reciepent);
    public Mail findMailByRoomNumber(int roomNumber);
    public void printAllMail();
}
