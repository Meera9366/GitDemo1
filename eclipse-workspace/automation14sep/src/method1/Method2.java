package method1;

public class Method2 {

	public static void main(String[] args) {
		System.out.println("Main MEthod Started........");
		// Calling by class_name.method_name();
		Method2.Automation();
		Method2.Java();
		Method2.Software_testing();
		// Calling Direct by method_name();
		Automation();
		Java();
		Software_testing();
		System.out.println("Main MEthod Ended........");
		
		

	}
	public static void Automation()
	{
		System.out.println("Automation Testing");
	}
	public static void Software_testing()
	{
		System.out.println("Softwate Testing");
		
	}
	public static void Java()
	{
		System.out.println("Java");
	}

}
