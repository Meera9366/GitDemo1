package MultilevelInheritence;

public class son3 extends son2{
	public void laptop()
	{
		System.out.println("Laptop---------->> Asus");
	}
	public static void main(String[] args)
	{
		son3 s3 = new son3();
		s3.laptop();
		s3.bike();
		s3.car();
		s3.home();
		s3.money();
	}

}
