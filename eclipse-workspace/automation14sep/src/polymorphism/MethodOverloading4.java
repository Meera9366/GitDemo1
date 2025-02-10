package polymorphism;

public class MethodOverloading4 {

	public static void main(String[] args) {
		MethodOverloading4 m4 = new MethodOverloading4();
		Object obj1 = new Object();
		m4.Demo(obj1); //Object method calling
		m4.Demo("Gargee"); //String Method calling
		m4.Demo(null);     //Object Method Calling
		m4.Demo("Maithili");
		/*m4.demo(null); output = String Method calling
		 * When the method is calling with null, java tries to determine the appropriate method
		 * based on the available overloaded methods. Since String is moreSpecific than object.
		 * that is String is Subclass of Objects, The demo(String str) method is selected for null*/
		
	}
	public void Demo(Object obj)
	{
		System.out.println("Object Method Calling");
	}
	public void Demo(String str)
	{
		System.out.println("String Method Calling");
	}

}
