public class Main {

    public static void main(String[] args) {
        MaintenanceOffice MaintOff = new MaintenanceOffice();
        MaintOff.addRequest("2/20/19",false,"This is a test",500);
        MaintOff.getAllLogs();
        MaintOff.getNumberOfRequests();


    }
}
