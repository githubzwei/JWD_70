package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		set1.add("John");
		set1.add("John");
		set1.add("Marry");
		set1.add("David");
		set1.add("Smith");
		set1.add(null);

		System.out.println("HashSet : " + set1);

		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("John");
		set2.add("Marry");
		set2.add("David");
		set2.add("Smith");
		set2.add(null);

		System.out.println("LinkedHashSet : " + set2);

		Set<String> set3 = new TreeSet<String>();
		set3.add("John");
		set3.add("Marry");
		set3.add("David");
		set3.add("Smith");
		set3.add(null);

		System.out.println("TreeSet : " + set3);

	}
}
