package OOPS2;

public class OverRide_Test {

	public static void main(String[] args) {

		// Static Polymorphism (or) Compile Time polymorphism.
		ClassStandards obj = new ClassStandards();
		obj.Adults();
		obj.CollegeLevel();
		obj.SchoolLevel();
		obj.GOVTSchool();
		obj.NarayanaSchool();
		obj.ModelSchool();
		obj.PrimaryEdu();
		obj.SecondaryEdu();
		obj.HigherEdu();

		System.out.println("$$$$$$$$$$");

		// Top Casting or UP Casting
		Education e = new ClassStandards();
		// Child class object can be referred by parent class reference variable this is
		// know as Dynamic (or) RUN time polymorphism
		e.PrimaryEdu();
		e.SecondaryEdu();
		e.HigherEdu();

		System.out.println("$$$$$$$$$$");
		// Down Casting
		ClassStandards c = (ClassStandards) new Education();// ClassCastException
		c.Adults();

	}

}
