package method2;

public class MethodParameter {

	public static void main(String[] args) {
		MethodParameter.test1();
		MethodParameter.test2();
		MethodParameter.demo(5,8);
		MethodParameter.demo(45,90);

	}
	public static void test1()// No parameter Method
	{
		int a =50;
		int b =10;
		int c =a+b; 
		System.out.println("Addition is-------------->>" +c);
	}
	public static void test2() // Zero parameter Method
	{
		int a =20;
		int b = 30;
		int c =a+b;
		System.out.println("Addition is----------->>"+c);
				
	}
	public static void demo(int x , int y)
	{
		int z= x+y;
		System.out.println("Addition by Passing Two parameter is--------------->>" +z);
	}

}
