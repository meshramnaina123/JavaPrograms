package constructorprograms;

// Final (Keyword) Method Program
// Whenever we declare a method as final it cannot be overridden to our extended class 

class Parent {
	
	
	final void read()
	{
		System.out.println("Parent Class Read Method");
	}
	
	public class Child extends Parent
	{
		public void read() // Cannot override the final method from Parent
	}

	public static void main(String[] args) {
		
		
	}

}
}
