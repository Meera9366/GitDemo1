package Arrays;

public class Array8 {

	public static void main(String[] args) {

		int arr[][]= new int[4][3];
		
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
		int arr1[][]= {{1,2,3},{3,4,5},{5,6,7},{55,88,99}};
		System.out.println(arr1.length);
		System.out.println(arr1[2].length);
		
		int col= arr1[3].length;
		System.out.println(arr1[0][2]);
		
		for(int Row =0; Row<arr1.length;Row++)
		{
			
			for(int Col=0;Col<col;Col++)
			{
				System.out.print(arr1[Row][Col]+" ");
			}
			
			System.out.println();
		}

	}

}
