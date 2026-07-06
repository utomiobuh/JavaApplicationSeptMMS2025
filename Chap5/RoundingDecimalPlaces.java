import java.util.Scanner;

public class RoundingDecimalPlaces {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a double value to round (enter -999 to quit):");
        double number = input.nextDouble();
        
        while (number != -999) {
            System.out.println("Original value: " + number);
            System.out.println("Rounded to nearest integer: " + roundToInteger(number));
            System.out.println("Rounded to nearest tenth: " + roundToTenths(number));
            System.out.println("Rounded to nearest hundredth: " + roundToHundredths(number));
            System.out.println("Rounded to nearest thousandth: " + roundToThousandths(number));
            
            System.out.println("\nEnter next double value (or -999 to quit):");
            number = input.nextDouble();
        }
        
        input.close();
    }

    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}