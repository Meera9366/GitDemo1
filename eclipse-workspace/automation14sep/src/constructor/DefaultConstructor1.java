package constructor;

public class DefaultConstructor1 {
	String Name;
	int No;
	public DefaultConstructor1()
	{
		
	}

	public static void main(String[] args) {
		DefaultConstructor1 dc =new DefaultConstructor1();
		DefaultConstructor1 dc1 =new DefaultConstructor1();
		dc.Test();
		//dc.Test1();
		dc1.Test1();
		
	}
	public void Test()
	{
		System.out.println(Name+" "+No);
	}
	public void Test1()
	{
		System.out.println("Second Method calling by dc1 object");
	}

}
