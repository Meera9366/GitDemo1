package polymorphism;

public class MethodOverloading5 {

	public static void main(String[] args) {
		MethodOverloading5 m5 = new MethodOverloading5();
		m5.Demo("Gargee");// String Method Calling
		m5.Demo("Maithili");// String Method Calling
		m5.Demo("Gargeee");// String Method Calling
		StringBuffer sb1 = new StringBuffer();
		m5.Demo(sb1);	//StringBuffer Method Calling
		/* Reason for compile time error  if You uncomment this line You will get compile time error
		 * this is because null can match either the String or StringBuffer method and Java can not determine
		 * which one to call. Since Both Methods are equally valid for null (as both are Strng and StringBuffer are refference Type)
		 * the Compiler faces ambiguity and can not choose between them.*/
		
	}
	public void Demo(String str)
	{
		System.out.println("String Method Calling");
	}
	public void Demo(StringBuffer str)
	{
		System.out.println("StringBuffer Method Calling");
	}

}
