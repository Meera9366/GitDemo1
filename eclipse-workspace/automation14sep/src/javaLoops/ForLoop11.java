package javaLoops;

public class ForLoop11 {

	public static void main(String[] args) {
		//Multiplication of two numbers without using mul operatot
		/*int i =9;
		int j = 2;
		int k = i*j;
		System.out.println(k);*/
		int num1 =5;
		int num2 =5;
		int mul = 0;
		for( int i =1; i<=num2; i++)
		{
			mul = mul +num1;
		}
		System.out.println(mul);
		
		System.out.println("****************************************");
		int num11=8;
		int num22= 9;
		int mul1=0;
		for(int j= 1; j<=num22; j++)
		{
			mul1 = mul1+num11;
			
		}
		System.out.println(mul1);
		
		System.out.println("****************************************");
		 int num111 =10;
		 int num222= 2;
		 int mul2 =0;
		 for(int k=1; k<=num111; k++)
		 {
			 mul2 = mul2+ num222;
		 }
		 System.out.println(mul2);
		
	}

}
