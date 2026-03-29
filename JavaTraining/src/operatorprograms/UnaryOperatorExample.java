package operatorprograms;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		
		/*
		 * This is a Local Variable
		 */
	
		int a=10;
		int b=99;
		
		//This is Post Increment
		/*
		 * In Post Increment current value will get print first, then it will get increment
		 */
		System.out.println(a); //10
		System.out.println(a++); //10 Not Incremented by 1
		System.out.println(a); //11
		System.out.println(a++); //11
		System.out.println(a); //12
		
		//This is Pre-Increment
		/*
		 * In Pre-Increment , Value will get increment first, then it will get printed  
		 */
		System.out.println(++b); //100
		
		
		System.out.println(a++  +  ++b); //12 + 101 = 113
		 
		
		
		
		
		
		
		
		
		
		

	}

}
