package day30Collections;

import java.util.LinkedList;

public class LinkedList01 {
	public static void main(String[] args)
	{
	LinkedList<String> l1= new LinkedList<>();
	l1.add("Fatma");
	l1.add("Osman");

	l1.add("Vildan");
	l1.add("Burhan");
	
	System.out.println(l1);
	LinkedList<String> l2= new LinkedList<>();
	l2.add("Orsun");
	l2.add("Alacatag");
	
	l1.addAll(2,l2);
	System.out.println(l1);
	
	l1.remove("Alacatag");
	
	System.out.println(l1);
	
	

}
}
