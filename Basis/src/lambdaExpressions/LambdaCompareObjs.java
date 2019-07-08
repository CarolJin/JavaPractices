package lambdaExpressions;

import java.util.*;

//Compare() method working: –
//returns negative value(-1), if and only if obj1 has to come before obj2.
//returns positive value(+1), if and only if obj1 has to come after obj2.
//returns zero(0), if and only if obj1 and obj2 are equal.
//In List, Set, Map or anywhere else when we want to define our own sorting method, JVM will always call compare() method internally.
//
//When there is Functional Interface concept used, then we can use Lambda Expression at its place.

public class LambdaCompareObjs {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(205);
		al.add(102);
		al.add(98);
		al.add(275);
		al.add(203);
		System.out.println("Elements of the ArrayList " + "before sorting : " + al);
		// using lambda expression in place of comparator object
		Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println("Elements of the ArrayList after" + " sorting : " + al);

		TreeSet<Integer> h = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		h.add(850);
		h.add(235);
		h.add(1080);
		h.add(15);
		h.add(5);
		System.out.println("Elements of the TreeSet after" + " sorting are: " + h);

		//Sorting will be done on the basis of the keys and not its value.
		TreeMap<Integer, String> m = new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		m.put(1, "Apple");
		m.put(4, "Mango");
		m.put(5, "Orange");
		m.put(2, "Banana");
		m.put(3, "Grapes");
		System.out.println("Elements of the TreeMap " + "after sorting are : " + m);
	}
}
