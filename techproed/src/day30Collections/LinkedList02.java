package day30Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		LinkedList<String> l1= new LinkedList<>();
		l1.add("Fatma");
		l1.add("Osman");

		l1.add("Vildan");
		l1.add("Burhan");
		System.out.println("Enter name: ");
		Scanner input= new Scanner(System.in);
		String name=input.nextLine();
		if (l1.remove(name)==true)
		{
			System.out.println("Your name is removed");
			
		}
		else
		{
			System.out.println("Your name is not in the list");
		}
	}

}
