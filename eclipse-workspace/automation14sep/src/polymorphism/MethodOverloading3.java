package polymorphism;

public class MethodOverloading3 {

	public static void main(String[] args) {
		// Small Size Premitive Data Type to Large Size Data Type
		// Automatic Promotion
		MethodOverloading3 m3 = new MethodOverloading3();
		m3.Demo1();
		m3.Demo1(68);
		m3.Demo1(897899d);
		m3.Demo1(78798987l);
		m3.Demo1(89.56f);
	}
	public void Demo1()
	{
		System.out.println(" Zero Input Parameter");
		System.out.println("*********************************************");
	}
	//public void Demo1(int i)
	//{
	//	System.out.println(" One Input Parameter");
	//	System.out.println(i);
	//	System.out.println("*********************************************");
	//}
	public void Demo1(double i)
	{
		System.out.println(" Double Input Parameter");
		System.out.println(i);
		System.out.println("*********************************************");
	}
	//public void Demo1(float i)
	//{
	//	System.out.println(" Float Input Parameter");
	//	System.out.println(i);
	//	System.out.println("*********************************************");
	//}
	//public void Demo1(long i)
	//{
	//	System.out.println(" Long Input Parameter");
	//	System.out.println(i);
	//	System.out.println("*********************************************");
	//}
}
