package typeOf_variable;

public class LocalVariable2 {

	public static void main(String[] args) {
		LocalVariable2 lv2 = new LocalVariable2();
		lv2.Demo1();
		System.out.println("**********************************");
		//lv2.Demo2(); Warning
		LocalVariable2.Demo2();
		Demo2();

	}
	public void Demo1()
	{
		int num =6;
		float f1 =  5.8f;
		String name = "Gargee";
		
		double d1 = 55.90d;
		System.out.println(num);
		System.out.println(f1);
		System.out.println(name);
		System.out.println(d1);
	}
	public static void Demo2()
	{
		int i =10;
		String name= "Maithili";
		System.out.println(i);
		System.out.println(name);
	}

}
