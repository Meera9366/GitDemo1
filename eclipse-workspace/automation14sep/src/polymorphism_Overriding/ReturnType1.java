package polymorphism_Overriding;

public class ReturnType1 {
	/*
	 * Child class return type is allowed object to String
	 * Object-------->> Object/ String / StringBuffer / StringBuilder
	 * String ------------->> Object ----- Not Allowed
	 * int     -------------->> Double / Long   Only Applicable Object Type
	 * @return*/
	
		public Object Demo1()
		{
			System.out.println("Return Type 1 Demo1 Method");
			return null;
		}
		public String Demo2()
		{
			System.out.println("Return Type 1 Demo2 Method");
			String s1  = "Test";
			return s1;
		}
		public int Demo3()
		{
			System.out.println("Return Type 1 Demo3 Method");
			int t1 = 90;
			return t1;
		}

}
