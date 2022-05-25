
import classes.User;
import enums.Status;

public class Main {
    public static void main(String[] args) {

        User user = new User(12, "String", Status.OFFLINE);
        user.setStatus(Status.ONLINE);


        System.out.println(user.getStatus().getValue());
        System.out.println(user.getStatus().getName());
        
        for (Status status : Status.values()) {
            System.out.println(status);
        }
        
    }
}
