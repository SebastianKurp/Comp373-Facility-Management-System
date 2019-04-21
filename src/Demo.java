import main.model.facility.*;
import main.model.maintenance.MaintOff;
import main.model.maintenance.MaintenanceStaff;
import main.model.maintenance.MaintenanceRequest;
import main.model.staff.Staff;
import main.model.staff.StaffRegistry;
import main.model.user.User;
import main.model.user.UserRegistry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

    public static void main(String[] args) {
        //Create floorInterface with rooms
        Building building = (Building) context.getBean("building");

        Floor floor = (Floor) context.getBean("floor");
        floor.setBuilding(building);
        floor.addFloorToBuilding(floor);
        floor.setFloorNumber(1);
        floor.setNumberOfRooms(2);
        floor.setVacant(false);
        floor.setInRepair(false);

        Room room1 = (Room) context.getBean("room");
        room1.setFloor(floor);
        floor.addRoomToFloor(room1);
        room1.setFloor(floor);
        room1.setVacant(true);
        room1.setCost(750);
        room1.setCapacity(1);
        room1.setType("studio");
        room1.setRoomNumber(10);

        Floor floor1 = (Floor) context.getBean("floor");
        floor1.setFloorNumber(2);
        floor1.setNumberOfRooms(2);
        floor1.setVacant(true);
        floor1.setInRepair(false);
        floor1.setBuilding(building);
        floor1.addFloorToBuilding(floor1);

        //Create main.client.facility.Building with floors
        building.setName("TestBuilding");
        building.setNumberOfRooms(4);
        building.setNumberOfVacantRooms(0);
        building.setBuildingNotes("Tester");
        building.addFloorToBuilding(floor);
        building.addFloorToBuilding(floor1);

        //UserRegistry UserReg = new UserRegistry();
        //create falcity users

        Room room = (Room) context.getBean("room");
        room.setFloor(floor1);
        room.setRoomNumber(1);
        room.setType("Double");
        room.setCapacity(2);
        room.setCost(1500);
        room.setVacant(false);
        room.addRoomToFloor(room);

        Room room2 = (Room) context.getBean("room");
        room2.setFloor(floor1);
        room2.setRoomNumber(21);
        room2.setType("Single");
        room2.setCapacity(1);
        room2.setCost(750);
        room2.setVacant(true);
        room2.addRoomToFloor(room2);

        room.printRoom();
        room2.printRoom();

        //create requests
        MaintOff maintOff = (MaintOff) context.getBean("maintOff");
        MaintenanceRequest maintenanceRequest = (MaintenanceRequest) context.getBean("maintenanceRequest");
        maintenanceRequest.setMaintOff(maintOff);
        maintenanceRequest.setInProgress(false);
        maintenanceRequest.setId(1);
        maintenanceRequest.setRoom(room);
        maintenanceRequest.addRequest(maintenanceRequest);

        //check gets
        maintOff.getAllLogs();
        maintOff.getNumberOfRequests();
        maintOff.getNumberRequestsInProgress();
        MaintenanceRequest request = maintOff.getSpecificLog(1);
        maintOff.getSpecificLog(2);
        Room room5 = request.getRoom();
        room5.printRoom();

        //add staff
        MaintenanceStaff mstaff = (MaintenanceStaff) context.getBean("maintenanceStaff");
        mstaff.setMaintOff(maintOff);
        mstaff.addStaff(mstaff);
        mstaff.findMaintStaffById(1);

        //check assigning staff
        maintOff.assignMaintStaff(request,mstaff);
        System.out.println(String.format("Staff id %d assigned to request %d",request.assignedId,request.id));
        maintOff.getSpecificLog(1);
        maintOff.getSpecificLog(2);

        //check users
        UserRegistry userRegistry = (UserRegistry) context.getBean("userRegistry");
        User user = (User) context.getBean("user");
        user.setUserRegistry(userRegistry);
        user.setUserId(1);
        user.setUserRoom(room);
        user.setUserPhonenumber("9999999999");
        user.setUserEmail("fake@gmail.com");
        user.setUserName("John Doe");
        user.addUser(user);
        user.findUserByRoom(1);
        user.findUserByRoom(12);

        Room vacantRoom = floor.getVacantRoom();
        int roomNum = vacantRoom.roomNumber;
        System.out.println(roomNum);
        user.setUserRoom(vacantRoom);
        System.out.println(String.format("User %s assigned to room %d",user.name,user.room.roomNumber));

        //check mail dependent on mailRoom
        MailRoom mailRoom = (MailRoom) context.getBean("mailRoom");
        Mail mail = (Mail) context.getBean("mail");
        mail.setMailRoom(mailRoom);

        mail.setMailType("package");
        mail.setreciepient(user);
        mail.setRoomNumber(1);
        mail.setDateOfArrival("2/12/2020");
        mail.addMail(mail);
        mail.printAllMail();
        
        //Observer Pattern with test in staffTest
        StaffRegistry staffRegistry = (StaffRegistry) context.getBean("staffRegistry");//observable
        Staff staff = (Staff) context.getBean("staff");//observer
        staff.setStaffRegistry(staffRegistry);
        staff.setStaffId(1);
        staff.addStaff(staff);
        staffRegistry.addPropertyChangeListener(staff);
        System.out.println(staff.getStaffAnnouncement());
        staffRegistry.setStaffAnnouncement("Test Announcement");
        System.out.println(staff.getStaffAnnouncement());

    }
}
