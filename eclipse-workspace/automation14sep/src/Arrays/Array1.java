package Arrays;

//An array is a data structure that stores multiple values of the same type in a contiguous
//block of memory.
// Array is collection of similar type of data
// We Can store only fix size of set in Java Array
// Array is index based and first element of Array stores at 0th Location and Last element stores at n-1 th location i.e length of Array


public class Array1 {

	public static void main(String[] args) {
		// Single Diamensional Array
		
		int arr[] = new int[10];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
		//arr[10]=10;
		
		//Second way
		
		int A2[] = {10,20,30,40,50};
		
		int len =A2.length;
		System.out.println(len);
		System.out.println(arr[2]);
		System.out.println(A2.length);
		System.out.println(arr.length);
		
		// Array Index Out Of Bound Exception
		for(int i =0; i<11; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
