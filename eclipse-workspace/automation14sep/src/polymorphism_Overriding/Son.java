package polymorphism_Overriding;

public class Son extends Father{
		@Override
		public void car()
		{
			System.out.println("Car-------->> Kia");
		}
		public void money()
		{
			System.out.println("Money 50 lack");
		}
		public void home()
		{
			System.out.println("Home----------->> 3bhk");
		}
		//@Override
		public void test()
		{
			System.out.println("Test Method");
		}
	public static void main(String[] args) {
		//refference RVN = new Objectname
		Father f1 = new Father();		// Static Binding / CTP / Early Binding
		f1.car();
		f1.money();
		f1.home();
		//f.test();
		
		Son s = new Son();
		s.car();
		s.money();
		s.home();
		s.Demo();
		s.car();
		
		Father f2 = new Son();     	// Dynamic Binding / RTP / Latebinding /Upcasting or Top calling
		f2.car();  // car ----------->> Kia
		f2.money(); //	Money 50 lack"
		f2.home();	//	Home----------->> 3bhk
		f2.car();	// Car-------->> Kia
		f2.Demo();
		//f2.test();
		
		

	}

}

