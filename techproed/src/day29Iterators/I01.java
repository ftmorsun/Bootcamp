package day29Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1=new ArrayList<>();
		list1.add("Fatma");
		list1.add("Osman");
		list1.add("Vildan");
		list1.add("Burhan");
		
		for (int i=0; i<list1.size(); i++)
			     list1.set(i, list1.get(i)+"X") ;
		System.out.println(list1);
		 
		//Cretae the object and use the iteratorr
			
		
		
		List<String> list3 = new ArrayList<>();
		list3.add("XY");
		list3.add("ZT");
		list3.add("UV");
		System.out.println(list3);
		
		Iterator<String>  it3=list3.iterator();
		while(it3.hasNext()) {
			
			System.out.println(it3.next());
		}
		
	}

}
