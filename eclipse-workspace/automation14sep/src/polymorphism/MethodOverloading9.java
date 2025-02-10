package polymorphism;

public class MethodOverloading9 {

	public static void main(String[] args) {
		MethodOverloading9 m9 = new MethodOverloading9();
		m9.test(20, 98.9f);
		m9.test(88.9f,68);
		//m9.test(10,10); CTE
		//m9.test(56.9f, 78.9f); CTE
		/*Reason for Compile Time Error(CTE) : both 10 and 20 are integer values. There is no method in
		 * the class MethodOverloading9 that acceptes two integer arguments, so the compiler can not find a
		 * suitable method to call. This results in a Compile Time Error.*/

	}
	public void test(int i, float j)
	{
		System.out.println("Integer and Float Method");
	}
	public  void  test(float f, int i)
	{
		System.out.println("Float and Interger Method");
	}

}
