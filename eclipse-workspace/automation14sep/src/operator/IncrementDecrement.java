package operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 40;
		int b = 60;
		int c;
		c = a;
		System.out.println(c);
		System.out.println(a);
		
		a++;
		System.out.println("int a increment by 1----------->>" +a);
		
		a = a+1;
		System.out.println("int a Increment by 1----------->>" +a);
		
		a+=1;
		System.out.println("int a Increment by 1--------------->>" +a);
		System.out.println("***********************************************************");
		
		b++;
		System.out.println("int b Increment by 1------------>>" +b);
		
		b = b + 590;
		System.out.println("int b Increment by 590-------------->>" +b);
		
		b--;
		System.out.println("int b Decremenr by 1-------------->>" +b);
		
		b =b-20;
		System.out.println("int b Decrement by 20-------------->> " +b);
		
		b-=10;
		System.out.println("int b Decrement by 10---------------->>"+b);
	}

}
