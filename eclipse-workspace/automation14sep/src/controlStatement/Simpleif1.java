package controlStatement;

public class Simpleif1 {

	public static void main(String[] args) {
		int x =30;
		int y =50;
		int z = x+y;   //30+50=80
		
		if(z>30)  //true
		{
			System.out.println("x+y is greater than 30");
		}
		if(z<20)   //false so following will not execute
		{
			System.out.println("x+y is less than 20");
		}
		if(true)
		{
			System.out.println("Hie");
		}
		/*if(false)   // false condition never executes
		{
			System.out.println("Hello");
		}*/

	}

}
