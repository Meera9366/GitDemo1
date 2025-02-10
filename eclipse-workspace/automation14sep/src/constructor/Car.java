package constructor;

public class Car {
	String Model;
	int Year;
	public Car()
	{
		Model="Fiat";
		Year=2009;
	}
	public Car(String model, int year)
	{
		Model =model;
		Year =year;
	}

	public static void main(String[] args) {
		Car c1 =new Car();
		c1.display();
		//System.out.println("Model--------->> "+Model + "Year---------->> "+Year);
		Car c2 =new Car("Tata", 2023);
		c2.display();
	}
	public void display()
	{
		System.out.println("Model--------->> "+Model + "Year---------->> "+Year);

	}

}
