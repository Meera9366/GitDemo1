package String;

public class String3 {

	public static void main(String[] args) {

		String s1= new String("Java");
		
		String s2 = new String("Java");
		
		String s3 = new String("Java");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		String s4 = "Java";
		
		String s5 ="Java";
		
		String s6 = "Test";
		
		System.out.println(s4==s5);
		
		System.out.println(s4.equals(s5));
	}

}
