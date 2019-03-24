package main.client.user;

public interface StaffInterface {
    public void setStaffId(int id);
    public void setposition(String position);
    public void setOnDuty(boolean onDuty);
    public int getStaffId();
    public String getposition();
    public boolean getOnDuty();
}
