package exceptionhandlingExample;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		
		//Outer try block
		try
		{
			//Inner try block
			try
			{
				String str[]= {"Pune","Mumbai","Nashik"};
				System.out.println(str[0]);
			}
			
			//Inner catch block
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("Array Exception");
			}
			
			int a=10;
			int b=0;
			int c=a/b;
			
		}
		
		//Outer catch block
		catch(ArithmeticException a)
		{
			System.out.println("Arithmatic Exception");
		}

	}

}
