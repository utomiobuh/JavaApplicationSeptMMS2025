public class TypeCasting{
	public static void main(String[] args){
		int num1 = 50;
		int num2 = 200;
		
		double division = (double)num1/num2;
		System.out.printf("The Division is %f%n",division);
		
		
		double price = 7658;
		System.out.printf("The price of Laptop %f%n",price);
		
		
		double balance = 5693.875;
		int convertedbalance =(int)balance;
		System.out.printf("The converted balance in %d%n",convertedbalance);
		
		char Symbol = '?';
		int convertedSymbol = (int)Symbol;
		System.out.printf("Converted symbol is %d%n",convertedSymbol);
	}
}