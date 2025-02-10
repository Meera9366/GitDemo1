package polymorphism;

public class MethodOverloading1 {

	public static void main(String[] args) {
		MethodOverloading1 mo = new MethodOverloading1();
		mo.m1();
		mo.m1(30);
		mo.m1("Gargee");
		mo.m1(68, "Maithili");
		mo.m1("Mukta", 89);
		
		
	}
	public void m1()	// Zero Input Method
	{
		System.out.println("Zero input parameter Method");
	}
	public void m1(int i)	// One Input Method
	{
		System.out.println("One input Parameter Method");
		System.out.println(i);
	}
	public void m1(String name)	// One Input Method
	{
		System.out.println("One  String input Parameter Method");
		System.out.println(name);
	}
	public void m1(int i,String name)	// Two Input Method
	{
		System.out.println("Two Input integer and  String input Parameter Method");
		System.out.println(i+" "+ name);
	}
	public void m1(String name, int i)	// Two Input Method
	{
		System.out.println("Two Input String and integer input Parameter Method");
		System.out.println(name+" "+i);
	}

}
