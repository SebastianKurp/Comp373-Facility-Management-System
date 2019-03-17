import main.model.facility.*;
import main.model.maintenance.MaintOff;
import main.model.maintenance.MaintenanceStaff;
import main.model.maintenance.MaintenanceRequest;
import main.model.user.User;
import main.model.user.UserRegistry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
        //swap to frontdeskoffice, adminoffice, maintenanceoffice, etc.
        //Create floorInterface with rooms
        Floor floor = new Floor(1,2,false,false);
        floor.addRoomToFloor(10,"studio",1,750.00,true);
        floor.addRoomToFloor(11,"double",2,1250.00,false);
        floor.addRoomToFloor(12,"double",2,1250.00,false);
        floor.addRoomToFloor(55,"double",2,1250,true);
        Floor floor1 = new Floor(2,2,false,false);


        //Create main.client.facility.Building with floors
        Building building = new Building("TestBuilding",4,0,"Tester");
        building.addFloorToBuilding(floor);
        building.addFloorToBuilding(floor1);

        UserRegistry UserReg = new UserRegistry();
        //create falcity users
        Room room = new Room(1,"Double",2,1500,false);
        Room room2 = new Room(21,"Single",1,750,false);

        UserReg.addUser(1,room,"64023213123123","zeus@gmail.com", "Zeus");;
        UserReg.addUser(2,room,"64023213123323","hades@gmail.com", "Hades");
        UserReg.addUser(3,room2,"64023213123223","posedion@gmail.com", "Posedion");

        //create requests
        MaintOff maintOff = new MaintOff();
        maintOff.addRequest("2/20/19",false,"This is a test",500, 1,-1);
        maintOff.addRequest("2/20/19",false,"test",500, 2,-1);

        //check gets
        
        maintOff.getAllLogs();
        maintOff.getNumberOfRequests();
        maintOff.getNumberRequestsInProgress();
        MaintenanceRequest request = maintOff.getSpecificLog(1);
        maintOff.getSpecificLog(2);

        //add staff
        maintOff.addStaff(1,true,-1);
        MaintenanceStaff staff = maintOff.findMaintStaffById(1);

        //check assigning staff
        maintOff.assignMaintStaff(request,staff);
        System.out.println(String.format("Staff id %d assigned to request %d",request.assignedId,request.id));
        maintOff.getSpecificLog(1);
        maintOff.getSpecificLog(2);

        //check users
        User user = new User(1,null,"99999999999","fake@gmail.com","John Doe");
        Room vacantRoom = floor.getVacantRoom();
        user.setUserRoom(vacantRoom);
        System.out.println(String.format("User %s assigned to room %d",user.name,user.room.roomNumber));

        //check mail
        MailRoom mailRoom = new MailRoom();
        Mail mail = new Mail(1,"package","2/20/19",user);
        mailRoom.addMail(mail);
        mailRoom.printAllMail();
    }
}
