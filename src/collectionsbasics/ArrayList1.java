package collectionsbasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add("200");
		ar.add("300");
		ar.add("400");
		ar.add("500");
		ar.add("600");
		ar.add("900");
		ar.add("700");
		ar.add("kapil");
		ar.add("rahul");

		// System.out.println(ar);
		System.out.println(ar.get(3));

		// Vc of array list is 10
		// Vc van be changed if we pas value in constructor

		// For loop

		System.out.println("------------");

		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i));
		}

		System.out.println("------------");
		// For each loop

		for (Object s : ar) {
			System.out.println(s);
		}

		System.out.println("------------");
		// streams with lambda;

		ar.stream().forEach(ele -> System.out.println(ele));

		System.out.println("------------");

		// iterator

		Iterator<Object> s = ar.iterator();

		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
