package javaBasics;

public class Concatination {

	public static void main(String[] args) {
		int i = 7;
		int j =3;
		String str = "MKR";
		String str1= "MMM";
		char ch = 'R';
		char ch1 ='M';
		System.out.println(i+j);
		System.out.println(str+str1);
		System.out.println(ch+ch1);
		System.out.println(i+" "+str1+" "+ch);
		System.out.println(str+str1+i+j);
		System.out.println(str1+(i+j));
		System.out.print("MKR ");
		System.out.println("Its a Brand");
		
		int a= 77;
		int b=33;
		if (a<b) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("a is greater");
		}
		int m=7;
		int n=13;
		int o=19;
		if (m>n & n>o) {
			System.out.println("m is greater");			
		}
		else if(n>o) {

			System.out.println("n is greater");
		}
		else {

			System.out.println("o is greater");

		}

	}

}
