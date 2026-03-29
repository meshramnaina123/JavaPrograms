package Test;

import java.util.Scanner;

public class task2 {
	
	//Global Variable are declared outside main method but inside class
	int b=20;
	
	//Static Variable are declared outside main method but inside class with static keyword
	static int c=30;
	
	//User defined method
	
	public void test() 
	
	{
		System.out.println("Test Method");
		System.out.println(30+20);
		
	}
	
	

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
		
		task2 obj=new task2();
		obj.test();
		obj.demo();
		
		//Local Variable are declared inside the main method
		int a=10;
		int r=30;
		int j=a+r;
		int s=a-r;
		int t=a*r;
		int u=a/r;
		
		
		
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(c);
		
		// Addition of 2 numbers using scanner class
		System.out.println("Enter 2 numbers:");
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=d+e;
		System.out.println("Addition of 2 numbers is :"+f);
		
		
		// Average of 3 numbers using scanner class
		System.out.println("Enter 3 numbers:");
		int g=sc.nextInt();
		int h=sc.nextInt();
		int i=sc.nextInt();
		int avg=(g+h+i)/3;
		System.out.println("Average of 3 numbers is :"+avg);
		
		// Default values of instance(Global) variables
		System.out.println("Default values of Global variable is : "+obj.b);
		
		// Default values of Local variables
		System.out.println("Default values of Local variable is : "+a);
		
		// Simple interest calculation
		System.out.println("Enter 3 numbers to calculate simple interest :");
		float principal=sc.nextInt(); //Principal
		float rate=sc.nextInt(); //Rate of Interest
		float time=sc.nextInt(); //Time Period
		float si=(principal*rate*time)/100; //Simple Interest
		System.out.println("Simple interest is :"+si);  
	 
		
		//Integer Array
		int q[]= {10,20,30,40,50};
		System.out.println(q[0]);
		System.out.println(q[1]);
		System.out.println(q[2]);
		System.out.println(q[3]);
		System.out.println(q[4]);
		
		//Char Array
		char ch[]= {'a','n','u','j','a'};
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println(ch[4]);
		
		//String Array
		String str[]= {"Mani","Naina","Raj","John"};
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
		//Addition, Subtraction, Multiplication, Division
		System.out.println("Addition is :"+j);
		System.out.println("Subtraction is :"+s);
		System.out.println("Multiplication is :"+t);
		System.out.println("Division is :"+u);
		
		//Post Increment Operator
		System.out.println(a); // 10
		System.out.println(a++); //10
		System.out.println(a); //11
		
		//Pre Increment Operator
		System.out.println(r); // 30
		System.out.println(++r); //31
		System.out.println(r); //31
		
		
		//Post Decrement  Operator
		System.out.println(a); // 11
		System.out.println(a--); //11
		System.out.println(a); //10
		
		//Pre Decrement Operator
		System.out.println(r); // 31
		System.out.println(--r); //30
		System.out.println(r); //30
		
		//Read an integer from user
		System.out.println("Enter an integer :");
		int num1=sc.nextInt();
		System.out.println("You have entered an integer :"+num1);
		
		//Read String from user
		System.out.println("Enter the string :");
		String num2=sc.next();
		System.out.println("You have entered the string :"+num2);
		
		//Area of circle
		System.out.println("Enter the radius of the circle:");
		double radius, area;
		radius=sc.nextDouble();
		area = Math.PI * radius * radius;
		System.out.println("The area of the circle is:"+area);
	
	
	}
	
	public void demo()
	{
		System.out.println("Demo Method");
	}

}
