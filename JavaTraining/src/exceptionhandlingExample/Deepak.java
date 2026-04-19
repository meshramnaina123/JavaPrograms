package exceptionhandlingExample;


//Create User Defined / Custom Exception
class Deepak extends Exception {

		Deepak(String msg)
		{
			super(msg);
		}

	}

class UserDefinedException {
	
	public static void main(String[] args)
	{
		try {
			
			//Calling the Method
			ageCheck(17);
		}
		
		catch(Deepak e)
		{
			System.out.println("Invalid Age Excepton");	
			System.out.println(e.getMessage());
			
		}
	}
	
	//Defining the Method
	public static void ageCheck(int age) throws Deepak
	{
		if(age<18)
		{
			throw new Deepak("Age must be 18 or above");
		}	
		
		else
		{
			System.out.println("Valid Age for Voting");
		}
	}
	
}