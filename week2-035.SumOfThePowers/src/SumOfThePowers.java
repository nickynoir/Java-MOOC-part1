
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int expo = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = 0;
        int result = 0;
        
        while (i <= expo) {
            result = (int)Math.pow(2, i);
            //expo++;
            i++;
            sum += result;
        }
        System.out.print("The result is " + sum);

    }
}
