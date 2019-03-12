package main.client.user;

import main.model.user.UserRegistry;
import main.model.facility.MailRoom;

public interface StaffInterface {
    public void setStaffId(int id);
    public void setPostion(String postion);
    public void setOnDuty(boolean onDuty);
    public int getStaffId();
    public String getPostion();
    public boolean getOnDuty();
}
