package typeOf_variable;

public class StaticGlobalVariable2 {
	static int no= 50;
	static String Name ="Gargee";
	public static void main(String[] args) {
		// Static Variable calling from same class
		System.out.println(no);
		System.out.println(Name);
		Demo1();
		// StaticGlobalVariable2.Demo1();
		// Static Variable calling from different class
		System.out.println(DifferentClass.Name);
		System.out.println(DifferentClass.No);
		//System.out.println(No);
		//System.out.println(Name);
	}
	public static void Demo1()
	{
		int no1= 89;
		String Name ="Maithili";
		System.out.println(no1);
		System.out.println(Name);
	}

}
