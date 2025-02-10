package typeOf_variable;

public class StaticGlobalVariable1 {
	static int number =60;	// Static Global Variable
	static String name ="Gargee";
	// Creating a Variable outside the Method/ Function is known as global variable
	public static void main(String[] args) {
		System.out.println(number);
		System.out.println(name);
		System.out.println("******************************************");
		
		Demo1();
		System.out.println("******************************************");
		StaticGlobalVariable1 sv1 =new StaticGlobalVariable1();
		sv1.Demo2();
		

	}
	public static void Demo1()
	{
		int n1 =30; // Local variable
		String Name ="Maithili";
		number=388;
		name="Mukta";
		System.out.println(n1);
		System.out.println(Name);
		System.out.println(number);
		System.out.println(name);
		 
	}
	public void Demo2()
	{
		number =89;
		name ="Chinmayee";
		System.out.println(number);
		System.out.println(name);
	}

}
