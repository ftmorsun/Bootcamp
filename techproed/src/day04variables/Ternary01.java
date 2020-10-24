package day04variables;

import java.util.Scanner;

public class Ternary01 {
	public static void main(String[] args)
	{
	Scanner scan =new Scanner(System.in);
	
	// ask user for count  
	System.out.println("Please Enter the quantity ");
	int count=scan.nextInt();
	String result=count%2==0?"Even":"Odd";
	System.out.println(result);
scan.close();
}
}