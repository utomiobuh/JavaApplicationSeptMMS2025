import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] num = new int[10];

        // collect 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }

        // sum of 1st, 5th and 10th numbers
        int sum1 = num[0] + num[4] + num[9];

        // sum of 3rd, 8th and 2nd numbers
        int sum2 = num[2] + num[7] + num[1];

        // multiply both sums
        int multiply = sum1 * sum2;

        // sum of 4th, 7th, 6th and 9th numbers
        int sum3 = num[3] + num[6] + num[5] + num[8];

        // subtract result
        int finalResult = sum3 - multiply;

        System.out.println("Final Result = " + finalResult);

        // check condition
        if (finalResult >= 100) {
            System.out.println("Hurray I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }
    }
}