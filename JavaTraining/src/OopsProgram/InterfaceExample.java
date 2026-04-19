package OopsProgram;

public class InterfaceExample implements Interface1 {

	public static void main(String[] args) {
		
		InterfaceExample obj=new InterfaceExample();
		obj.a();
	
		

	}

	@Override
	public void a() {
		
		System.out.println("This is a method of interface");
		
	}

}
