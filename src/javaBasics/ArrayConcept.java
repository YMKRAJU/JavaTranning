package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		int i[] = new int[4];
		i[0] = 7;
		i[1] = 3;
		i[3] = 10;
		i[2] = 77;
		System.out.println(i[2]);
		System.out.println(i[0]);
		// System.out.println(i[4]);
		System.out.println(i.length);
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		char ch[] = new char[3];
		ch[0] = 'M';
		ch[1] = 'N';
		ch[2] = 'O';
		System.out.println(ch.length);
		System.out.println(ch[0]);
		for (char k = 0; k < ch.length; k++) {
			System.out.println(ch[k]);
		}
		Object obj[]=new Object[5];
		obj[0]="MKR";
		obj[1]='M';
		obj[2]=77.37;
		obj[3]=37;
		obj[4]="MANI";
		System.out.println(obj[3]);
		System.out.println(obj.length);
		for (int G = 0; G < obj.length; G++) {
			System.out.println(obj[G]);
			
		}

	}

}
