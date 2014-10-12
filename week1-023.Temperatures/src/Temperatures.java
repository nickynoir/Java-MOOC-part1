
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        
        while (true){
        System.out.println("Type a floating point (e.g 3.4) number: ");
        double userNum = Double.parseDouble(reader.nextLine());
        
        //Graph.addNumber(userNum);
        if (userNum < -30.0) {
            System.out.println("Temperatures can not be less then -30.");
            System.out.println("");
            System.out.println("Type a floating point (e.g 3.4) number: ");
            userNum = Double.parseDouble(reader.nextLine());
            continue;
        } else if (userNum > 40.0) {
            System.out.println("Temperatures can not exceed 40 degrees.");
            System.out.println("");
            System.out.println("Type a floating point (e.g 3.4) number: ");
            userNum = Double.parseDouble(reader.nextLine());
            continue;
        }
            Graph.addNumber(userNum);
       
        
           // break;
       

        // Graph is used as follows:
       /* Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value); */
        // Remove or comment out these lines above before trying to run the tests.
    }
    }
}