package javapackage;

public class VariableTypesExample {
	
	//Global Variable
	int a=200;
	
	//Static variable
	static int b=300;

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		VariableTypesExample obj=new VariableTypesExample();

		//Local Variable
		int num=100;
		
		//Calling Local Variable 
		System.out.println(num);
		
		//Calling Global Variable 
		System.out.println(obj.a);
		
		//Calling Static variable 
		System.out.println(b);
	
	}

}
