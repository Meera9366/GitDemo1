package Arrays;

public class Duplicate_Element {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,10,20,50}; 
		
		int len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]+" ");
			}
				
		}
	}

}
