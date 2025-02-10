package constructor;

public class UserDefaultConstructor2 { // Use Define Consrtuctor
		String Model;
		String Name;
		int Price;
		String Engine;
		int Year;
		public UserDefaultConstructor2(String Model, String Name, int Price, String Engine, int Year)
		{
			this.Model = Model;
			this.Name = Name;
			this.Price = Price;
			this.Engine = Engine;
			this.Year  = Year; 
			
		}
		

	public static void main(String[] args) {
		UserDefaultConstructor2 u1 = new UserDefaultConstructor2("Fiat", "Linea", 1500000,"Fiat",2009);
		System.out.println("Car Model---------->> "+ u1.Model+ "**" +"Car Name------------>> " +u1.Name+"**"+"car Price--------->> "+u1.Price+"**"+"Car Engine------->> "+u1.Engine+"**"+"Car Year-------->> "+u1.Year);
		UserDefaultConstructor2 u2 = new UserDefaultConstructor2("tesla", "Linea", 1500000,"Fiat",2019);
		System.out.println("Car Model---------->> "+ u2.Model+ "**" +"Car Name------------>> " +u2.Name+"**"+"car Price--------->> "+u2.Price+"**"+"Car Engine------->> "+u2.Engine+"**"+"Car Year-------->> "+u2.Year);
	
	}

}
