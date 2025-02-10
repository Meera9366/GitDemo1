package Arrays;

public class Array6 {

	public static void main(String[] args) {
		
		int n1 =10;
		int n2 =20;
		int n3 = 40;
		System.out.println(n2);
		
		//Array Declaration
		// Datatype Variable Name[] = new Data type[Numbers];
		
		int arr[] =  new int[10];
		
		// Syntax
		//Arrayname[] indexnumber = value;
		// Array Initialization
		
		arr[0] =10;
		arr[1] =20;
		arr[2] =30;
		arr[3] =40;
		arr[4] =50;
		arr[5] =60;
		arr[6] =70;
		arr[7] =80;
		arr[8] =90;
		arr[9] =100;
		//arr[10] =200;
		
		System.out.println(arr[8]);
		//System.out.println(arr[10]);		//ArrayIndexOutOfBoundsException
		
		System.out.println(arr[1]);
		
		int size =arr.length;
		System.out.println(size);
	}

}
