package polymorphism_Overriding;

public class AccessModifierOverriding {
	
			// While performing the overriding we cant reduce the scope of Access Modifier but we can increase the Scope of the Access 
			// Modifier
			// Private------>> Protected---------->> Default--------->> Public
			public void Test1()
			{
				System.out.println("Public Method Test1()");
			}
			
			public void Test2()
			{
				System.out.println("Public Method Test2()");
			}
			protected void Test3()
			{
				System.out.println("Protected Method Test3()");
			}

}
