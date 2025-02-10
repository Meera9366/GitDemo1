package typeOf_variable;

public class LocalVariable1 {
	// static in i =10;    Global Variable

	public static void main(String[] args) {
		// 1. variable declared inside the body of method/ function is called as Local Variable 
		LocalVariable1.Test();
		System.out.println("***************************************");
		LocalVariable1.Test1();

	}
	public static void Test()
	{
		// static int rollNumber = 20;   Static not allowed
		int rollNumber =15;		// Local NonStatic Variable
		String name = "Gargee";	// Local NonStatic Variable
		System.out.println(rollNumber);
		System.out.println(name);
		rollNumber = 80;
		System.out.println(rollNumber);
	}
	public static void Test1()
	{
		int rollNumber = 30;
		String name ="Maithili";
		System.out.println(rollNumber);
		System.out.println(name);
	}
}
