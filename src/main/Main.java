package main;

public class Main {

    public static void main(String[] args) {
        MaintenanceOffice MaintOff = new MaintenanceOffice();
        MaintOff.addRequest("2/20/19",false,"This is a test",500, 1,-1);
        MaintOff.addRequest("2/20/19",false,"test",500, 2,-1);

        MaintOff.getAllLogs();
        MaintOff.getNumberOfRequests();
        MaintOff.getRequestsInProgress();
        MaintOff.getSpecificLog(1);
        MaintOff.getSpecificLog(2);

        MaintOff.addStaff(1,true,-1);




    }
}
