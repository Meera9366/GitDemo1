package polymorphism_Overriding;

public class AccessModifierOverridind2 extends AccessModifierOverriding {

	public static void main(String[] args) {
		AccessModifierOverriding am1 =new AccessModifierOverridind2();
		am1.Test1();
		AccessModifierOverriding am2 = new AccessModifierOverriding();
		am2.Test1();
		AccessModifierOverridind2 abs =(AccessModifierOverridind2) new AccessModifierOverriding();
		//java.lang.classcastException
	}
	
		/*
		 * @Overrride 
		 * protected void Test1()
		 * {
		 * 		System.out.println("Child class Method Test1()");
		 * }
		 * public void Test3()
		 * {
		 * 		System.out.println("Protected Method Test3()");
		 * }
		 * private void Test3()
		 * {
		 * 		System.out.println("Protected Method Test3()"); // Can not reduce the visibility of iniherited method from AccessModifierOverrriding
		 * }*/
		
		public int m1()
		{
			return 10;
		}
		public String m2(int  i)
		{
			String s1 ="Test"; 
			return s1;
		}
		
	

}
