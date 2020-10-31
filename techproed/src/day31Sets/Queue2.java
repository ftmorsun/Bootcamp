package day31Sets;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime startTime= LocalTime.now();
		System.out.println(startTime);
		Queue<String> q1= new PriorityQueue<>();
		q1.add("MyLove");
		q1.add("Fatma");
		q1.add("Osman");
		q1.add("Vildan");
		q1.add("Burhan");
		System.out.println(q1);
		LocalTime endTime= LocalTime.now();
		System.out.println(endTime);
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

	}

}
