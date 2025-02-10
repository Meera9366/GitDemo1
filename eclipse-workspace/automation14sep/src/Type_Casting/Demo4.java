package Type_Casting;

public class Demo4 {

	public static void main(String[] args) {

		//Implicit Casting UpCasting
		
		char charvalue = 'A';
		int intvalue = 123;
		
		System.out.println(charvalue);
		System.out.println(intvalue);
		
		//DownCasting
		
		int i1 = 120;
		byte b1 =(byte) i1;
		System.out.println(b1);
		
		float f1 =3085.8f;
		System.out.println(f1);
		
		int int1 =(int) f1;
		System.out.println(int1);
		
	}

}
