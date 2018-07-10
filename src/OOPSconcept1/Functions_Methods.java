package OOPSconcept1;

public class Functions_Methods {

	//object must be created to load NON Static members 
	//once Object is created all NON Static Members are loaded in that Object.
	//new is the key word to create an object.
	//obj is the reference variable,referring to the object.
	public static void main(String[] args) {
		Functions_Methods obj = new Functions_Methods();
		obj.Test();
		String s=obj.Test1();
		System.out.println(s);
		int m= obj.MUL(10, 20);
		System.out.println(m);
		int l=obj.Add();
		System.out.println(l);

	}

	// void is Return type
	// if we provide return type as void,its does not return any value
	// No input,No output.
	public void Test() {
		System.out.println("Void is return type");
	}

	// No input,Some output
	// return type will be Before Method Name
	// Return type like "byte,double,boolean,char,short,String."
	// after Return statement their should not be any other statement.
	public int Add() {
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println("Return type is int");
		return k;
	}
	public String Test1() {
		String str="selenium";
		String str1 ="MKR Y";
		System.out.println("Return type is String");
		System.out.println(str);
		return str1;
	}
	//x and y are the arguments/parameterized 
	public int MUL(int x,int y) {
		int z=x*y;
		System.out.println("returntype is int");
		return z;
		
	}

}
