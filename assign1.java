import java.util.Scanner;
public class Classwork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        (num % 2 == 0) System.out.println("Even");
        (num % 2 != 0) System.out.println("Odd");
    }
}