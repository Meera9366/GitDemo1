package Exceptiolingn_Hand;

import java.util.Scanner;

public class Exception_Handling2 {

	public static void main(String[] args) {

		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Data");
			System.out.println("Hello");
		}
		
		String s1 = "12345";
		String s2 = "Java";
		try
		{
			int num1 = Integer.parseInt(s2);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Hello");
		}
		
		System.out.println("Program is completed");

	}

}
