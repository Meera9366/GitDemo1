package String;

public class String_Methods2 {

	public static void main(String[] args) {

		//
		
		String s1 = "JAVA";
		String s2 = "java";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		String s3 = "Velocity Classes     ";
		
		System.out.println(s3.length());
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(5));
		System.out.println(s3.substring(4, 8));
		System.out.println(s3.substring(9, 16));
		System.out.println(s3.substring(12));
		
		String s4 = "Velocity Classes java Testing";
		System.out.println(s4.length());
		System.out.println(s4.indexOf('c'));
		System.out.println(s4.indexOf('s'));
		System.out.println(s4.indexOf('c',s4.indexOf('c')+2));
		System.out.println(s4.indexOf('c', s4.indexOf('c')+1)+1);
		
		//LowerCase
		
		String s5 = "JAVA";
		System.out.println(s5.toLowerCase());
		
		//ToUpperCase
		
		String s6 = "java";
		System.out.println(s6.toUpperCase());
		
		//Trim 
		//Its remove Starting or ending Spaces
		
		String s7 = "    Velocity Testing Classes     ";
		System.out.println(s7.trim());
		
		//Trim, charAt,SubString,Split
		
		String s8 = "12/12/2024";
		
		String [] date = s8.split("/");
		for(String num : date)
		{
			System.out.println(num);
		}
		
		String s9 = "Hello";
		String s10 ="Java";
		int i = 10;
		int j = 20;
		System.out.println(s9+s10);//HelloJava
		System.out.println(i+j);//30
		System.out.println(s9+s10+i+j);//HelloJava1020
		System.out.println(i+j+s9+s10);//1020HelloJava
		System.out.println(s9+s10+(i+j));//HelloJava30
		
	}

}
