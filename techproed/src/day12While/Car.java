package day12While;

public class Car {
	
	int price;
	String make;
	String model;
	int mileage;
	int year;
	boolean isGas;
	
	public Car(int price, String make, String model, int year)
	{
		this.price=price;
		this.make=make;
		this.model=model;
		this.mileage=mileage;
		this.year=year;
		this.isGas=true;
	}
	public Car(int price, String make, String model, int mileage, int year, boolean isGas){
		
		this.price=price;
		this.make=make;
		this.model=model;
		this.mileage=mileage;
		this.year=year;
		this.isGas=true;
	}
	
	public static void main(String[] args) {

		Car car3= new Car(20000, "Toyota", "Corolla", 5, 2020, true);
		System.out.println(car3.price);
		System.out.println(car3.make);
		System.out.println(car3.model);
		System.out.println(car3.mileage);
		System.out.println(car3.year);
		System.out.println(car3.isGas);
		
		
		
	}

}
