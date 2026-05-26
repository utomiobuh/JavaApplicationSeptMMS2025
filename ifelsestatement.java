import java.util.Scanner;

public class Ifelsestatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int score;
		String name;
		String subject;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter your Subject: ");
		subject = input.nextLine();
		
		System.out.print("Enter your Score: ");
		score = input.nextInt();
		
		if(score >= 70){
			System.out.printf("Full Name: %s%n",name);
			System.out.printf("subject: %s%n",subject);
			System.out.printf("score: %d%n",score);
			System.out.println("Grade: A");
		}
		else if (score >= 60){
			System.out.printf("Full Name: %s%n",name);
			System.out.printf("subject: %s%n",subject);
			System.out.printf("score: %d%n",score);
			System.out.println("Grade: B");
		}
		else if (score >= 50){
			System.out.printf("Full Name: %s%n",name);
			System.out.printf("subject: %s%n",subject);
			System.out.printf("score: %d%n",score);
			System.out.println("Grade: C");
		}
		else if(score >= 40){
			System.out.printf("Full Name: %s%n",name);
			System.out.printf("subject: %s%n",subject);
			System.out.printf("score: %d%n",score);
			System.out.println("Grade: D");
		
		}
		else if (score <= 30){
			System.out.printf("Full Name: %s%n",name);
			System.out.printf("subject: %s%n",subject);
			System.out.printf("score: %d%n",score);
			System.out.println("Grade: YOU MUMU O!!");
		}
		
	}
}