package javaBasics;

public class OneDimArray {

	public static void main(String[] args) {
		int i[] = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		System.out.println(i[1]);// To print the 1st index value
		// to Print all the values in Array
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println(i.length);// To find the size(length) of Array
		Object obj[] = new Object[6];
		obj[0] = "Yarragudi";
		obj[1] = 'M';
		obj[2] = "MKR";
		obj[3] = 77;
		obj[5] = 10.33;
		for (int k = 0; k < obj.length; k++) {
			System.out.println(obj[k]);
		}
		System.out.println(obj[3]);
		System.out.println(obj.length);
	}

}
