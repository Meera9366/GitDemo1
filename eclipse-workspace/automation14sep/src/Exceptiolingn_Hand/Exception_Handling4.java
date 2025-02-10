package Exceptiolingn_Hand;

public class Exception_Handling4 {

	public static void main(String[] args) {


			System.out.println("Program is Started");
			String s1 ="";
			try {
				System.out.println(s1.length());
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.getMessage();
				System.out.println("Catch Block Handles Exception");
			}
			finally {
				
				System.out.println("You Entered in a FINALLY Block");
			}
	}

}
