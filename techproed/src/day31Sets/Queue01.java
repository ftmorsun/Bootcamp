package day31Sets;

import java.util.*;

public class Queue01 {
	public static void main(String[] args)
	{
		Queue<String> q1= new LinkedList<>();
		q1.add("My Love ");
		q1.add("Fatma");
		q1.add("Osman");
		q1.add("Vildan");
		q1.add("Burhan");
		System.out.println(q1);
		//remove returns Exception for empty queues
		System.out.println(q1.remove()+"  "+ q1);
		System.out.println(q1.remove()+"  "+ q1);
		System.out.println(q1.remove()+"  "+ q1);
		System.out.println(q1.remove()+"  "+ q1);
		System.out.println(q1.remove()+"  "+ q1);
		//peek returns null for empty queues
		System.out.println(q1.peek()+"  "+ q1);
		//poll returns null for empty queues
		System.out.println(q1.poll()+"  "+ q1);
		

	

			

		TreeSet<String> tSet = new TreeSet<>();

		tSet.add("C");

		tSet.add("B");

		tSet.add("C");

		tSet.add("A");

		for (String w : tSet){

			System.out.printf(w + " ");
		}}}


