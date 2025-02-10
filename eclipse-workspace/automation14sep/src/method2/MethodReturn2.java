package method2;

public class MethodReturn2 {

	public static void main(String[] args) {
		MethodReturn2 obj = new MethodReturn2();
		String Name = obj.test("Gargee");
		System.out.println("Name is--------------->>" + Name);
		
		MethodReturn2 obj1 = new MethodReturn2();
		//obj1.test1();
		int value = obj1.test1();
		System.out.println(value);
		System.out.println("********************************************************");
		MethodReturn2 obj2 = new MethodReturn2();
		float Value1 = obj2.test2();
		System.out.println(Value1);

	}
	public String test(String name)
	{
		return name;
	}
	public int test1()
	{
		System.out.println("test1 Method Return ----------------->>");
		return 40;
	}
	public float test2()
	{
		System.out.println("Test2 Method Return-------------->> ");
		return 50.56f;
		
	}
}
