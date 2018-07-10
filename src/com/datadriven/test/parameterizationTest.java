package com.datadriven.test;

import com.Excel.utility.Xls_Reader;

public class parameterizationTest {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("C:\\S-APPS TECH\\JavaTraining\\src\\com\\testdata\\SeleniumTestData.xlsx");
		int rowcount = reader.getRowCount("RegTestData");
		System.out.println(rowcount);

	}

}
