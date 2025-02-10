package method2;

public class MethodNS1 {

	public static void main(String[] args) {
		System.out.println("Program Started Here..............");
		System.out.println("");
		//Non Static Regular Method calling from same class
		// Object Creation Syntax
		// Class_name Rrefference_Variable_Name = new class_name();
		//Refference_Variable_Name.method_name();
		MethodNS1 obj = new MethodNS1();
		obj.test1();
		obj.test2();
		System.out.println("");
		
		System.out.println("******************************************************************");
		System.out.println("");
		
		MethodNS2 obj2 = new MethodNS2();
		obj2.add();
		obj2.sub();
		obj2.mul();
		obj2.div();
		System.out.println("");
		
		System.out.println("******************************************************************");
		System.out.println("");
		
		MethodNS3 obj3 = new MethodNS3();
		obj3.demo1();
		obj3.demo2();
		
		System.out.println("");
		System.out.println("Program Ended Here................");

	}
	public void test1()
	{
		System.out.println("Test1() method from class MethodNS1");
	}
	public void test2()
	{
		System.out.println("Test2() method from Class MethodNS1");
	}
}
