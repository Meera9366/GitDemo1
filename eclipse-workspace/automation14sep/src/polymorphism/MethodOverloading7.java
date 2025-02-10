package polymorphism;

public class MethodOverloading7 {

	public static void main(String[] args) {
		MethodOverloading7 m7 = new MethodOverloading7();
		int i=m7.m1();
		System.out.println(i);
		String str1=m7.m1("Gargee");
		System.out.println(str1);
		int j=m7.m2();
		System.out.println (j);
		

	}
	public int m1()
	{
		return 10;
	}
	public String m1(String str)
	{
		String s1= str;
		return s1;
	}
/*	public int m1()  We can not overload method by changing only return type
	{
		return 20;
	*/
	public int m2()
	{
		return 20;
	}
}
