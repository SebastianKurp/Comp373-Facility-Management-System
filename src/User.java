public class User {
    int id;
    int room;
    // String userNotes[];
    String phoneNumber;
    String email;
    String name;

    public User(int id, int room, String phoneNumber, String email, String name) {
        this.id = id;
        this.room = room;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;

        System.out.println(String.format("%s, with %d, added to registry", name, id) );
    }

    public void setUserRoom(int room){
        this.room = room;

        System.out.println("Room changed to %room");
    }
}
