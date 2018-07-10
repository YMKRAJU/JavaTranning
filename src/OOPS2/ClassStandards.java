package OOPS2;

public class ClassStandards extends Schools {// Child class
	
	/*
	 * When Same Method is present in Parent class as well as Child class with the
	 * same number of arguments then it is know as Method overRidding
	 */

	public void GOVTSchool() {// OverRidden Method.
		System.out.println("Govt School Belongs to School");
	}

	public void SchoolLevel() {
		System.out.println("Till 10th Class Students");
	}

	public void CollegeLevel() {
		System.out.println("Inter Class Students");
	}

	public void Adults() {
		System.out.println("After Inter Class Students");
	}

}
