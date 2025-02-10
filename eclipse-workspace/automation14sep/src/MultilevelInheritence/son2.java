package MultilevelInheritence;

public class son2 extends son1 {
	public void mobile()
	{
		System.out.println("Mobile---------->> Iphone");
	}
	public static void main(String[] args)
	{
		son2 s2 = new son2();
		s2.mobile();
		s2.bike();
		s2.car();
		s2.home();
		s2.money();
	}

}
