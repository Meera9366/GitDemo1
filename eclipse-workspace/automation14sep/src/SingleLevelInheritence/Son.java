package SingleLevelInheritence;

public class Son extends Father {
	public void bike()
	{
		System.out.println("Bike---------->> Bullet");
	}
	public static void main(String[] args)
	{
		Son s1= new Son();
		s1.bike();
		s1.home();
		s1.money();
		s1.car();
	}

}
