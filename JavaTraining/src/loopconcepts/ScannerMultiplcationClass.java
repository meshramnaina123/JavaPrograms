package loopconcepts;

import java.util.Scanner;

public class ScannerMultiplcationClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		
		// Table of 2
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}	
		

	}

}
