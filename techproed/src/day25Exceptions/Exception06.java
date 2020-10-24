package day25Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception06 {

	public static void main(String[] args) {
		
			
			//ArithmeticException
			//System.out.println(12 / 0);
			
			String s = "123";
			System.out.println(s + 1);//1231
			int num = Integer.parseInt(s);
			System.out.println(num + 1);// 124
			
			//If you try to convert a String which has at least one non-digit character
			//by using parseInt() method you will get NumberFormatException 
			String v = "abc";
			int num2 = Integer.parseInt(v);
			System.out.println(num2);//

	}

}
