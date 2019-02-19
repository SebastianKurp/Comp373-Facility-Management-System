
import java.util.UUID;

public class User {
    String id;
    int room;
    String userNotes[];
    String phoneNumber;
    String email;
    String name;

    public String createUserId( String id ){
        UUID uuid=UUID.randomUUID();
        String str=uuid.toString().replace("-", "");
        return id = str;
    }
}
