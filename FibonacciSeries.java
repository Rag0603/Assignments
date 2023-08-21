package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		
	  System.out.println(0);	
	  
		for (int i = 0; i<10; i++)
		
		{
			
			n3=n1+n2;
			System.out.println(n3);
			 n2=n1;    
			 n1=n3;
			   
			  
		}
		
		
	}
	

}
