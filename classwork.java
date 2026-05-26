import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (1-7) for the day of the week: ");
        
        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();
            
            String dayName = switch (dayNumber) {
                case 1 -> "Sunday";
                case 2 -> "Monday";
                case 3 -> "Tuesday";
                case 4 -> "Wednesday";
                case 5 -> "Thursday";
                case 6 -> "Friday";
                case 7 -> "Saturday";
                default -> "Invalid day! Please enter a number between 1 and 7.";
            };
            
            System.out.println(dayName);
        } else {
            System.out.println("Error: That's not a valid number.");
        }
        
        
    }
}