package polymorphism_Overriding;

public class FinalMethod2 extends FinalMethod1 {

	public static void main(String[] args) {
		int test = 10;
		System.out.println(test);
		
		
	}
	//@Override
	//public final void Demo1()
	//{
	//	System.out.println("Demo1 Method from FinalMethod1 class ");
	//}
	@Override
	public void Demo3()
	{
		System.out.println("Demo3 Method From FinalMethod1 Class");
	}

}
