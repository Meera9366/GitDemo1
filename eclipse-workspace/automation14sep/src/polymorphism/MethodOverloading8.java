package polymorphism;

public class MethodOverloading8 {

	public static void main(String[] args) {
		MethodOverloading8.m1();
		MethodOverloading8.m1(99);
		MethodOverloading8.m1(100, "Gargee");
		MethodOverloading8.m1('A');

		MethodOverloading8.m1('A', 98);
		
	}
	public static void m1()
	{
		System.out.println("Zero Input Parameter Method");
	}
	public static void m1(int i)
	{
		System.out.println("One Input Parameter Method");
		System.out.println(i);
		
	}
	public static void m1(int i, String j)
	{
		System.out.println("Two Input Parameter Method");
		System.out.println(i+"    "+j);
	}
	public static void m1(char c)
	{
		System.out.println("Char Input Parameter Method");
	}
	public static void m1(char c, int i)
	{
		System.out.println("Char and Int Input Parameter Method");
	}
	

}
