package inheritanceprograms;

public class MethodOverloadingExample {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}

	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(int a, float b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		MethodOverloadingExample obj=new MethodOverloadingExample();
		obj.add(99,1);
		obj.add(100, 1, 99);
		obj.add(10,10.1f);
	
	}

}
