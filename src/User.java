public class User {
    String id;
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
    }

}
