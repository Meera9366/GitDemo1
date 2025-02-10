package polymorphism_Overriding;

public class Static_Method2 extends Ststic_Method1{

	public static void main(String[] args) {
		
		Static_Method2 s2 = new Static_Method2();
		s2.Demo3();
		Ststic_Method1 s1 = new Ststic_Method1();
		s1.Demo3();
		
		Ststic_Method1 s3= new Static_Method2();
		s3.Demo1();
		s3.Demo2();
		s3.Demo3();
	}
	
	public static void Demo3()
	{
		System.out.println("Child Demo3 Method");
	}
	
	public static void Demo2()
	{
		System.out.println("Child Demo2 Method");
	}
	
	public static void Demo1()
	{
		System.out.println("Child Demo1 Method");
	}

}
