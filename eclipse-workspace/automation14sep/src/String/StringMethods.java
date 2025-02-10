package String;

public class StringMethods {

	public static void main(String[] args) {
		// charAt Function
		// Return the value of Specified Index
		String s1 = "Automation";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(9));
		System.out.println(s1.charAt(20));//StringIndexOutOfBoundsException
		
		//length It return the length or Size of the String
		System.out.println(s1.length());
		
		

	}

}
