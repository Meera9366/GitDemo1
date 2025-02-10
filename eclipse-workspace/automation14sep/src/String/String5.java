package String;

public class String5 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Python";
		String s3 = "Java";
		
		System.out.println(s1==s3); // true
		
		System.out.println(s1.equals(s3));// true
		
		String s4 = new String ("Java");
		String s5 = new String ("Automation");
		String s6 = new String ("Java");
		
		System.out.println(s4==s6);// true
		
		System.out.println(s4.equals(s6));//true

	}

}
