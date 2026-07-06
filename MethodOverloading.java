import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=====Calculate Perimeter of Shapes=====");
        System.out.println("Enter 1. for Square");
        System.out.println("Enter 2. for Rectangle");
        System.out.println("Enter 3. for Triangle");
        System.out.println("Enter 4. to Exit program");
        System.out.println("=======================================\n");
        
        System.out.print("Enter Your Choice: ");
        int choice = scan.nextInt(); // Fixed: lowercase 'n' in nextInt()
        
        switch(choice) {
            case 1:
                System.out.print("Enter the Length of the Square: ");
                int lenOfSquare = scan.nextInt();
                perimeter(lenOfSquare);
                break;
            
            case 2:
                System.out.print("Enter the Length of the Rectangle: ");
                int lenOfRect = scan.nextInt();
                
                System.out.print("Enter the width of the Rectangle: ");
                int widthOfRect = scan.nextInt();
                
                perimeter(lenOfRect, widthOfRect);
                break;

            case 3:
                System.out.print("Enter sideA: ");
                int sideA = scan.nextInt();
                
                System.out.print("Enter sideB: ");
                int sideB = scan.nextInt();
                
                System.out.print("Enter sideC: ");
                int sideC = scan.nextInt();
                
                perimeter(sideA, sideB, sideC);
                break;
                
            default:
                System.out.println("=====Program Exited, Good Bye====="); // Fixed: println
        }
        
        scan.close(); // Good practice to close the scanner
    }
        
    // Method 1: Square
    public static void perimeter(int lenOfSquare) {
        int perimeterOfSquare = 4 * lenOfSquare; // Fixed: CamelCase consistency
        System.out.printf("The Perimeter of the square is %d%n", perimeterOfSquare);
    }
    
    // Method 2: Rectangle
    public static void perimeter(int lenOfRect, int widthOfRect) { // Fixed: parameter name to match usage
        int perimeterOfRect = 2 * (lenOfRect + widthOfRect);
        System.out.printf("The Perimeter of the Rectangle is %d%n", perimeterOfRect); // Fixed: printing the right variable
    }
    
    // Method 3: Triangle
    public static void perimeter(int sideA, int sideB, int sideC) {
        int perimeterOfTriangle = sideA + sideB + sideC;
        System.out.printf("The Perimeter of the Triangle is %d%n", perimeterOfTriangle);
    }
}