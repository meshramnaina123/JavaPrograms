package loopconcepts;

import java.util.Scanner;

public class WhileLoopExample3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		while(true)
		{	
		System.out.println(" Enter the Number :");
		int num=sc.nextInt();
		sum=sum+num;
		System.out.println("Total is :" +sum);
		
		if(sum>1000)
		{
			System.out.println("Exit Program");
			break;
		}
		
		
	}

}
}