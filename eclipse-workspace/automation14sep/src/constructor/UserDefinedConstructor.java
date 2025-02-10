package constructor;

public class UserDefinedConstructor {
	int n1;
	int n2;
	int Addition;
	public UserDefinedConstructor()
	{
		System.out.println("Zero Input Parameter Constructor");
	}
	public UserDefinedConstructor(int no1, int no2)
	{
		n1=no1;
		n2=no2;
		Addition= n1+n2;
	}
	public static void main(String[] args) {
		UserDefinedConstructor UD1= new UserDefinedConstructor();
		UserDefinedConstructor UD2= new UserDefinedConstructor(50,80);
		System.out.println(UD2.n1+" "+UD2.n2);
		System.out.println(UD2.Addition);
		UD2.Demo();
	}
	public void Demo() {
	System.out.println(n1+" "+n2);
	System.out.println(Addition);
	}

}
