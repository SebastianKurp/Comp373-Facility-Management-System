import java.util.ArrayList;

public class MaintenanceStaff extends MaintenanceOffice{
    int id;
    ArrayList<Boolean> availability;
    boolean onDuty;
    int currentTask;//equal to manReq id


    public int addMaintRequest(){
        MaintenanceRequest m1 = new MaintenanceRequest(99,"2/19/2019","","",false,null,0,id,0);
        return m1.requestID;
    }

    public void removeMaintRequest(int requestId){

    }

    public void editMaintRequest(){

    }
}
