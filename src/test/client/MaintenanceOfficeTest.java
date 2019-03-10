package test.client;

import main.client.maintenance.MaintenanceOffice;
import main.model.maintenance.MaintenanceRequest;
import main.model.maintenance.MaintenanceStaff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaintenanceOfficeTest {

    @Test
    public void addStaffTest() {
        MaintenanceOffice maintenanceOffice = new MaintenanceOffice();
        int arraySize = maintenanceOffice.staffList.size();
        maintenanceOffice.addStaff(1,false,-1);
        assertEquals(arraySize, maintenanceOffice.staffList.size() - 1);
    }

    @Test
    public void findStaffTest(){
        MaintenanceOffice maintenanceOffice = new MaintenanceOffice();
        maintenanceOffice.addStaff(1,false,-1);
        maintenanceOffice.addStaff(2,true,57);
        MaintenanceStaff ms = new MaintenanceStaff(1,false,-1);
        assertEquals(maintenanceOffice.findMaintStaffById(1).id,ms.id);
    }

    @Test
    public void assignMaintStaffTest(){
        MaintenanceOffice maintenanceOffice = new MaintenanceOffice();
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(1,true,-1);
        MaintenanceRequest maintenanceRequest = new MaintenanceRequest("2/20/19",false,"Test",500,10,-1);
        maintenanceOffice.assignMaintStaff(maintenanceRequest,maintenanceStaff);
        Assert.assertEquals(maintenanceRequest.assignedId,maintenanceStaff.id);
        Assert.assertEquals(maintenanceStaff.currentTask,maintenanceRequest.id);
    }

    @Test
    public void addRequestTest(){
        MaintenanceOffice maintenanceOffice = new MaintenanceOffice();
        int arraySize = maintenanceOffice.requestLog.size();
        maintenanceOffice.addRequest("2/20/19",false,"test",500,1,-1);
        assertEquals(arraySize, maintenanceOffice.requestLog.size() - 1);
    }

    @Test
    public void getSpecificLogTest(){
        MaintenanceOffice maintenanceOffice = new MaintenanceOffice();
        maintenanceOffice.addRequest("2/20/19",false,"Teser",100,25,57);
        maintenanceOffice.addRequest("2/20/19",false,"test",500,1,-1);
        MaintenanceRequest requestFromLog = maintenanceOffice.requestLog.get(0);
        MaintenanceRequest requestFromId =maintenanceOffice.getSpecificLog(25);
        Assert.assertEquals(requestFromId, requestFromLog);
        requestFromLog = maintenanceOffice.requestLog.get(1);
        requestFromId =maintenanceOffice.getSpecificLog(1);
        Assert.assertEquals(requestFromId, requestFromLog);
    }

    @Test
    public void getNumberOfRequestsTest(){
        MaintenanceOffice maintenanceOffice = new MaintenanceOffice();
        maintenanceOffice.addRequest("2/20/19",false,"Teser",100,27,57);
        maintenanceOffice.addRequest("2/20/19",false,"test",500,1,-1);
        int requests = maintenanceOffice.getNumberOfRequests();
        assertEquals(requests,maintenanceOffice.requestLog.size());
    }

    @Test
    public void getRequestsInProgressTest(){
        MaintenanceOffice maintenanceOffice = new MaintenanceOffice();
        maintenanceOffice.addRequest("2/20/19",true,"Teser",101,27,57);
        maintenanceOffice.addRequest("2/20/19",false,"test",500,1,-1);
        maintenanceOffice.addRequest("2/20/19",true,"test",500,55,101);
        int requests = maintenanceOffice.getNumberRequestsInProgress();
        assertEquals(requests,2);
    }
}