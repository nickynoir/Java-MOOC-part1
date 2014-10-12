
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String firstUser = reader.nextLine();
        System.out.println("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String secondUser = reader.nextLine();
        System.out.println("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        
        System.out.println(firstUser + " and " + secondUser + " are " + (firstAge 
                + secondAge) + " years old in total.");
   
    }
}
