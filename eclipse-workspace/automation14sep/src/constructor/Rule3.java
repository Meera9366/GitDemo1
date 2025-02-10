package constructor;

public class Rule3 {
	//You should not declare any return type for the constructor (like void).
	// or No return type : Constructor do not have any return type.
	// By mistake if You have added void in the Constructor creation time so Compiler will treat as amethod .
		public void Rule3() // Treat as a Method .
		{
			System.out.println("Hello");
		}

	public static void main(String[] args) {
		Rule3 R3 = new Rule3();
		R3.Rule3();

	}

}
