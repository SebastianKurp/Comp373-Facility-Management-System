import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        MaintenanceOffice MaintOff = new MaintenanceOffice();
        //create requests
        MaintOff.addRequest("2/20/19",false,"This is a test",500, 1,-1);
        MaintOff.addRequest("2/20/19",false,"test",500, 2,-1);

        //check gets
        MaintOff.getAllLogs();
        MaintOff.getNumberOfRequests();
        MaintOff.getRequestsInProgress();
        MaintenanceRequest request = MaintOff.getSpecificLog(1);
        MaintOff.getSpecificLog(2);

        //add maintenance staff
        MaintOff.addStaff(1,true,-1);
        MaintenanceStaff staff = MaintOff.findMaintStaffById(1);

        //check assigning staff
        MaintOff.assignMaintStaff(request,staff);
        MaintOff.getSpecificLog(1);
        MaintOff.getSpecificLog(2);
        



    }
}
