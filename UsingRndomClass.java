import java.util.Random;

public class UsingRndomClass{
	public static void main(String[] args){
		Random random = new Random();
		
		int generatedInt = random.nextInt();
		System.out.printf("The Generated naumber is %d%n",Math.abs(generatedInt));
		
		int rangeNumber =random.nextInt(100) + 1;
		System.out.printf("The number generated is %d%n",rangeNumber);
		
		boolean isJava = random.nextBoolean();
		System.out.printf("Do you Love JAVA? %b%n",isJava);
		
		double decimalNumber = random.nextDoulbe();
		System.out.printf("The float point value is %f%n",decimalNumber);
	}
}