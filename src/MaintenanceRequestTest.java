import org.junit.Test;
import static org.junit.Assert.*;

public class MaintenanceRequestTest {
    @Test
    public void toStringTest(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        assertEquals(mr.toString(),"Date:2/20/19 InProgress:true Notes:test EstimateCost:500 ID:1 assignedId: -1");
    }

    @Test
    public void setDateTest(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        String date = "2/20/21";
        mr.setDate(date);
        assertEquals(date,mr.date);
    }

    @Test
    public void setInProgessTest(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        boolean inProgress = false;
        mr.setInProgress(inProgress);
        assertEquals(inProgress,mr.inProgress);
    }

    @Test
    public void setNotesTest(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        String notes = "Not a test";
        mr.setNotes(notes);
        assertEquals(notes,mr.notes);
    }
    @Test
    public void setEstimateCost(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        int estimateCost = 100;
        mr.setEstimateCost(estimateCost);
        assertEquals(estimateCost,mr.estimateCost);
    }

    @Test
    public void setAssignedId(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        int assignedId = 15;
        mr.setAssignedId(assignedId);
        assertEquals(assignedId,mr.assignedId);
    }

    @Test
    public void getDate(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        String date = mr.getDate();
        assertEquals(date,mr.date);
    }

    @Test
    public void getNotes(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        String notes = mr.getNotes();
        assertEquals(notes,mr.notes);
    }

    @Test
    public void getEstimateCost(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        int cost = mr.getEstimateCost();
        assertEquals(cost,mr.estimateCost);
    }

    @Test
    public void isInProgress(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        boolean inProgess = mr.isInProgress();
        assertEquals(inProgess,mr.inProgress);
    }

    @Test
    public void getId(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        int id = mr.getId();
        assertEquals(id,mr.id);
    }

    @Test
    public void getAssignedId(){
        MaintenanceRequest mr = new MaintenanceRequest("2/20/19",true,"test",500,1,-1);
        int assignedId = mr.getAssignedId();
        assertEquals(assignedId,mr.assignedId);
    }
}
