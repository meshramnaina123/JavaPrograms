package inheritanceprograms;

public class Inheritance2 extends Inheritance1 {
	
	public void multiply(int x, int y)
	{
		z=x*y;
		System.out.println("Multilication is :"+z);
	}

	public static void main(String[] args) {
		
		Inheritance2 obj=new Inheritance2();
		obj.add(70,20);
		obj.multiply(10,5);

	}

}

