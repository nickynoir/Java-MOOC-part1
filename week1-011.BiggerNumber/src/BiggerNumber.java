
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        System.out.println("Type in a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        int bigger = Math.max(num1, num2);
        
        System.out.println("The bigger number of the two numvers given was: " + bigger);
    }
}
