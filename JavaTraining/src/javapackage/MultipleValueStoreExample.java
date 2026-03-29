package javapackage;

public class MultipleValueStoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Int Array
		int a[]= {10,20,30,40,50};
		
		// Char Array
		char ch[]= {'a','e','i','o','u'};
		
		// String Array
		String name[]= {"Ram","Shyam","Krishna","Shiv","Om","Hari"};
		
		
		float[] ft=new float[5];
		ft[0]=1.1f;
		ft[1]=2.1f;
		ft[2]=3.1f;
		ft[3]=4.1f;
		ft[4]=5.1f;
		
	
		
		System.out.println(ft[0]);
		
		
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[4]);
		
		System.out.println(ch[0]);//a
		System.out.println(ch[4]);//u
		
		System.out.println(name[0]);//Ram
		System.out.println(name[2]);//Krishna
		System.out.println(name[3]);//Shiv
		
					
		}

}
