package loop_while;

public class WhileLoop5 {

	public static void main(String[] args) {
		System.out.println("Print Number uing For Loop");
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("Print Number using While Loop");
		int j =1;
		while(j<=10)
		{
			System.out.println(j);
			j++;
		}
		System.out.println("Using For Loop");
		int num=15;
		for(int i1=1; i1<=10;i1++)
		{
			System.out.println(num+"*"+i1+"= "+num*i1);
		}
		System.out.println("15 Table using While Loop");
		int no1= 1;
		int no2=15;
		while(no1<=10)
		{
			System.out.println(no2+"*"+no1+"= "+no2*no1);
			no1++;
		}
	}

}
