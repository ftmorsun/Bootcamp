package day21encaptulation;

public class SimpleCalculator {
	
	
	
	public static void add(double... v )
	{
		double sum=0;
		for (double w : v)
			sum=sum+w;
		System.out.println("The sum is "+ sum);
		
	}
	public static  void multiply(double... v )
	{
		double product=1;
		for (double w : v)
			product=product+w;
		System.out.println("The product is "+ product);
		
	}
	public static  void multiply(double a, double b)
	{
		if (b!=0)
			System.out.println("The division is "+ a/b);
		else
			System.out.println("Divison by zero error");
		
	}
	public static void substract(double a, double b )
	{

		System.out.println("The result is "+ (a-b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
