package constructorprograms;

//This Program Demonstrate Constructor Overloading

public class ConstructorOverloading {
	
	int id;  // Global Variable
	String name; // Global Variable
	String address; // Global Variable
	
	
	//Default Constructor
	ConstructorOverloading()
	{
		System.out.println("Hello Default Constructor");
	}
	
	//Parameterized Constructor
	ConstructorOverloading(int a, String b, String c)
	{
		id = a;
		name = b;
		address = c;
	}
	
	public void display()
	{
		System.out.println(id+ " " + name + " " + address);
	}

	public static void main(String[] args) {
		
		//Default Constructor Calling
		
		ConstructorOverloading obj=new ConstructorOverloading();
		
		ConstructorOverloading obj1=new ConstructorOverloading(1 , "Naina", "Nagpur");
		obj1.display();
		
		ConstructorOverloading obj2=new ConstructorOverloading(2 , "Kartik", "Pune");
		obj2.display();
		
		ConstructorOverloading obj3=new ConstructorOverloading(3 , "Arpit", "Mumbai");
		obj3.display();
		

	}

}
