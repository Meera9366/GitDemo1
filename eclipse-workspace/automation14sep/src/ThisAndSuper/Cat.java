package ThisAndSuper;

public class Cat extends Animal{
	@Override
	public void sound()
	{
		super.sound(); // Parent Class Method will get call
		System.out.println("Cat Class Method");
	}

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.sound();
		

	}

}
