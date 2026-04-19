package inheritanceprograms;

public class Main extends MethodOverrideExample {
	
	public void eat()
	{
		super.eat();
		System.out.println("You are eating");
	}

	public static void main(String[] args) {
		
		Main obj=new Main();
		obj.eat();

	}

}
