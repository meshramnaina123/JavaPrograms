package constructorprograms;

// Final (Keyword) Variable Program
// Once we declare a variable as final we cannot perform re-assignment 

public class FinalVariable {

	public static void main(String[] args) {
		
		final int A=10;
		System.out.println(A);
		A=20; // Once we declare a variable as final we cannot perform reassignment ie; new value cannot be assign to that variable
              //The final local variable A cannot be assigned. It must be blank and not using a compound assignment    
	}

}
