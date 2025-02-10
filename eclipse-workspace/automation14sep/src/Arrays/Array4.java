package Arrays;

public class Array4 {

	public static void main(String[] args) {

		String str [] = new String[4];
		//String str1 [] = new String[4];
		//String str2 [] = new String[4];
		
		str[0] ="Gargee";
		str[1] ="Mishti";
		str[2] ="Mukta";
		str[3] ="sssss";
		//str[3] ="aaaaa";
		
		System.out.println(str[0]);
		System.out.println(str[3]);
		
		for(int test =0; test<= str.length-1;test++)
		{
			System.out.println(str[test]);
		}
	}

}
