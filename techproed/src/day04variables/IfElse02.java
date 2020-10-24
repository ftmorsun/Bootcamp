package day04variables;
import java.util.Scanner;
public class IfElse02 {
	public static void main(String[] args) {
		
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Age: ");
		 int age=scan.nextInt();
		 if ( age<0)
			 System.out.println("Please enter a valid number");
		 if (age>=18 && age<=65) {
			 System.out.println("Wou should work");
		 }else {
			 System.out.println("No need to work");
		 }
		 scan.close();
		}
	

}
