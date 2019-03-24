import main.model.facility.*;
import main.model.maintenance.MaintOff;
import main.model.maintenance.MaintenanceStaff;
import main.model.maintenance.MaintenanceRequest;
import main.model.user.User;
import main.model.user.UserRegistry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

    public static void main(String[] args) {
        //Create floorInterface with rooms
        Floor floor = (Floor) context.getBean("floor");
        floor.setFloorNumber(1);
        floor.setNumberOfRooms(2);
        floor.setVacant(false);
        floor.setInRepair(false);
        floor.addRoomToFloor(10,"studio",1,750.00,true);
        floor.addRoomToFloor(11,"double",2,1250.00,false);
        floor.addRoomToFloor(12,"double",2,1250.00,false);
        floor.addRoomToFloor(55,"double",2,1250,true);
        Floor floor1 = (Floor) context.getBean("floor");
        floor1.setFloorNumber(2);
        floor1.setNumberOfRooms(2);
        floor1.setVacant(false);
        floor1.setInRepair(false);


        //Create main.client.facility.Building with floors
        //Building building = new Building("TestBuilding",4,0,"Tester");
        Building building = (Building) context.getBean("building");
        building.setName("TestBuilding");
        building.setNumberOfRooms(4);
        building.setNumberOfVacantRooms(0);
        building.setBuildingNotes("Tester");
        building.addFloorToBuilding(floor);
        building.addFloorToBuilding(floor1);

        UserRegistry UserReg = new UserRegistry();
        //create falcity users

        //Room room = new Room(1,"Double",2,1500,false);
        //Room room2 = new Room(21,"Single",1,750,false);
        Room room = (Room) context.getBean("room");
        room.setRoomNumber(1);
        room.setType("Double");
        room.setCapacity(2);
        room.setCost(1500);
        room.setVacant(false);

        Room room2 = (Room) context.getBean("room");
        room2.setRoomNumber(21);
        room2.setType("Single");
        room2.setCapacity(1);
        room2.setCost(750);
        room2.setVacant(false);
        UserReg.addUser(1,room,"64023213123123","zeus@gmail.com", "Zeus");;
        UserReg.addUser(2,room,"64023213123323","hades@gmail.com", "Hades");
        UserReg.addUser(3,room2,"64023213123223","posedion@gmail.com", "Posedion");

        //create requests
        MaintOff maintOff = (MaintOff) context.getBean("maintOff");
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
        MaintenanceStaff staff = (MaintenanceStaff) context.getBean("maintenanceStaff");
        staff.findMaintStaffById(1);

        //check assigning staff
        maintOff.assignMaintStaff(request,staff);
        System.out.println(String.format("Staff id %d assigned to request %d",request.assignedId,request.id));
        maintOff.getSpecificLog(1);
        maintOff.getSpecificLog(2);

        //check users
        //User user = new User(1,null,"99999999999","fake@gmail.com","John Doe");
        User user = (User) context.getBean("user");
        user.setUserId(1);
        user.setUserRoom(null);
        user.setUserPhonenumber("9999999999");
        user.setUserEmail("fake@gmail.com");
        user.setUserName("John Doe");

        Room vacantRoom = floor.getVacantRoom();
        user.setUserRoom(vacantRoom);
        System.out.println(String.format("User %s assigned to room %d",user.name,user.room.roomNumber));

        //check mail
        //MailRoom mailRoom = new MailRoom();
        MailRoom mailRoom = (MailRoom) context.getBean("mailRoom");
        Mail mail = new Mail(1,"package","2/20/19",user);
        mailRoom.addMail(mail);
        mailRoom.printAllMail();
    }
}
