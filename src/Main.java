import junit.framework.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {

    public static void main(String[] args) {
        //Create floor with rooms
        Floor floor = new Floor(1,2,false,false);
        floor.addRoomToFloor(10,"studio",1,750.00,false);
        floor.addRoomToFloor(11,"double",2,1250.00,false);
        floor.addRoomToFloor(12,"double",2,1250.00,false);
        Floor floor1 = new Floor(2,2,false,false);


        //Create Building with floors
        Building building = new Building("TestBuilding",4,0,"Tester");
        building.addFloorToBuilding(floor);
        building.addFloorToBuilding(floor1);

        UserRegistry  UserReg = new UserRegistry();
        //create falcity users
        UserReg.addUser(1,1,"64023213123123","zeus@gmail.com", "Zeus");;
        UserReg.addUser(2,2,"64023213123323","hades@gmail.com", "Hades");
        UserReg.addUser(3,3,"64023213123223","posedion@gmail.com", "Posedion");
        MaintenanceOffice MaintOff = new MaintenanceOffice();

        //create maintenance requests
        MaintOff.addRequest("2/20/19",false,"This is a test",500, 1,-1);
        MaintOff.addRequest("2/20/19",false,"test",500, 2,-1);

        //check gets
        MaintOff.getAllLogs();
        MaintOff.getNumberOfRequests();
        MaintOff.getNumberRequestsInProgress();
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
