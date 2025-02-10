package Exceptiolingn_Hand;

public class Exception_Handling3 {

	public static void main(String[] args) {
		
		System.out.println("Program is Started");
		
		String s1 = null;
		try {
			System.out.println(s1.length());
		}
		catch(ArithmeticException e){
			
			e.getMessage();
			System.out.println("Handle Exception 1");
			
		}
		catch(NumberFormatException e) {
			
			e.getMessage();
			System.out.println("Handle Exception 2");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			e.getMessage();
			System.out.println("Handle Exeption 3");
			
		}
		
		catch(Exception e) {
			
			e.getMessage();
			System.out.println("Handle Exception4");
		}
		
		System.out.println("Program is Completed");
	}

}
