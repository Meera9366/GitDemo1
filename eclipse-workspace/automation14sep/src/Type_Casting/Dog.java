package Type_Casting;

public class Dog extends Animal {

	public static void main(String[] args) {
		
		Dog D1 = new Dog();
		
		Animal A1 = new Dog(); //Implicit Casting
		
		Dog D2 = (Dog) new Animal(); // java.lang.ClassCastException

		
		D1.m1();

	}
	
	public void m1()
	{
		System.out.println("M1()Method calling");

	}
	
}	