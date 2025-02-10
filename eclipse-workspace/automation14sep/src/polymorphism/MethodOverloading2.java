package polymorphism;

public class MethodOverloading2 {

	public static void main(String[] args) {
		MethodOverloading2.addition(89,"Gargee");
		MethodOverloading2.addition(456, 123, "Gargee");
		}
	public void addition(int i, int j)
	{
		int add = i+j;
		System.out.println("Addition of Two Numbers------------>>  "+add);
	}
	public static void addition(int i, String name)
	{
		System.out.println(i+name);
		System.out.println("Two Input Parameter");
	}
	public static void addition(int i, int j, String name)
	{
		System.out.println(i+" "+" "+j+" "+name);
		System.out.println(name+" "+i+" "+j);
		System.out.println("Three Input Parameter Method");
	
	}
	

}
