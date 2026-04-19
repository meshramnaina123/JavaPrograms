package Test;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int count=0;
		while(num!=0)
		{
			num/=10;
			count++;
		}
		
		/*
		 * Initial num=100 count=0
		 * itr 1: 100/10=1 count=1
		 * itr 2: 10/10=1 count=2
		 * itr 3: 1/10=1 count=3
		 * 
		 */
		
		
		
		System.out.println("Number of Digits :" +count);

	}

}
