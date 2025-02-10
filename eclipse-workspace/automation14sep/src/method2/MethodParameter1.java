package method2;

public class MethodParameter1 {

	public static void main(String[] args) {
		MethodParameter1 obj = new MethodParameter1();
		obj.studentInfo("Gargee");
		
		obj.studentInfo1("Rokade");
		
		obj.age1(4);

	}
	public void studentInfo(String firstName )
	{
		System.out.println("First Name is----------->> "+ firstName);
	}
	
	public void studentInfo1(String LastName )
	{
		System.out.println("Last Name is----------->> "+ LastName);
	}
	public void age1(int age)
	{
		System.out.println("Age is------------>>" +age);
	}
	
}
