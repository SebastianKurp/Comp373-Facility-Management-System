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
[![UML1](https://github.com/SebastianKurp/Comp373-Facility-Management-System/blob/master/UML1.PNG?raw=true "UML1")](https://github.com/SebastianKurp/Comp373-Facility-Management-System/blob/master/UML1.PNG?raw=true "UML1")

### Patterns 
Problem solved with observer pattern - Staff announcements created in the staff registry (observable) update each individual staff member's (observer) annoucment when the announcement is changed. This allows the system to change the announcement in one place and have the changes applied throughout each staff member. 
