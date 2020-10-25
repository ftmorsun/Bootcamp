package day29Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list4= new ArrayList<>();
	        list4.add(12);
	        list4.add(13);
	        list4.add(14);
	        list4.add(15);
	        list4.add(16);
	        ListIterator<Integer> it4=list4.listIterator();
	        while(it4.hasNext())
	        {
	        	Integer el=it4.next();
	        	System.out.println(it4.nextIndex());
	        	if((it4.nextIndex()-1)/3==0);
        			it4.set(el=el*2);
	        }
	        while(it4.hasPrevious())
	        {
	        	
	        	//System.out.println(it4.previousIndex()+1);
	        
	        	Integer el=it4.previous();
	        	
	        	System.out.println(el);
	        }
	     
		

	}

}
