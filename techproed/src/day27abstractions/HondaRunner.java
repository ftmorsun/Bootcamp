package day27abstractions;

public class HondaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By using abstract classes, we cannot create objects.
				//Honda c1 = new Honda();
				
				Civic c1 = new Civic();
				c1.engine();
				c1.leather();
				Accord c2 = new Accord();
				c2.engine();
				c2.leather();
				
				//Search: If I cannot create object from abstract, what do you think does an abstract
				//        have constructor or not?      

	}

}
