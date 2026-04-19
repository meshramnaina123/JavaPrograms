package constructorprograms;

public class Employee {
	
	String name;
	
	
	//Constructor
	Employee()
	{
		name="Naina";
	}
	
	public void display()
	{
		System.out.println("My name is :" +name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		obj.display();

	}

}
