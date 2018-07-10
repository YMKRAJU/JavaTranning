package OOPSconcept1;

public class Method_OverLoading {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Method_OverLoading obj = new Method_OverLoading();
		obj.sum(10, 77.969);
		obj.sum();
		obj.sum('a');
		obj.sum(77, 33);
		Method_OverLoading.main(77077.246);// Calling by Class Name
		Method_OverLoading.main(100089);// Calling by Class Name
		main(77.3330);// Direct Call
	}

	/*->Can we Overload a main Method?????YES
	  ->We can overload a main method also.
	  ->Static Main Method Overloaded*/
	public static void main(int a) {
		System.out.println(a);
		System.out.println("main method over loaded with single argument");
	}

	/*->Static Main Method Overloaded
	 ->we can not create a method inside a method
	 ->Duplicate methods are not allowed----->i.e Same method name with same
	   arguments/parameters with in the same class*/
	public static void main(double d) {
		System.out.println(d);
		System.out.println("main method overloaded with different Data type with single arrugement");
	}
	/*
	 * Method Overloading ------>When the Method name is Same but Differs with
	 * Arguments in the same class
	 */

	public void sum() {//No arguments Passed
		System.out.println("No arguments Passed");
	}

	public void sum(char ch) {// 1 arguments Passed
		char c = 'a';
		char d = 'A';
		int total = c * d;
		System.out.println(total);
		System.out.println("Same method main with single arguments");
	}

	public void sum(int x, int y) { //2 arguments Passed
		int z = x + y;
		System.out.println(z);
		System.out.println("Same method name with 2 arguments");
	}

	public void sum(int x, double y) { // 2 different arguments Passed
		double d = x * y;
		System.out.println(d);
		System.out.println("Same method name with 2 different datatypes");
	}

}
