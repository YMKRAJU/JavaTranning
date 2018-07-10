package OOPSconcept1;

public class StaticNonStaticMethods {
	
	//Scope of global variables will be available across all the functions with same condition.
	String name = "MKR Yarragudi";// Non Static global variable
	static int age = 27;// Static Global variable

	public static void main(String[] args) {
		// How to call NONStatic Methods and Variables???
		StaticNonStaticMethods obj = new StaticNonStaticMethods();//Object Creation
		obj.Sum();
		obj.Testing();
		// How to call Static Methods and Variables???
		// 1.Direct call
		test();
		// 2.Calling by class Name
		StaticNonStaticMethods.Coding();
		System.out.println(obj.name);
		System.out.println(age);
		/* Can i Access Static methods by using object reference???? YES */
		obj.test();// It gives Warning

	}

	public void Sum() {
		int i = 10;
		System.out.println(i);
		System.out.println(age);
		System.out.println("Non static Method");
	}

	public void Testing() {
		String str = "Selenium";
		System.out.println(str);
		System.out.println("Non Static");
	}

	public static void test() {
		System.out.println(age);
		System.out.println("Static Method");
	}

	public static void Coding() {
		String str="Yarragudi";
		System.out.println(str);
		System.out.println(age);
		System.out.println("Static Method");
	}

}
