public class MethodInJava{
	//Method here
	public static void main(String[] args){
	
		int sum = javaMethod.add(70,50,80);
		
		System.out.printf("The sum of all the numbers in %d%n",sum);
		
		sum = add(90,40,30);
		System.out.printf()
		
		details(21,"Kate Henry");
		
		details(21,"Stevie Wonder");
		
		details(21,"Kate Bush");

		
	}
	public static int add(int num1, int num2, int num3){
		
		int sum = num1 + num2 + num3;
		return sum;
	}
}
  public int add(int num1, int num2, int num3){
	  
	  int sum = num1 + num2 + num3;
	  return sum;
  }
  
  public static void details(int age , String name){
	 System.out.printf("Your Name is %d%n",name);
	 System.out.printf("You are %d years",age);
  }