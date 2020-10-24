package day25Exceptions;


import java.io.FileInputStream;
import java.io.IOException;

public class Exception01
{
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream ("src/Samples.txt");
        
		int k;

		while ((k=fis.read() )!=-1)
		{
           System.out.println((char)k);

		}
	}
}