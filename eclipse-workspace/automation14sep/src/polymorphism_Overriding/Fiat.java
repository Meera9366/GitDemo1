package polymorphism_Overriding;

public class Fiat extends Car{
		public void TheftSafty()
		{
			System.out.println("Fiat Theftsafty");
		}
		@Override
		public void start()
		{
			System.out.println("Fiat Start");
		}
		public void stop()
		{
			System.out.println("Fiat Stop");
		}
		public void Demo()
		{
			System.out.println("Fiat Demo Method");
		}
		public void refuel()
		{
			System.out.println("Fiat Refuel");
		}
	public static void main(String[] args) {
		Car C1 = new Car();
		C1.start();
		C1.stop();
		C1.refuel();
		C1.M1();
		
		
		Fiat F1 = new Fiat();	// Static Binding / CTP / Early Binding
		F1.TheftSafty();
		F1.start();
		F1.stop();
		F1.refuel();	
		F1.Demo();
		F1.M1();
		
		
		Car C = new Fiat();		// Dynamic Binding / Runtime Polymorphism / Late Binding / Upcasting or  TopCasting
		C.start();		// Fiat Start
		C.stop();      // Fiat Stop
		C.refuel();		// Fiat  Refuel
		C.M1();        // Car M1 Method
		//C.TheftSafty();
		Fiat F =(Fiat)new Car();	// Down Casting  -------------->>  ClassCastException
		F.start();
		

	}

}
