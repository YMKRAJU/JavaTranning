package OOPS2;

public class Schools extends Education {// Parent class

	/*
	 * When Same Method is present in Parent class as well as Child class with the
	 * same number of arguments then it is know as Method overRidding
	 */

	public void PrimaryEdu() {//OverRidden Method
		System.out.println("Schools Primary Education");
	}

	public void HigherEdu() {//OverRidden Method
		System.out.println("Schools Higher Education");
	}

	public void NarayanaSchool() {
		System.out.println("Narayana School");
	}

	public void GOVTSchool() {
		System.out.println("Govt School");
	}

	public void ModelSchool() {
		System.out.println("MOdel School");
	}

}
