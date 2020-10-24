package day04variables;
import java.util.Scanner;
public class IfElse03 {
	public static void main(String[] args) {
		
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Please Enter a character ");
		
		 
		 char letter=scan.next().charAt(0);
		 if (( letter>='A' && letter <='Z' )|| (letter>='a' && letter <='z'))
			 System.out.println("It is in the alphabet");
		 
		 else 
	
			 System.out.println("Not in the alphabet");
		 }
	}
		
		
	

