package day31Sets;

import java.time.LocalTime;
import java.util.*;


public class LinkedHashSet1 {
	public static void main(String[] args)
	{
		LocalTime startTime= LocalTime.now();
		System.out.println(startTime);
		LinkedHashSet<String> lh1= new LinkedHashSet<>();
		 lh1.add("We");
		lh1.add("Fatma");
			lh1.add("Osman");
			lh1.add("Vildan");
			lh1.add("Burhan");
			System.out.println(lh1);
			LocalTime endTime= LocalTime.now();
			System.out.println(endTime);
		
		
		LocalTime startTime1= LocalTime.now();
		System.out.println(startTime1);
		HashSet<String> h1= new HashSet<>();
		h1.add("We");
		h1.add("Fatma");
		h1.add("Osman");
		h1.add("Vildan");
		h1.add("Burhan");
		System.out.println(lh1);
		LocalTime endTime1= LocalTime.now();
		System.out.println(endTime1);
			
		
		
	}

}
