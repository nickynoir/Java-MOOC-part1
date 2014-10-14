
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int start = 0;
        System.out.print("Up to what number: ");
        int upTo = Integer.parseInt(reader.nextLine());
        
        while (start < upTo) {
            System.out.println(start += 1);
        }
        
        
    }
}
