package conditionalstatements;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1 :");
		int num1=sc.nextInt();
		System.out.println("Enter the value of num2 :");
		int num2=sc.nextInt();
		System.out.println("Choose Operation :");
		char op=sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
		default:
				System.out.println("Please enter the valid input");
				
		
		}
		

	}

}
