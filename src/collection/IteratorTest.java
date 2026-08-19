package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Su Su");
		list1.add("Ag Ag");
		list1.add("Hla Hla");

		/*
		 * for (String name : list1) { if (name.equals("Ag Ag")) {
		 * list1.remove("Ag Ag"); } System.out.println("Name : " + name); }
		 */

		System.out.println("size : " + list1.size());
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			//String name = itr.next();
			if (itr.next().equals("Hla Hla")) {
				itr.remove();
			}
			System.out.println("Iterator : " + itr.next());
		}
		System.out.println("size : " + list1.size() + ", " + list1);
	}
}
