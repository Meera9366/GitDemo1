package ThisAndSuper;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println(12%2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i;
		
		for(i=2; i<num; i++)
			if(num%i==0)
				break;
		if(i==num)
		{
			System.out.println("Prime Number");
			//System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}

}
