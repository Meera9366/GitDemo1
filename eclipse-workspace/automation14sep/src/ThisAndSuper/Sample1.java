package ThisAndSuper;

public class Sample1 {
	// This keyword is used to access global variables from same class
	int Roll_Number = 10;
	String Name = "Mukta ";

	public static void main(String[] args) {
		
		Sample1 s1 = new Sample1();
		s1.Demo();
		

	}
	public void Demo()
	{
		int Roll_Number= 50;
		String Name = "Gargee";
		
		System.out.println(Name);// Gargee
		System.out.println(Roll_Number);//50
		
		System.out.println(this.Name);// Mukta
		System.out.println(this.Roll_Number);// 10
	}
	
}
