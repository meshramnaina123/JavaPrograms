package loopconcepts;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
	  
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int num=0;
		
		while(true)
		{
			if(num==-1)
			{
				break;
			}
			
			num=sc.nextInt();
		}	

		System.out.println("Out of While Loop");
	}

}
