package javaBasics;

import java.util.ArrayList;

public class ArrayList_Concept {

	public static void main(String[] args) {
		/*
		 * Arrays are fixed in nature 
		 * ArrayList can contain Duplicate values
		 * ArrayList is not Synchronized Maintains Insertion 
		 * Order allows random access to fetch the values because it stores the value based on index
		 */

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("MKR");
		ar.add('M');
		ar.add(77.33);

		System.out.println(ar.size());//to get the size of ArrayList
		System.out.println(ar.get(2));//To get the value of index 
		ar.add(300);
		ar.add(700);

		System.out.println(ar.size());
		ar.remove(4);
		ar.add("MKR Yarragudi");
		System.out.println(ar.size());
		//To print all the values of ArrayList
		//By using For loop
		System.out.println("By using ForLoop");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//To print all the values of ArrayList
		//By using For each loop
		System.out.println("By using For each Loop");
		for (Object obj : ar) {
			System.out.println(obj);
		}

		// if we want to restrict values
		// like we want only Integer values then we have to write like this,
		// not only for integers for any DataType values.
		
		//Generic ArrayList
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(10);
		ai.add(20);
		System.out.println(ai.size());

		ArrayList<String> as = new ArrayList<String>();
		as.add("Raju");
		as.add("Vara Lakshmi");

		as.remove(0);
		for (int j = 0; j < as.size(); j++)
			System.out.println(as.get(j));
		System.out.println(as.size());
	}

}
