import java.util.Arrays;

public class Staff {
    int id;
    String postion;
    boolean onDuty;
    boolean isAdmin;

    public Staff(int id, String postion, boolean onDuty, boolean isAdmin){
        this.id = id;
        this.postion = postion;
        this.onDuty = onDuty;
        this.isAdmin = isAdmin;
    }

    public void setStaffId(int id){
        this.id = id;
    }

    public void setPostion(String postion){
        this.postion = postion;
    }

    public void setOnDuty(boolean onDuty){
        this.onDuty = onDuty;
    }

    public void setIsAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;
    }

    public int getStaffId(){
        return this.id;
    }

    public String getPostion(){
        return this.postion;
    }

    public boolean getOnDuty(){
        return this.onDuty;
    }

    public boolean getIsAdmin(){
        return this.isAdmin;
    }
}
