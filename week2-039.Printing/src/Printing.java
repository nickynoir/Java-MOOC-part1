public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int i = 0;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int square = 0;
        while (square < sideSize) {
            printStars(sideSize);
            square++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int rect = 0;
        while (rect < height) {
            printStars(width);
            rect++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int tri = 0;
        while (tri <= size) {
            
            printStars(tri);
            tri++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        
        /*printStars(5);
        printStars(3);
        printStars(9);*/
        
        

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---"); 
    }

}
