public class UserProfile {
    Auth auth = Auth.getInstance();
    String user = auth.getUsername();
    System.out.println(user);
}
