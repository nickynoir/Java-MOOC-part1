
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type in the radius: ");
        double radius = Integer.parseInt(reader.nextLine());
        
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("Circumferencd of the circle: " + circumference);
    }
}
