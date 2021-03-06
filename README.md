# Comp373-Facility-Management-System

## Team Members:

- [Paul Narup](https://github.com/paulNarup "Paul Narup")
- [Sebastian Kurpiel](http://github.com/SebastianKurp "Sebastian Kurpiel")

### Instructions To Run:

1. Clone the repo and import/open it in your Java IDE of choice(We used[ Intelli J](https://www.jetbrains.com/idea/ " Intelli J"))
2. To run with Intelli J, navigate throught the file tree and then click `Main.class`. This will run a small demo showcasing what the API can do. For more detail check out the [ UML](https://github.com/SebastianKurp/Comp373-Facility-Management-System/blob/master/UML1.PNG " UML") in the root of the repo.
3. If not using Intelli J or another IDE, _not recommended_, `cd` into the `src` directory. Run `javac Main.java` to complie the project and then run `java Main` to run the demo.
4. **To run all the test at once** right click the src in Intelli J and click `run all tests`

### UML Diagram

Can be found either in the PDF or for a better rendering using a tool that can read UML files(intelij has a great one)
[![UML2](https://github.com/SebastianKurp/Comp373-Facility-Management-System/blob/master/UML2.png?raw=true"UML1")](https://github.com/SebastianKurp/Comp373-Facility-Management-System/blob/master/UML2.png?raw=true "UML1")

### Patterns 
## Bridge:
###### Problem solved:
Having duplicate functions and an inability to reuse code if another building, floor, maintenanceOffice, or certain staff is added.

The Bridge Pattern is used through project through our interface and model approach. The interfaces act as simple ways to interact with the models and allow us to cut out the redundancy.  For example, within our `BuildingInterface` an admin to easily create add multiple floors or even create a new building.
```
BuildingOne = Building.addFloor(floorNumber), Building.addRoomToFloor(floorNumber, roomNumber, roomType,…etc);

```
Another interface is the `MaintenanceInterface` which allows admin or maintenance staff easy creation or request for informations to be handled with ease.
```
MaintenanceOffice.assignMainStaff(MaintenanceStaffMemberID, MaintenanceRequestId
```

To even make things easier we added a admin interface which allows interaction with the staff, building, user, and maintenance interfaces. Below is the hierarchy of the interface, as shown the admin interface acts as a bridge between both the building and maintenance interfaces. Allowing for easier creation of a building which means easier duplication and less redundacy when add more falicites or buildings to the system.
[![BridgePattern](https://github.com/SebastianKurp/Comp373-Facility-Management-System/blob/master/bridge.png?raw=true)](Fhttps://github.com/SebastianKurp/Comp373-Facility-Management-System/blob/master/bridge.png?raw=true)

## Observer:
###### Problem Solved:
Staff announcements created in the staff registry (observable) update each individual staff member's (observer) announcement when the announcement is changed. This allows the system to change the announcement in one place and have the changes applied throughout each staff member.

## Facade:
###### Problem solved:
The issue of having to interact with multiple interfaces to add buildings, check users, and check maintenance.
We solved this issue by creating interfaces throughout project which allows the operator to interact with concepts instead of individual objects.
An example of this is in `BuildingInterface`, it allows the operator to interact with the entire facility instead of each individual model. 
This allows the operator to add floors, edit rooms, change building, etc... within one interface, instead having to go through different interfaces.
In addition we created a `BuildingAdminInterface`,which allows an admin user to access multiple concepts throughout the project without having to navigate through the various interfaces.
For example the operator can create a new room/floor, check which User belongs to a room, access maintenance records, and see what mail is in the mail room.
This allows an admin user to easily obtain information while still living the previous interfaces intact for other staff members to use.
