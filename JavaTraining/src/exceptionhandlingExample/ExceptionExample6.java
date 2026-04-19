package exceptionhandlingExample;

import java.util.Scanner;

public class ExceptionExample6 {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number :");
			int num=sc.nextInt();
			System.out.println(num);
			}
			
			catch(Exception e)
			{
				System.out.println("Please Enter Valid Input ");
			}

		     finally 
		     {
		    	 
		    	 System.out.println("Hello World ");
		     }
		
	}

}
