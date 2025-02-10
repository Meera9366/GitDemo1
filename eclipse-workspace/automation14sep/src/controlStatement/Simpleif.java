package controlStatement;

public class Simpleif {

	public static void main(String[] args) {
		int marks =45;
		if(marks > 30)
		{
			System.out.println("Result-------------->> Pass");
		}
		if(marks>80) // False condition so this part will not execute
		{
			System.out.println("Result------------->> Distinction");
		}
		System.out.println("Program completed");
	}

}
