package day25Exceptions;

public class Exeption08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOfEggs = 12;
		String v=null;
		int arr[] = {11,12,13};
		
		Object obj = new Object();
		
		if (numOfEggs <0)
		{
			throw new IllegalArgumentException("No negative allowed");
		}
		else
		{
			System.out.println("numofEgss  "+ numOfEggs );
		}
		String s ="a1";
		boolean r = true;
		for (int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				r=false;
			}
		}
		if (!r)
		{
			throw new NumberFormatException("Some characters are not digit");
		}else
		{
			System.out.println(Integer.parseInt(s)+1);
		}
		
		 v="abc";
	    if (v.equals(null))
	    {
	    	throw new NullPointerException();
	    }
	    else
	    {
	    	System.out.println(v.length());
	    }
		
		

	}

}
