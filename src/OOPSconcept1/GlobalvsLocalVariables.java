package OOPSconcept1;

public class GlobalvsLocalVariables {
	//Global variables
	String Name = "MKR Yarragudi";
	int age = 27;
	String Company = "Info";

	public static void main(String[] args) {
		int i = 07;
		String str = "Assholes";
		//Object creation
		GlobalvsLocalVariables obj = new GlobalvsLocalVariables();		
		System.out.println(obj.Name);
		System.out.println(obj.age);
		System.out.println(obj.Company);
		//calling non static method by object reference variable
		obj.Place();
		System.out.println(str);
		System.out.println(i);
		obj.SUM();
	}
	//Non Static Method
	public void Place() {
		String place ="kadpa";
		String Address="Near sivalayam";
		int pincode=516004;
		System.out.println(place);
		System.out.println(Address);
		System.out.println(pincode);
	}
	//Non Static Method
	public void SUM() {
		int i = 77;
		int j=33;
		int k=i*j;
		System.out.println(k);
		System.out.println(i);
	}

}