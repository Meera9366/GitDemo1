package MultilevelInheritence;

public class son1 extends father{
	public void bike()
	{
		System.out.println("Bike---------->> Bullet");
	}
	public static void main(String[] args)
	{
		son1 s1 = new son1();
		s1.bike();
		s1.car();
		s1.home();
		s1.money();
	}

}
