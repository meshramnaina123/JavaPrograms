package exceptionhandlingExample;

class InvalidAgeException1 extends Exception {

	InvalidAgeException1(String msg)
	{
		super(msg);
	}

}



public class UserDefinedExceptionExample1 {

	public static void main(String[] args) throws InvalidAgeException1 {  // throws keyword used 
		
		ageCheck(17);
		
	}

	public static void ageCheck(int age) throws InvalidAgeException1    //// throws keyword used
	{
		if(age<18)
		{
			throw new InvalidAgeException1 ("Age must be 18 or above");
		}	
		
		else
		{
			System.out.println("Valid Age for Voting");
		}
	}
	
}


	
	
}
