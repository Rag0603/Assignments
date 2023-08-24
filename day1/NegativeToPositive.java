package Assignments;

public class NegativeToPositive {
	
	
	public static void main(String[] args) {
		
		
		float a= -13.63773f;
		if (a<0) {
			
			
			System.out.println("Converted "+ a + " to " + -(a));
			
		}else if (a==0) {
			
			System.out.println(a + " a is neither a positive number nor a negative number, it's a neutral");
		}
		
		
		else {
			
			System.out.println("The Give number " + a + " is a already a positive number" );
		}
	}
	
}
