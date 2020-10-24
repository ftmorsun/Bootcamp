package day04variables;
import java.util.Scanner;
public class Conditional {
	public static void main(String[] args) {
		
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Enter number");
		 int num=scan.nextInt();
		 if (num % 2 == 0) {
			 System.out.println("number is even");
		 } else {
			 System.out.println("number is odd");
		 }
		 scan.close();
}
}