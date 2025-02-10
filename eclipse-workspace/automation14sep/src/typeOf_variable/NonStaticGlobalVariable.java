package typeOf_variable;

public class NonStaticGlobalVariable {
	static int number = 40;
	String name= "Gargee";
	public static void main(String[] args) {
		
		NonStaticGlobalVariable NS = new NonStaticGlobalVariable();
		
		NS.M1();
		
		System.out.println(DifferentClasss.nm);
		System.out.println(DifferentClasss.n1);
		
		
	}
	
	public void M1()
	{
		
		System.out.println(number);
		
		System.out.println(name);
		
		
		number= 56;
		name= "Maithili";
		
		System.out.println(number);
		
		System.out.println(name);
	}

}
