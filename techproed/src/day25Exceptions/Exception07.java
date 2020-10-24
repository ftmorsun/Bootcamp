package day25Exceptions;

public class Exception07 {
	

	public static void main(String[] args) {
		
		printAge(23);
	}
	
	public static void printAge(int age) {
		
		if(age<0) {
			
			throw new IllegalArgumentException("age cannot be negative");
			
		}else {
			System.out.println(age);
		}

	}}
