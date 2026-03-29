package operatorprograms;

public class UnaryOperatorExample02 {

	public static void main(String[] args) {
		
		int p=100;
		int q=200;
		int a=99;
		int b=101;
		
		System.out.println(--p  -  q++); // 99-200 = -101 
		System.out.println(++a  +  b++); // 100+101 = 201
		System.out.println(++p  -  --a); // 100-99 = 01

	}

}
