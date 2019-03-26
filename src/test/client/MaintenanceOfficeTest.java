package test.client;

import main.client.maintenance.MaintenanceOffice;
import main.model.facility.Room;
import main.model.maintenance.MaintOff;
import main.model.maintenance.MaintenanceRequest;
import main.model.maintenance.MaintenanceStaff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaintenanceOfficeTest {
    Room room = new Room(1,"Double",2,1500,false);
    @Test
    public void addStaffTest() {
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(1,false,-1);
        int arraySize = maintenanceStaff.maintenanceStaffList.size();
        maintenanceStaff.addStaff(1,false,-1);
        assertEquals(arraySize, maintenanceStaff.maintenanceStaffList.size() - 1);
    }

    @Test
    public void findStaffTest(){
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(1,false,-1);
        maintenanceStaff.addStaff(1,false,-1);
        maintenanceStaff.addStaff(2,true,57);
        MaintenanceStaff ms = new MaintenanceStaff(1,false,-1);
        assertEquals(maintenanceStaff.findMaintStaffById(1).id,ms.id);
    }

    @Test
    public void assignMaintStaffTest(){
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(1,true,-1);
        MaintenanceRequest maintenanceRequest = new MaintenanceRequest("2/20/19",false,"Test",500,
                10,-1,room);
        maintenanceStaff.assignMaintStaff(maintenanceRequest,maintenanceStaff);
        Assert.assertEquals(maintenanceRequest.assignedId,maintenanceStaff.id);
        Assert.assertEquals(maintenanceStaff.currentTask,maintenanceRequest.id);
    }

    @Test
    public void addRequestTest(){
        MaintOff maintOff = new MaintOff();
        int arraySize = maintOff.requestLog.size();
        maintOff.addRequest("2/20/19",false,"test",500,1,-1,room);
        assertEquals(arraySize, maintOff.requestLog.size() - 1);
    }

    @Test
    public void getSpecificLogTest(){
        MaintOff maintOff = new MaintOff();
        maintOff.addRequest("2/20/19",false,"Teser",100,25,57,room);
        maintOff.addRequest("2/20/19",false,"test",500,1,-1,room);
        MaintenanceRequest requestFromLog = maintOff.requestLog.get(0);
        MaintenanceRequest requestFromId =maintOff.getSpecificLog(25);
        assertEquals(requestFromId, requestFromLog);
        requestFromLog = maintOff.requestLog.get(1);
        requestFromId =maintOff.getSpecificLog(1);
        assertEquals(requestFromId, requestFromLog);
    }

    @Test
    public void getNumberOfRequestsTest(){
        MaintOff maintOff = new MaintOff();
        maintOff.addRequest("2/20/19",false,"Teser",100,27,57,room);
        maintOff.addRequest("2/20/19",false,"test",500,1,-1,room);
        int requests = maintOff.getNumberOfRequests();
        assertEquals(requests,maintOff.requestLog.size());
    }

    @Test
    public void getRequestsInProgressTest(){
        MaintOff maintOff = new MaintOff();
        maintOff.addRequest("2/20/19",true,"Teser",101,27,57,room);
        maintOff.addRequest("2/20/19",false,"test",500,1,-1,room);
        maintOff.addRequest("2/20/19",true,"test",500,55,101,room);
        int requests = maintOff.getNumberRequestsInProgress();
        assertEquals(requests,2);
    }
}