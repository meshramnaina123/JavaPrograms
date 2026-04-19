package exceptionhandlingExample;

public class ExceptonExample4 {

	public static void main(String[] args) {
		
		try {
		String str= null;
		System.out.println(str.toUpperCase());
		} 
		
		catch (Exception e) // We can write (NullPointerExcepton e) or can give any name
		{
			System.out.println("Null string cannot be casted");
		}

	}

}
