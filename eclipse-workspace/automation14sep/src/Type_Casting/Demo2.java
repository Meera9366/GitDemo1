package Type_Casting;

public class Demo2 {

	public static void main(String[] args) {
		
		//Convert Higher to Lower
		
		double value = 40.2d;
		
		int i = (int) value;
		
		System.out.println(i);
		
		double dvalue = 10.5d;
		float fvalue =(float) dvalue;
		long lvalue =(long) fvalue;
		int ivalue =(int) lvalue;
		short svalue =(short) ivalue;
		byte bvalue = (byte) svalue;
		
		System.out.println("Double----------->>"+dvalue);
		System.out.println("Float----------->>"+fvalue);
		System.out.println("Long---------->>"+lvalue);
		System.out.println("Int----------->>"+ivalue);
		System.out.println("Short----------->>"+svalue);
		System.out.println("Byte----------->>"+bvalue);
	}

}
