package constructor;

public class Student 
	{
	String Name;  //Global non static variable
	int Roll_number; //
	public Student(String name, int roll_number) // constructor
	{
		Name =name;
		Roll_number = roll_number;
	}
		

	//Need of Constrctor
	//Once we create an object compulasry we required to perform initialization for that object
	// If Your not performing initialization then object is not ressponding correct output
	public static void main(String[] args) 
	{
		Student s1 =new Student("Gargee" , 1);
		Student s2 = new Student("Meera" ,2);
		Student s3 = new Student("Radhika" ,24);
		Student s4 = new Student("maithili" ,49);
		Student s5 = new Student("Mishty" ,39);
		//:
		//	: We can create n number of object
		System.out.println(s1.Name+" "+s1.Roll_number);
		System.out.println(s2.Name+" "+s2.Roll_number);
		System.out.println(s3.Name+" "+s3.Roll_number);
		System.out.println(s4.Name+" "+s4.Roll_number);
		System.out.println(s5.Name+" "+s5.Roll_number);
		
		// Who is responsible for initializing object ------------->> Constructor
	}

}
