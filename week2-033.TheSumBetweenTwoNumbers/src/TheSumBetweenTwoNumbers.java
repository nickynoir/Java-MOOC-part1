
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int lastNum = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while  (firstNum <= lastNum) {
            sum = sum + firstNum;
            firstNum++;
        }
        System.out.print("The sum is " + sum);
        
    }
}
