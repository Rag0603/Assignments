package Assignments;

public class IsPrime {

		

		/*
		 * Goal: To find whether a number is a Prime number or not
		 * 
		 * input: 13
		 * output: 13 is a Prime Number
		 * 
		 * Shortcuts:
		 * 1) Print : type: syso, followed by: ctrl + space + enter
		 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
		 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
		 *   
		 * What are my learnings from this code?
		 * 1)
		 * 2)
		 * 3) 
		 * 
		 */

		

		public static void main(String[] args) {



			// Declare an int Input and assign a value 13

			int a = 4;

			// Declare a boolean variable flag as false

			boolean flag = false;
			

			// Iterate from 2 to half of the input a/2 or a-1, Both works

			for (int i = 2; i< a-1; i++) {
				
				// Divide the input with each for loop variable and check the remainder
					if (a%i==0) {
				// Set the flag as true when there is no remainder
						flag=true;
				// break the iterator
						//What happens here if no break is added as we're anyway terminating the for loop after the flag?
						break; //For example, If the break is added for the value 35, 35%2,3,4, "5" itself will give the result 0, and it won't proceed further and when the break is not added, Even though we get the result at 5, It continues till the loop ends that is till 34 
					}
			}

			// Check the flag (Provide a condition)
			if (flag==false) {
			// Print 'Prime' when the condition matches
				System.out.println("The number " + a + " is prime number");
			}
				// Print 'Not a Prime' when the condition doesn't match 
			else
				
			{
				System.out.println("The number " + a + " is not prime number");
			}
			
		
					}
					
			}
		
