import java.util.Scanner;

public class RoundToInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a double value to round (enter -999 to quit):");
        double number = input.nextDouble();
        
        while (number != -999) {
            double roundedNumber = Math.floor(number + 0.5);
            
            System.out.println("Original number: " + number);
            System.out.println("Rounded number: " + roundedNumber);
            
            System.out.println("\nEnter next double value (or -999 to quit):");
            number = input.nextDouble();
        }
        
        input.close();
    }
}