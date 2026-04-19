package exceptionhandlingExample;

import java.util.Scanner;

//This Program will show error for (int div=num1/num2) as it can be only handle by try catch exception handling

public class Test44 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2=sc.nextInt();
		int div=num1/num2; // ArithmeticException Error 
		System.out.println("The division is :" +div);
		System.out.println("Hello World");
		
		
		
		

	}

}
