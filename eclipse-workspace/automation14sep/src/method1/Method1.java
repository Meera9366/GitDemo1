package method1;

public class Method1 {

	public static void main(String[] args) {
		//types of method
		//1. Predifened Method eg. main();
		//2. User Defined Method eg. test();
		//Without main main() method we cant call or execute user defined method
		 System.out.println("Main Method Started");
		 // Direct calling by method() name;
		 test1();
		 test2();
		 System.out.println("Main Method Ended");

	}
	public static void test1()
	{
	System.out.println("Test1 method");
	}
	public static void test2()
	{
		System.out.println("Method test2");
	}
	

}
