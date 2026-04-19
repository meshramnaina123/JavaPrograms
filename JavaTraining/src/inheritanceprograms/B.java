package inheritanceprograms;

public class B extends A {

	public static void main(String[] args) {
		
		/*
		 * Here Class B is the child class and Class A is the Parent class
		 * use 'extends' keyword to acquires properties from Parent Class into Child Class 
		 */
		
		B obj=new B();
		String name="Naina";
		System.out.println(obj.id);
		System.out.println(name);
		System.out.println(obj.city);
		System.out.println(obj.state);
	}

}
