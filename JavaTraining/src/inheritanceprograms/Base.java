package inheritanceprograms;

class Base {
	
	public void study()
	{
		System.out.println("I am studying");
	}

}

class Main1 extends Base
{
public static void main(String[] args)
{

	Main1 obj=new Main1();
	obj.study();
	

}
  
   public void study()
   {
	super.study();   
	System.out.println("You are studying");
   }
   
}


