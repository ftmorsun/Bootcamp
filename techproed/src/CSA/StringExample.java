package CSA;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x=new String( "hello"); //address1
		String y ="hello";//address2 Java checks the pool and none of this object so implicitly called String() and assigned an address
		String z ="hello";//address2   Java checks the pool and finds the object and sends the same address
		String yy ="Hello"; //address3 Java checks the pool and none of this object so implicitly called String() and assigned an address
		String zy ="hello";//address2      Java checks the pool and finds the object and sends the same address
        
		System.out.println(x==y);
		System.out.println(y==z);
		System.out.println(zy==z);
		
	}

}
