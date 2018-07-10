package javaBasics;

public class TwoD_Array {

	public static void main(String[] args) {
		String str[][] = new String[3][4];// TWO Dim Array
		System.out.println(str.length);// to find total number of rows=[3]
		System.out.println(str[0].length);// To find total number of column=[2]

		// 1st Row
		str[0][0] = "YARRAGUDI";
		str[0][1] = "MKR";
		str[0][2] = "RAJU";
		str[0][3] = "MANIKANTA";

		// 2nd Row
		str[1][0] = "YARRAGUDI1";
		str[1][1] = "MKR1";
		str[1][2] = "RAJU1";
		str[1][3] = "MANIKANTA1";

		// 3rd Row
		str[2][0] = "YARRAGUDI2";
		str[2][1] = "MKR2";
		str[2][2] = "RAJU2";
		str[2][3] = "MANIKANTA2";

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (int row = 0; row < str.length; row++) {
			for (int col = 0; col < str[0].length; col++) {
				System.out.println(str[row][col]);
			}
			System.out.println("***********");

		}
	}

}
