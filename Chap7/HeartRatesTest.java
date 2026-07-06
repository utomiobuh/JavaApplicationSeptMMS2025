import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Target-Heart-Rate Calculator (From Chapter 7.docx)\n"); //[cite: 1]

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year (e.g., 1998): ");
        int year = input.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("\n--- HEART RATE REPORT ---");
        System.out.printf("Name: %s %s\n", person.getFirstName(), person.getLastName());
        System.out.printf("Date of Birth: %02d/%02d/%d\n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
        System.out.printf("Age: %d years old\n", person.getAgeInYears());
        System.out.printf("Maximum Heart Rate: %d bpm\n", person.getMaxHeartRate());
        System.out.printf("Target Heart Rate Range: %s\n", person.getTargetHeartRateRange());
        System.out.println("-------------------------");
    }
}