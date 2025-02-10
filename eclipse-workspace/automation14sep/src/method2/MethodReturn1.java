package method2;

public class MethodReturn1 {

	public static void main(String[] args) {
		System.out.println("Program Started..........");
		MethodReturn1.test(5);
		int numbers = MethodReturn1.test(5);
		System.out.println("Square of Number is------------>>" + numbers);
		System.out.println("*******************************************************");
		MethodReturn1.sum(50);
		int Number1 = MethodReturn1.sum(50);
		
		System.out.println("Addition is --------------->> "+ Number1);
		MethodReturn1 obj = new MethodReturn1();
		obj.sub(40,50);
		int Subtraction = obj.sub(40,50);
		System.out.println("Subtraction is--------------->> "+Subtraction);
		System.out.println("*******************************************************");
		
		MethodReturn1 obj2 = new MethodReturn1();
		obj2.div(80,2);
		int Division = obj2.div(80,2);
		System.out.println("Division is---------------->> "+Division);
		System.out.println("*******************************************************");
		 
		MethodReturn1 obj3 = new MethodReturn1();
		int Multiplication = obj3.mul(numbers, Number1);
		System.out.println("Multiplication --------------->> " +Multiplication);
		System.out.println("*******************************************************");
		
		
	}
	public static int test(int num)
	{
		return num * num;
	}
	public static int sum(int num)
	{
		return 10 + num;
	} 
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int div(int x, int y)
	{
		return x/y;
	}
	public int mul(int num1, int num2)
	{
		return num1 * num2;
	}

}
