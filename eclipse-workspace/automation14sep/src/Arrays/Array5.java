package Arrays;

public class Array5 {

	public static void main(String[] args) {

		Object obj[] = new Object[6];		// Heterogeneous type of data / Non similar type of Data
		obj[0] ="Gargee";
		obj[1] = 1;
		obj[2] = true;
		obj[3] = 'A';
		obj[4] = 15.8f;
		obj[5] = 88.99d;
		System.out.println(obj[4]);
		for(int i =0; i<obj.length; i++)
		{
			System.out.println(obj[i]);
		}
		
	}

}
