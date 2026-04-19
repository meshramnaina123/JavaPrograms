package constructorprograms;

//Final (Keyword) Class Program 
//Whenever we declare the class as final it cannot be extended or inherited to the sub class 

final class Test3 {
	
	void read()
	{
		System.out.println("I am reading");
	}

	public class Main3 extends Test3 // The type Main3 cannot subclass the final class Test3
	{
		
	}
	
}
