package constructor;

public class NeedOF_Constructor1 {
		String model;
		int year;
		public NeedOF_Constructor1(String Model, int Year)
		{
			model = Model;
			year = Year;
		}
		
	public static void main(String[] args) {
		NeedOF_Constructor1 NC1= new NeedOF_Constructor1("Fiat", 2010);
		System.out.println(NC1.model+" "+NC1.year);
		NeedOF_Constructor1 NC2= new NeedOF_Constructor1("Tata", 2020);
		System.out.println(NC2.model+" "+NC2.year);
		NeedOF_Constructor1 NC3= new NeedOF_Constructor1("Toyota", 2018);
		System.out.println(NC3.model+" "+NC3.year);
		NeedOF_Constructor1 NC4= new NeedOF_Constructor1("Audi", 2023);
		System.out.println(NC4.model+" "+NC4.year);

	}

}
