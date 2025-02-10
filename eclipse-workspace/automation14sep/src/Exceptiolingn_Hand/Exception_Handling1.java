package Exceptiolingn_Hand;

import java.util.Scanner;

public class Exception_Handling1 {

	public static void main(String[] args) {


		/*System.out.println("Program is started");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");//89
		int num = sc.nextInt();
		System.out.println(100/num); // java.lang.ArrayIndexOutOfBoundsException
		System.out.println("Program Completed");
		
		
		
		int arr[] = new int[5];
	//	arr[5]=40;
		System.out.println("Enter a position (0-4) ");
		int test = sc.nextInt();
		System.out.println("Enter a Value");
		int test1 = sc.nextInt();
		arr[test]=test1;
		System.out.println(arr[test]);
		System.out.println("Program is Completed");*/
		
		String s1 ="12345";
		String s2 ="Java";
		int num1 = Integer.parseInt(s1);
		//int num2 = Integer.parseInt(s2);// java.lang.NumberFormatException:
		
		System.out.println(num1);
		//System.out.println(num2);
		System.out.println("Program Completed");
		
		String s4 = "";
		String s5 = null;// java.lang.NullPointerException:
		System.out.println(s4.length());
		System.out.println(s5.length());// java.lang.NullPointerException:
		
	}

}
