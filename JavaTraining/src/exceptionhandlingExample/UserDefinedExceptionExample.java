package exceptionhandlingExample;


class InvalidAgeException extends Exception {

	InvalidAgeException(String msg)
	{
		super(msg);
	}

}



public class UserDefinedExceptionExample {

	public static void main(String[] args) {
		

       try {
			
			//Calling the Method
			ageCheck(17);
		}
		
		catch(InvalidAgeException e)
		{
			System.out.println("Invalid Age Excepton");	
			System.out.println(e.getMessage());
			
		}
		
	}
	
	
	public static void ageCheck(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException ("Age must be 18 or above");
		}	
		
		else
		{
			System.out.println("Valid Age for Voting");
		}
	}
	
}


