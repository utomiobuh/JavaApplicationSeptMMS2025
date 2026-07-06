import java.util.Scanner;
public class Classwork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, product = 1;
        (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
            product *= num;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / 5.0);
        System.out.println("Product: " + product);
    }
};