package day25Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {
	
	
	
	
public static void main(String[] args) {
		
		try {
			
		
		FileInputStream fis = new FileInputStream ("src/Samles.txt");
		} catch (FileNotFoundException e)
		{
			System.out.println("Fiel not");
		}catch (IOException e)
		{
			System.out.println("can read not");
			
		}finally
		{
			System.out.println("Final block");
			
		}

}
}
