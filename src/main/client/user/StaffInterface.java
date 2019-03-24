package main.client.user;

import main.model.user.UserRegistry;
import main.model.facility.MailRoom;

public interface StaffInterface {
    public void setStaffId(int id);
    public void setposition(String position);
    public void setOnDuty(boolean onDuty);
    public int getStaffId();
    public String getposition();
    public boolean getOnDuty();
}
