package OopsProgram;

class X
{
	private int value;
	
	//Setter Method
	public void setValue(int x)
	{
		value = x;
	}
	
	//Getter Method
	public int getValue()
	{
		return value;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
	
		X obj=new X();
		obj.setValue(100);
		System.out.println(obj.getValue());

	}

}
