package loop_while;

public class WhileLoop6 {
	// WAP for Multiplication of two numbers without using Multiplication Operator

	public static void main(String[] args) {
		int n1=5;
		int n2=5;
		int mul =0;
		int i=1;
		while(i<=n2)
		{
			mul=mul+n1;
			i++;
		}
		System.out.println("Multiplication is---------->> "+mul);
	}

}
