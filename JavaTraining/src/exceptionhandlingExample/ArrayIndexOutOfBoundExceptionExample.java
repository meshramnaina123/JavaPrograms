package exceptionhandlingExample;

// Exception Handling Array Program with try and catch

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		
		try {
		String name[]= {"Naina","Yash","Poonam","Vivek","Shubhangi"};
		System.out.println(name[10]);
		
		} catch(Exception e)
		{
			System.out.println("Please Enter the Valid Index Number");
		}
		
		System.out.println("Hello All, Welcome to the Automation World!!!");

	}

}
