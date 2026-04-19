package constructorprograms;

public class Student1 {
	
	String name;
	int id;
	
	//Parameterized Constructor
	Student1(int i, String n)
	{
		id=i;
		name=n;
	}
	
	public void display()
	{
		System.out.println("Id is : " +id);
		System.out.println("My name is : " +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Student1 obj1=new Student1(101 , "Naina"); 
		obj1.display();
		Student1 obj2=new Student1(102 , "Chitra"); 
		obj2.display();
		Student1 obj3=new Student1(103 , "Kavita"); 
		obj3.display();
		
		
		
	}

}
