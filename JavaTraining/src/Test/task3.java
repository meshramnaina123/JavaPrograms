package Test;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int a=20;
		
		if(a%2==0) // Even Number
		{
			System.out.println("Even Number");
			
		}
		
		 for(char i='A'; i<='Z'; i++)
		 {
			 System.out.println(i);
		 }
		   
		 
		 // Swapping of 2 numbers
		 System.out.println("Enter the 2 numbers :");
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 int temp;
		 temp=b;
		 b=c;
		 c=temp;
		 System.out.println("The swapping of 2 numbers is:"+b+ " & " +c);
		 
		  
		 if(a%2==0)
		 {
			 System.out.println("Prime Number");
		 }	 
		 else
		 {
			 System.out.println("Not a Prime Number");
		 }
	
		  
		 // Print "Welcome to Java Programming" 10 times
		 for(int i=1; i<=10; i++)
		 {
			 System.out.println("Welcome to Java Programming");
		 }
		 
		 
		 // Check whether the person is a senior citizen or not.
		 int age=65;
		 
		 if(age>60)
		 {
			 System.out.println("Senior Citizen");
		 }
		 else
		 {
			 System.out.println("Not a Senior Citizen");
		 }
		 
		 
		 //Count Number of Digits in an Integer.
		 int num = 123456;
	        int count = 0;

	        // Loop until num is 0
	        while (num != 0) {
	            num /= 10;
	            count++;
	        }

	        System.out.println("Number of digits: " + count);
	        
	        
	        //Print the length of the given string .
	        String str="Test Engineers Academy";
	        System.out.println("The length of given string is :"+str.length());
	        
	        
	        //Print the factorial of a given number
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        
	        long f = 1;
	        
	        for (int i = 1; i <= n; i++) { 
	            f *= i;
	        }
	        
	        System.out.println("Factorial of " + n 
	                            + " = " + f);
		 
	      //Print the factorial of a given number using while loop
	        int num1 = 5, i = 1;
	        long factorial = 1;
	        while(i <= num1)
	        {
	            factorial *= i;
	            i++;
	        }
	        System.out.printf("Factorial of %d = %d", num1, factorial);
	}
}
