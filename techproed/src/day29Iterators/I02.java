package day29Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list4= new ArrayList<>();
        list4.add(12);
        list4.add(13);
        list4.add(14);
        list4.add(15);
        ListIterator<Integer> it4=list4.listIterator();
        while(it4.hasNext())
        {
        	it4.next();
        }
        while(it4.hasPrevious())
        {
        	Integer el=it4.previous();
        	it4.set(el+2);
        }
        System.out.println(list4);
	}

}
