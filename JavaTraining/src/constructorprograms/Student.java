package constructorprograms;

public class Student {
	
     String name;
	
	//Parameterized Constructor
	Student(String n)
	{
		name=n;
	}
	
	public void display()
	{
		System.out.println("My name is :" +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj=new Student("Naina");
		obj.display();

	}

}

