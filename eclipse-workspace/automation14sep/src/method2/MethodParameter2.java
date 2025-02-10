package method2;

public class MethodParameter2 {

	public static void main(String[] args) {
		
		MethodParameter2.studInfo("VCTC", "Software_Testing", "Gargee", "Rokade", "gs.rokade08.gmail.com", 'A', 2020,99.9f);
	}
	public static void studInfo(String instituteName,String courseName,String firstName,String lastName,
			String mailId, char grade, int passoutYear, float percentage)
	{
		System.out.println("Institute Name-------->> "+instituteName+ "Course_Name-------->>"+courseName+
				"FirstName------------->> "+firstName+"LastName---------->> "+lastName+"Mail_Id----------->> "+mailId+
				"Grade---------->>"+grade+"Passout_Year--------->>"+passoutYear+"Percentage-------->> "+percentage);
	}

}
