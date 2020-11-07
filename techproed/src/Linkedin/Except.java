package Linkedin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//System.out.println(4/0);
			callmethod();
			} catch (ArithmeticException e)
			{
				System.out.println("Fiel not");
				throw new Exception();
			}catch (Exception e)
			{
				System.out.println("can read not");
				
			}finally
			{
				System.out.println("Final block");
				
			}

	}
	public static void callmethod() throws Exception 
	{
		throw new ArithmeticException();
	}

}
