package Arrays;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		//int arr[] = new int[10];
		boolean [] B1 = new boolean[5];
		B1[0] = true;
		B1[4] = false;
		
		System.out.println(B1[0]);		//true
		System.out.println(B1[2]);		//false
		System.out.println(B1[4]);		//false
		
		char ch[] = new char[4]; 
		ch[0]= 'A';
		ch[1]= 'C';
		ch[2]= 'D';
		ch[3]= 'B';
		//ch[4]= 'E';
		
		System.out.println("Before Sort");
		for(int i =0;i<=ch.length-1; i++)
		{
			System.out.println(ch[i]+ " ");
		}
		
		System.out.println();
		//for(int i = ch.length-1; i>=0; i--)
		//{
		//	System.out.println(ch[i] +" ");
		//}
		Arrays.sort(ch);
		for(int i =0; i<=ch.length - 1; i++ )
		{
			System.out.println(ch[i]+" ");
		}
	}

}
