package test.model;

import main.model.maintenance.MaintenanceStaff;
import org.junit.Assert;
import org.junit.Test;


public class MaintenanceStaffTest {
    @Test
    public void setCurrentTaskTest(){
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(1,true,-1);
        int task = 100;
        maintenanceStaff.setCurrentTask(task);
        Assert.assertEquals(task,maintenanceStaff.currentTask);
    }

    @Test
    public void removeCurrentTaskTest(){
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(1,true,100);
        maintenanceStaff.removeCurrentTask();
        Assert.assertEquals(maintenanceStaff.currentTask, -1);
    }

    @Test
    public void changeOnDutyTest(){
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(1,true,100);
        maintenanceStaff.changeOnDuty();
        Assert.assertEquals(maintenanceStaff.onDuty,false);
        maintenanceStaff.changeOnDuty();
        Assert.assertEquals(maintenanceStaff.onDuty,true);
    }
}
