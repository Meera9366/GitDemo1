package polymorphism;

public class MethodOverloading6 {
		// Main Method Overloading
		// Can We Overload Main Method  ----------->> Yes We can Overload Main Method

	public static void main(String[] args) {
		MethodOverloading6 m6 = new MethodOverloading6();
		//m6.main("Gargee");
		MethodOverloading6.main("GargeeSR");
		m6.main(98);
		m6.main('a');
		

	}
	public static void main(String s1)
	{
		System.out.println("String Input parameter Method");
		System.out.println(s1);
	}
	public void main(int i)
	{
		System.out.println("Integer Input Method");
	}
	public void main(char c)
	{
		System.out.println("Char input Method");
		System.out.println(c);
		
	}
}
