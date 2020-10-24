package VendingMachine;

public class Three implements One, Two{

	public void method()
	{
		One.super.method();
	}

}
