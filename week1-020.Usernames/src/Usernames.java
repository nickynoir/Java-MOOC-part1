
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String user1 = "alex";
        String pass1 = "mightyducks";
        String user2 = "emily";
        String pass2 = "cat";
        
        System.out.println("Type your username: ");
        String userCheck = reader.nextLine();
        System.out.println("Type your password: ");
        String passCheck = reader.nextLine();
        
        if (userCheck.equals(user1) && passCheck.equals(pass1)) {
            System.out.println("You are now logged into the system!");
        } else if (userCheck.equals(user2) && passCheck.equals(pass2)) {
            System.out.println("You are now logged into the system!");
        }else {
            System.out.println("Your username or password was invalid!");
        }
            
    }
}
