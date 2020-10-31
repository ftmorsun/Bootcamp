package day31Sets;

import java.util.*;

public class Set01 {
	public static void main(String[] args)
	{
		HashSet<String> h1 = new HashSet<>();
		HashSet<String> h2 = new HashSet<>();
	    h2.add("We");
		h1.add("Fatma");
		h1.add("Osman");
		h1.add("Vildan");
		h1.add("Burhan");
		System.out.println(h1);
		h1.add("Fatma");
		System.out.println(h1);
		List<String> l1= new ArrayList<>();
		l1.add("Fatma");
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(l1.hashCode());
		
	}
	

}
