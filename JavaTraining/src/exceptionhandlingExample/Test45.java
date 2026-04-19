package exceptionhandlingExample;

import java.util.Scanner;

//This Program will run properly as it includes try and catch exception handling to handle the error

public class Test45 {

	public static void main(String[] args) {
		
		try {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2=sc.nextInt();
		int div=num1/num2; // ArithmeticException Error 
		System.out.println("The division is :" +div);
		
		} catch(Exception e)
		{
			System.out.println("Cannot divide by Zero");
		}
		
		System.out.println("Hello World");
		

	}

}
