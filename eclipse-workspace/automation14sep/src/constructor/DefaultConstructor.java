package constructor;

public class DefaultConstructor {
	String Name;
	int no;
	// public DefaultConstructor(){
	//super();
	//}
	// Rules of Default Constructor
	// It alwats Zero input or Parameter constructor
	// Accessmodifier of the default constructor is always same as a class modifier
	// Default modifier contain only one line that is super() call

	public static void main(String[] args) {
		DefaultConstructor dc =new DefaultConstructor();
		dc.Test();
		
	}
	public void Test()
	{
		System.out.println(Name+" "+no);
	}

}
