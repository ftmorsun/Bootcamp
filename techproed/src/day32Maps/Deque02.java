package day32Maps;

import java.time.LocalTime;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Deque02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalTime.now());
		Deque<String> dq1 = new LinkedList<>();
		dq1.add("Ali");
		dq1.add("Metin");
		dq1.add("Joe");
		dq1.add("Mary");
		dq1.add("Angie");
		System.out.println(LocalTime.now());
		
		System.out.println(LocalTime.now());
		LinkedList<String> lq1 = new LinkedList<>();
		lq1.add("Ali");
		lq1.add("Metin");
		lq1.add("Joe");
		lq1.add("Mary");
		lq1.add("Angie");
		System.out.println(LocalTime.now());
		
		System.out.println(LocalTime.now());
		Deque<String> dq2 = new ArrayDeque<>();
		dq2.add("Ali");
		dq2.add("Metin");
		dq2.add("Joe");
		dq2.add("Mary");
		dq2.add("Angie");
		System.out.println(LocalTime.now());
		
	}

}
