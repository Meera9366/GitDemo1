package javaLoops;
import java.util.Scanner;

public class ForLoop10_UserInput {

	public static void main(String[] args) {
		// Predefined class Scanner is used to take user Input
		Scanner sc = new Scanner(System.in); // Non Static class object create
		System.out.println("Enter Number");
		int num = sc.nextInt();
		for(int i = 1; i<= 10; i++)
		{
			System.out.println(num + "*" + i +"="+ num*i);
			//System.out.println(num*i);
		}
		
		
	}

}
