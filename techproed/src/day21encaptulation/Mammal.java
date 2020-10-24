package day21encaptulation;

public class Mammal extends Animal {
	int age=14;
	String name;
	
    public Mammal()
    {
    	System.out.println("Mammal Constructor" );
    }
	
	public void giveBirth()
	{
		System.out.println("Can give birth");
	}
	public void fee()
	{
		System.out.println("Can feed baby");
	}

}
