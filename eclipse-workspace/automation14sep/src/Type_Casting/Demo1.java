package Type_Casting;

public class Demo1 {

	public static void main(String[] args) {

		//Typecating is the process of converting one data type into another
		//UpCasting Automatically Performed by Java
		
		int num = 10;
		double result =num;
		System.out.println(result);
		
		int n1 =20;
		float f1 =n1;
		System.out.println(f1);
		
		byte ByteValue = 10;
		short shortvalue=ByteValue;
		int intvalue = shortvalue;
		long longvalue = intvalue;
		float floatvalue = longvalue;
		double doublevalue = floatvalue;
		
		System.out.println("Byte :    "+ByteValue);
		System.out.println("Short :    "+shortvalue);
		System.out.println("Int :    "+intvalue);
		System.out.println("Long :    "+longvalue);
		System.out.println("Float :    "+floatvalue);
		System.out.println("Double :    "+doublevalue);
		
	}

}
