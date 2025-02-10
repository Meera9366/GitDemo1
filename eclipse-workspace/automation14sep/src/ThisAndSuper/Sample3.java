package ThisAndSuper;


//Super keyword is used to access global variable from different/super/parent class.

//The super keyword is used to refer to the superclass (parent class) members or constructors. It’s
//often used when overriding methods or to access members and constructors of the superclass.
public class Sample3 extends Sample2{
	int Roll_Number =3000;
	String Name = "Java";

	public static void main(String[] args) {
		
		Sample3 s3 =new Sample3();
		s3.Demo();
		
	}
	
	public void Demo()
	{
		int Roll_Number = 2000;
		String Name = "Selenium";
		
		System.out.println(Roll_Number);				//2000
		System.out.println(Name);						// Selenium
		
		System.out.println(this.Roll_Number);			// 3000
		System.out.println(this.Name);					// Java
		
		System.out.println(super.Roll_Number);			// 1000
		System.out.println(super.Name);               // Automation
	}

}
