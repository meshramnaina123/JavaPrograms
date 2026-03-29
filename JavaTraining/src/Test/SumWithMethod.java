package Test;

public class SumWithMethod {
	
	public static int addNumbers(int num1, int num2)
	
	{
        int sum = num1 + num2;
        return sum; // Return the calculated sum
    }

	public static void main(String[] args) {
		
		int number1 = 10;
        int number2 = 20;
        
        // Call the user-defined method and store the result
        int result = addNumbers(number1, number2); 
        
        // Print the final result
        System.out.println("The sum is: " + result); 

	}

}
