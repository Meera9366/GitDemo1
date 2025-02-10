package constructor;

public class Rule5 {
	//We can create n number of constructor in a class but cunstructor name should be as same as class name
	public Rule5()
	{
		System.out.println("Zero input Constructor");
	}
	public Rule5(int a)
	{
		System.out.println("One Input Parameter--------->> " +a);
	}
	public Rule5(int a, int b)
	{
		System.out.println("Two Input Parameter------------>> "+a +" "+b);
	}
	public Rule5(int a, String name)
	{
		System.out.println("Int and String Parameter--------------->>  "+a+"  "+name);
	}

	public static void main(String[] args) {
		Rule5 R5 = new Rule5();
		Rule5 R6 = new Rule5(10);
		Rule5 R7 = new Rule5(30,59);
		Rule5 R8 = new Rule5(48,"Gargee");

	}

}
