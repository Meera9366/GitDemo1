package method2;

import method1.Method1;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("Program Started here...........");
		Method4.add(); //method from class Method4 of package method1
		Method4.sub(); //method from class Method4
		Method4.mul(); //method from class Method4
		Method4.div(); //method from class Method4
		Method5.test(); //method from class Method5
		Method5.test1(); //method from class Method5
		Method8.m1();    //method from class Method8
		Method8.m2();    //method from class Method8
		Method1.test1(); //method from class Method1 of package method1
		Method1.test2(); //method from class Method1 of package method1
		System.out.println("Program Ended Here..............");
		//test1();

	}
	public static void test1()
	{
		System.out.println("Test1 Method()");
		
	}
	

}
