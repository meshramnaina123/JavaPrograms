package constructorprograms;

public class EmployeeDetails {
	
	int id;
	String name;
	String city;
	
	// Parameterized Constructor
	EmployeeDetails(int i, String n, String c)
	{
		id=i;
		name=n;
		city=c;
	}
	
	// Copy Constructor
	EmployeeDetails(EmployeeDetails e)
	{
		id=e.id;
		name=e.name;
		city=e.city;
	}
	
	public void display()
	{
		System.out.println(id+ " " + name + " " +city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails obj=new EmployeeDetails(1, "Naina" ,"Nagpur");
		obj.display();
		EmployeeDetails obj1=new EmployeeDetails(obj); // Copy Constructor
		obj1.display();
		

	}

}
