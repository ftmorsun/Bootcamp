package Linekdin;

import java.util.ArrayList;
import java.util.List;

public class Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Boolean> list1 = new ArrayList<>();
     list1.add(true);
     list1.add(Boolean.parseBoolean("FalSe"));
     System.out.println(list1.get(1).getClass());
     System.out.println(list1.get(0).getClass());
     
     
     
     System.out.println("hello" instanceof Object);
     
     System.out.println("hello".getClass());
	}

}
