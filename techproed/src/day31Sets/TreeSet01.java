package day31Sets;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime startTime= LocalTime.now();
		System.out.println(startTime);
		TreeSet<String> lh1= new TreeSet<>();
		
		lh1.add("Fatma");
			lh1.add("Osman");
			lh1.add("Vildan");
			lh1.add("Burhan");
			System.out.println(lh1);
		//	lh1.add(null);
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
		h1.add(null);
		LocalTime endTime1= LocalTime.now();
		System.out.println(endTime1);

	}

}
