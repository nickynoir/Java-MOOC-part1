public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int white = 0;
        while (white < amount) {
            System.out.print(" ");
            white++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int tri = 1;
        int space = size - 1;
        while (space >= 0) {
            printWhitespaces(space);
            //size--;
            printStars(tri);
            tri++;
            space--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int tree = 0;
        int length = 0;
        int space = height;
        while (length <= height && height > 3) {
            printWhitespaces(space);
            printStars(tree);
            length++;
            tree+=2;
            space--;    
        }
        int stand = 2;
        int i = 0;
        int b = height-=1;
        while (i < stand) {
            printWhitespaces(b);
            printStars(2);
            i++;
            
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        //printWhitespaces(4);
       // System.out.println("..");
        printTriangle(4);
        System.out.println("---");
        printTriangle(2);
        System.out.println("---");
        printTriangle(10);
        System.out.println("---");
       // xmasTree(10);
       // System.out.println("---");
        //xmasTree(10);
    }
}
