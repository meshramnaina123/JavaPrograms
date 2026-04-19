package Test;

//Method OverriddeExample

class A1
{
	int a=10;
}

class Main1 extends A1
{
	public static void main(String[] args)
	{

		Main1 obj=new Main1();
		int b=20;
		int c=obj.a+b;
		System.out.println(c);
	}
}