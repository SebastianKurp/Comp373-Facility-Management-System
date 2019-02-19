public class Main {

    public static void main(String[] args) {
        MaintenanceOffice MaintOff = new MaintenanceOffice();
        MaintenanceStaff MaintStaff = new MaintenanceStaff();
        MaintStaff.onDuty = true;
        MaintStaff.currentTask = MaintStaff.addMaintRequest();
        System.out.println(MaintStaff.currentTask);
    }
}
