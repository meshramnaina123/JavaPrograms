package conditionalstatements;

public class IfElseIfExample {

	public static void main(String[] args) {
	
		int marks=75;
		
		/*
		 * if else-if ladder
		 * else is statement will only check the condition when if statement  is false 
		 */
		
		
		if(marks>=90)
			
		{
			System.out.println("Grade A");
					
		}
		
		else if(marks>=70)
			
		{
			System.out.println("Grade B");
		}
		
		else
			
		{
			System.out.println("Grade C");
		}

	}

}
