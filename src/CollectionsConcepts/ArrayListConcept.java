package CollectionsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		/*
		 * Arrays are fixed in nature ArrayList can contain Duplicate values ArrayList
		 * is not Synchronized Maintains Insertion Order
		 */
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 11;
		a[2] = 12;
		a[3] = 10;
		// a[4]=13; OutofBoundException
		System.out.println(a.length);

		for (int i : a) {
			System.out.println(i);
		}

		// ArrayList Method
		// Non Generic
		ArrayList ar = new ArrayList();
		ar.add("MKR");
		ar.add(77);
		ar.add('M');
		ar.add("selenium");
		System.out.println(ar.size());
		ar.add(10.77);
		ar.add("Yarragudi");
		//To remove value by index
		ar.remove(3);
		ar.remove(1);
		System.out.println(ar.size());

		// Print all values
		for (Object obj : ar) {
			System.out.println(obj);

		}

		// if we want to restrict values
		// like we want only Integer values then we have to write like this,
		// not only for integers for any DataType values.

		// Generic ArrayList
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(10);
		ai.add(20);
		System.out.println(ai.size());

		ArrayList<String> as = new ArrayList<String>();
		as.add("Raju");
		as.add("Vara Lakshmi");
		as.add("Selenium");
		System.out.println(as.size());

		// Creating Employee Class Objects
		Employee e = new Employee("Raju", 22, "B.Tech", 45879);
		Employee e1 = new Employee("Raghu", 21, "B.Tech", 25413);
		Employee e2 = new Employee("Mani", 23, "B.Tech", 5237);

		// Creating ArrayList
		ArrayList<Employee> ae = new ArrayList<Employee>();
		ae.add(e1);
		ae.add(e2);
		ae.add(e);
		System.out.println("****************");

		// Using Iterator
		Iterator<Employee> it = ae.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println("**********");
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.orgination);
			System.out.println(emp.id);
		}
		//Generic 
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Selenium");
		ar1.add("Naveen Automation");
		ar1.add("labs");
		
		//Add all 
		ar1.addAll(as);
		for (String str : ar1) {
			System.out.println(str);			
		}
		System.out.println("*********");
		
		ArrayList<String> as1 = new ArrayList<String>();
		as1.add("Raju");
		as1.add("Vara Lakshmi");
		as1.add("Selenium");
		System.out.println("**********");
		
		//To Retain (Same values must be present)
		ar1.retainAll(as1);
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		

	}

}
