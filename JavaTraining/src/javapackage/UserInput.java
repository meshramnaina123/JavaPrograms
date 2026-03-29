package javapackage;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Entered number is :"+num1);
		
		System.out.println("Enter Decimal number :");
		float num2=sc.nextFloat();
		System.out.println("Entered Decimal number is :"+num2);
		
		System.out.println("Enter Name :");
		String str=sc.next();
		System.out.println("Name is :"+str);
		
		System.out.println("Enter boolean value :");
		boolean bn=sc.nextBoolean();
		System.out.println("Entered boolean value is :"+bn);
		
		System.out.println("Enter the Character :");
		char ch=sc.next().charAt(0);
		System.out.println("Entered character is :"+ch);
		
		

	}

}
