package exceptionhandlingExample;

public class MultipleCatchExample {

	public static void main(String[] args) {
		
		try {
		int a=10;
		int b=2;
		int c=a/b;
		
		System.out.println(c);
		
		int arr[] = {10, 20, 30};
		System.out.println(arr[0]);
		
		String str=null;
		System.out.println(str.toUpperCase());
		System.out.println("Hello");
		
		}
		
		catch(ArrayIndexOutOfBoundsException ary)
		{
			System.out.println("Array Exception");
		}
		
		catch(ArithmeticException ari)
		{
			System.out.println("Arithmatic Exception");
		}
		
		catch(NullPointerException ne)
		{
			System.out.println("Null Pointer Exception");
		}
		
		catch(Exception ee)
		{
			System.out.println("All Types of Exception Handling");
		}
		

	}

}
