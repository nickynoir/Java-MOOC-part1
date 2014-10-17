import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        int times = 1;
        
        while (times <= num) {
            factorial *= times;
            times++;
        }
        System.out.print("Factorial is " + factorial);
        
    }
}
