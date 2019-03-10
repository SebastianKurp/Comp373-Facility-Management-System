import main.client.building.Building;
import main.client.building.FloorInterface;
import main.client.maintenance.MaintenanceOffice;
import main.model.maintenance.MaintenanceStaff;
import main.model.maintenance.MaintenanceRequest;

public class Demo {

    public static void main(String[] args) {
        //Create floorInterface with rooms
        FloorInterface floorInterface = new FloorInterface(1,2,false,false);
        floorInterface.addRoomToFloor(10,"studio",1,750.00,false);
        floorInterface.addRoomToFloor(11,"double",2,1250.00,false);
        floorInterface.addRoomToFloor(12,"double",2,1250.00,false);
        FloorInterface floorInterface1 = new FloorInterface(2,2,false,false);


        //Create main.client.building.Building with floors
        Building building = new Building("TestBuilding",4,0,"Tester");
        building.addFloorToBuilding(floorInterface);
        building.addFloorToBuilding(floorInterface1);

        UserRegistry  UserReg = new UserRegistry();
        //create falcity users
        UserReg.addUser(1,1,"64023213123123","zeus@gmail.com", "Zeus");;
        UserReg.addUser(2,2,"64023213123323","hades@gmail.com", "Hades");
        UserReg.addUser(3,3,"64023213123223","posedion@gmail.com", "Posedion");
        MaintenanceOffice MaintOff = new MaintenanceOffice();

        //create main.client.client.building.maintenance requests
        MaintOff.addRequest("2/20/19",false,"This is a test",500, 1,-1);
        MaintOff.addRequest("2/20/19",false,"test",500, 2,-1);

        //check gets
        MaintOff.getAllLogs();
        MaintOff.getNumberOfRequests();
        MaintOff.getNumberRequestsInProgress();
        MaintenanceRequest request = MaintOff.getSpecificLog(1);
        MaintOff.getSpecificLog(2);

        //add main.client.client.building.maintenance staff
        MaintOff.addStaff(1,true,-1);
        MaintenanceStaff staff = MaintOff.findMaintStaffById(1);

        //check assigning staff
        MaintOff.assignMaintStaff(request,staff);
        MaintOff.getSpecificLog(1);
        MaintOff.getSpecificLog(2);

    }
}