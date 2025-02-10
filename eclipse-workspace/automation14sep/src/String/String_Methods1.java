package String;

public class String_Methods1 {

	public static void main(String[] args) {
				// charAt Function
				// Return the value of Specified Index
				String s1 = "Automation";
				System.out.println(s1.charAt(0));
				System.out.println(s1.charAt(9));
				//System.out.println(s1.charAt(20));//StringIndexOutOfBoundsException
				
				//length It return the length or Size of the String
				System.out.println(s1.length());
				
				//.equals
				String s2 = "Test";
				String s3 = "Java";
				String s4 = "Test";
				String s5 = new String("Test");
				
				System.out.println(s2.equals(s3));//false
				System.out.println(s2.equals(s4));//true
				System.out.println(s2.equals(s5));//true
				System.out.println(s2.equals(s3));
				
				//IsEmpty
				
				String s6 = "";
				String s7 ="Test1";
				
				//System.out.println(s6.charAt(0));// java.lang.StringIndexOutOfBoundsException
				System.out.println(s7.charAt(0));
				
				System.out.println(s7.isEmpty());
				
				System.out.println(s6.isEmpty());
				
				//replace
				
				String s8 = "Apple";
				System.out.println(s8);
				System.out.println(s8.replace('A', 'B'));
				System.out.println(s8);
				System.out.println(s8.replace('p', 'a'));
				System.out.println(s8);
				System.out.println(s8.replace('e', 'i'));
				
				//Split
				
				String str = "Hie Good Evening";
				String arr[] =str.split(" ");
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
				
				String arr1[] = str.split("i");
				for(int i= 0;i<arr1.length;i++)
				{
					System.out.print(arr1[i]);
				}
				
				System.out.println("**************************************************************************");
				
				
				for(String Str : arr)
				{
					System.out.println(Str);
				}
				
				
				int [] number = {1,2,3,4,5,6,8};
				int sum =0;
				for(int num : number)
				{
					System.out.println(num);
				}			
	}

}
