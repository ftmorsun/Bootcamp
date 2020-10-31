package day32Maps;

import java.time.LocalTime;
import java.util.*;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime startTime= LocalTime.now();
		System.out.println(startTime);
		LinkedHashSet<Integer> lh1= new LinkedHashSet<>();
		 lh1.add(173);
		lh1.add(250);
		lh1.add(110);
		lh1.add(135);
		
		System.out.println(lh1);
		
		LocalTime endTime= LocalTime.now();
		System.out.println(endTime);
		
		//LinkedHashSet to Array
		System.out.println(LocalTime.now());
	    Integer[] arr2= new Integer[lh1.size()];
	    arr2=lh1.toArray(arr2);
	    
	    System.out.println(Arrays.toString(arr2));
		System.out.println(LocalTime.now());

		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		lhs1.add(21);
		lhs1.add(25);
		lhs1.add(22);
		lhs1.add(29);
		lhs1.add(24);
		System.out.println(lhs1);
		
		//Try to print the element at index 2 on the console
		
		//1.Way: Convert the LinkedHashSet to an Array then get the specific element
		Integer[] arr = new Integer[lhs1.size()];
		arr = lhs1.toArray(arr);
		System.out.println(arr[2]);//22
		
		//2.Way: Convert the LinkedHashSet to a List then get the specific element
		List<Integer> l1 = new ArrayList<>(lhs1);
		System.out.println(l1.get(2));//22
		
		//3.Way: Use iterator to get a specific element from a LinkedHashSet
		get(lhs1);
	}
	
	public static void get(LinkedHashSet<Integer> lhs1) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index (0-4)");
		int idx = scan.nextInt();
		int currentIndex = 0;
		Iterator<Integer> it1 = lhs1.iterator();
		while(it1.hasNext()) {	
			Integer el = it1.next();
			if(currentIndex == idx) {
				System.out.println("The element at index " + idx + " is " + el);
			}
			currentIndex++;
		}
		
	}


}
