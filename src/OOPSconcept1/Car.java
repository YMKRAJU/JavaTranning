package OOPSconcept1;

public class Car {
	String CarCompany;
	int Model;
	String Colour;

	public static void main(String[] args) {
		Car a = new Car();
		a.Model=2017;
		a.CarCompany="BMW";
		a.Colour="Yellow";
		
		Car b = new Car();
		b.Model=2019;
		b.CarCompany="SUV";
		b.Colour="WHITE";
		
		Car c = new Car();
		c.Model=2021;
		c.CarCompany="MKR";
		c.Colour="Green";
		
		System.out.println(b.CarCompany);
		System.out.println(b.Colour);
		System.out.println(c.Model);
		

	}

}
