package day05Conditions;

import java.util.Scanner;

public class IfElse07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
        int year = scan.nextInt();
        
        if(year<=0) {
            System.out.println("Enter a Valid Year");
        }
        
        else if( year % 100 == 0 && year % 400 == 0  ) {
            System.out.println("It is a Leap Year");}
        
        else if( year % 100 != 0 && year % 4 == 0  ) {
                System.out.println("It is a Leap Year");
        } else {
            System.out.println("It is not a Leap Year");
        }

	}

}
