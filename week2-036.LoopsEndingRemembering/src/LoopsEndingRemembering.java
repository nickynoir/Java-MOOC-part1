import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num = 0;
        int sum = 0;
        int totNum = 0;
        double avg = 0;
        int numEven = 0;
        int numOdd = 0;
        
        while (num != (-1)) {
            num = Integer.parseInt(reader.nextLine()); //Reads in user input
            if (num != -1) {
                if (num % 2 == 0) {
                    numEven++;
                } else {
                    numOdd++;
                }
                sum += num; //Adds digits exluding -1
                totNum++; //Counts the total number of digits 
                            //given by user excluding -1
                avg = sum * 1.0 / totNum; //calculate the average
            }          
        }
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + totNum);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + numEven);
        System.out.println("Odd numbers: " + numOdd);
    }
}
