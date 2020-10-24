package day26Strings;


public class StringOp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            StringBuilder s = new StringBuilder("Good");
            String s1=s.toString();
            String s2=s1;
            String s3="Good";
            String s4="Good";
            
            System.out.println(s2==s1);
        
        System.out.println(s3==s1);
        System.out.println(s4==s3);


	}

}
