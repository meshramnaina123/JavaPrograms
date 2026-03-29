package Test;

import java.util.Scanner;

public class DemoExample {
	
	public void test()
	
	{
		System.out.println("Automation Learning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int age=16;
		int number=5;
		int square=number*number;
		int temp;
		
		DemoExample demo=new DemoExample();
		demo.method();
		demo.test();
		
		System.out.println("Before Swap a = "+ a + ", b = " +b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swap a = "+ a + ", b = " +b);
		System.out.println("Hello World");
		System.out.println("Add is:"+c);
		System.out.println("Sub is:"+d);
		System.out.println("Mul is:"+e);
		System.out.println("Div is:"+f);
		System.out.println(square);
		System.out.println("A \nB \nC \nD \nE");
		System.out.println("Naina \nAmavati");
		System.out.println(a);
		System.out.println("Age is : "+age);
		System.out.println(b);
		
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Entered number is :"+num1);
		
		System.out.println("Enter float number :");
		float num2=sc.nextFloat();
		System.out.println("Entered float number is :"+num2);
		
		System.out.println("Boolean value :");
		boolean bn=sc.nextBoolean();
		System.out.println("Boolean value is :"+bn);
		
		System.out.println("Enter String :");
		String str=sc.next();
		System.out.println("Entered String is :"+str);
		
		System.out.println("Enter Char :");
		char ch=sc.next().charAt(0);
		System.out.println("Entered Char is :"+ch);
		
		// Single Line Comment
		/* Multiple line Comment */
		/** Document Comment **/
		
		
		
		
		
		
		
		
		
	}

	public void method()
	{
	
		System.out.println("Method Learning ");
	}
	
	
}
