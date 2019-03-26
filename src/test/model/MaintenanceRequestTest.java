package test.model;

import main.model.facility.Room;
import main.model.maintenance.MaintenanceRequest;
import org.junit.Assert;
import org.junit.Test;

public class MaintenanceRequestTest {
    Room room = new Room(1,"Double",2,1500,false);

    @Test
    public void toStringTest(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        Assert.assertEquals(mr.toString(),"Date:2/20/19 InProgress:true Notes:test EstimateCost:500 ID:1 assignedId: -1");
    }

    @Test
    public void setDateTest(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        String date = "2/20/21";
        mr.setDate(date);
        Assert.assertEquals(date,mr.date);
    }

    @Test
    public void setInProgessTest(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        boolean inProgress = false;
        mr.setInProgress(inProgress);
        Assert.assertEquals(inProgress,mr.inProgress);
    }

    @Test
    public void setNotesTest(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        String notes = "Not a test";
        mr.setNotes(notes);
        Assert.assertEquals(notes,mr.notes);
    }
    @Test
    public void setEstimateCost(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        int estimateCost = 100;
        mr.setEstimateCost(estimateCost);
        Assert.assertEquals(estimateCost,mr.estimateCost);
    }

    @Test
    public void setAssignedId(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        int assignedId = 15;
        mr.setAssignedId(assignedId);
        Assert.assertEquals(assignedId,mr.assignedId);
    }

    @Test
    public void getDate(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        String date = mr.getDate();
        Assert.assertEquals(date,mr.date);
    }

    @Test
    public void getNotes(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        String notes = mr.getNotes();
        Assert.assertEquals(notes,mr.notes);
    }

    @Test
    public void getEstimateCost(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        int cost = mr.getEstimateCost();
        Assert.assertEquals(cost,mr.estimateCost);
    }

    @Test
    public void isInProgress(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        boolean inProgess = mr.isInProgress();
        Assert.assertEquals(inProgess,mr.inProgress);
    }

    @Test
    public void getId(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        int id = mr.getId();
        Assert.assertEquals(id,mr.id);
    }

    @Test
    public void getAssignedId(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,
                1,-1,room);
        int assignedId = mr.getAssignedId();
        Assert.assertEquals(assignedId,mr.assignedId);
    }
}
