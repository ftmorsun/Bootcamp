package day04variables;
import java.util.Scanner;
public class ifElse06 {
	public static void main(String[] args) {
		
		 
		Scanner scan =new Scanner(System.in);
		
		// ask user for count  
		System.out.println("Please Enter the quantity ");
		int count=scan.nextInt();
		
		//ask user for the price of item
		System.out.println("Please Enter unit price ");
		double price=scan.nextDouble();
			
		if ( count>1000)
			System.out.println("You earned 10% discount $"+ count*price*0.9 );
		else 
			System.out.println("No discount is applied $"+ count*price);
		
		scan.close();
		}
	

}