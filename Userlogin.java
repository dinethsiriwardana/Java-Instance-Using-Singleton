public class Userlogin {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your username: ");
    String username = scanner.nextLine();

    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    if (username.equals("admin") && password.equals("password")) {
        Auth auth = Auth.getInstance();
        auth.setUsername(username);
    }
}
