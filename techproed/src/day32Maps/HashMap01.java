package day32Maps;

import java.util.*;

public class HashMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1)Hash Map uses  {} 
		 * Maps are in key value pair
		 * Key must be unique
		 * Values can be repeated
		 * 
		 */
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		System.out.println(hm1);
		
		hm1.put(101, "Milk");
		hm1.put(102, "Cheese");
		hm1.put(103, "Butter");
		hm1.put(104, "Honey");
		hm1.put(105, "Pastirma");
		System.out.println(hm1);
		
		//null key is fin
		hm1.put(null, "Nothing");
		System.out.println(hm1);
		
		//null values 
		
		hm1.put(106, null);
		System.out.println(hm1);
		hm1.put(112, null);
		System.out.println(hm1);
		
		//Print HashMap contents
		System.out.println(hm1.get(101));
		System.out.println(hm1.get(112));
		
		//Print HashMap contents get message if not exist
	   System.out.println(hm1.values());
	   System.out.println(hm1.keySet());
		

	}

}
