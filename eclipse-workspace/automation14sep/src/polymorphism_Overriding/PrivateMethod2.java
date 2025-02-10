package polymorphism_Overriding;

public class PrivateMethod2 extends PrivateMethod1{
	// Private Method access only within same class and Method
	
		//@Overrride
		private void M1()
		{
			System.out.println("Private Method M1 fromm Private Method2");
		}
		public void m11()
		{
			System.out.println("Public Method");
		}
	public static void main(String[] args) {
		PrivateMethod2 P2 = new PrivateMethod2();
		P2.M1();
		
		PrivateMethod1 P1 = new PrivateMethod2();
		//P1.M1();
		//P1.M3();
		P2.m11();
		

	}

}

