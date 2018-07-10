package CollectionsConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("MKR");
		ll.add("Selenium");
		ll.add(1, "Yarragudi");
		System.out.println("Context is " + ll);
		ll.addLast("Raju");
		ll.addFirst("ARK");
		System.out.println("Conext after adding 1st and Last: " + ll);
		ll.remove(2);
		System.out.println("Context after Removing :" + ll);
		ll.removeLast();
		ll.removeFirst();
		System.out.println("Context after Removing 1st and Last :" + ll);
		ll.add("43/132");
		ll.add("Prakash nagar");
		System.out.println("Context is " + ll);
		ll.getFirst();
		ll.getLast();
		ll.set(1, "Near Sivalayam");
		System.out.println("Context is " + ll);

		// To print all values of LinkedList
		// 1.For loop
		System.out.println("BY using For loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("************************");
		// 2 For each loop (or) Advance for loop
		System.out.println("BY using For each loop (or) Advance for loop");
		for (String str : ll) {
			System.out.println(str);
		}
		System.out.println("***********************");
		// 3.by Using Iterator
		System.out.println("BY using Iterator");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("***************");
		//4. By using while loop
		System.out.println("By using While loop");
		int num=0;		
		while (ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
			
		}

	}

}
