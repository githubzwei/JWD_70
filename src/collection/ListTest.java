package collection;

import java.util.ArrayList;
import java.util.LinkedList;

import oop.Student;

public class ListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2.3);
		list.add('a');
		list.add("Java");
		list.add(true);
		list.add(null);
		
		System.out.println(list);
		
		String language = (String) list.get(3);
		
		boolean check = (boolean) list.get(4);
		System.out.println(list.size());
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("A");
		list1.add("1");
		
		System.out.println(list1);
		
		String letter = list1.get(2);
		
		for (String str : list1) {
			System.out.println(str);
		}
		
		if(list1.contains("C")) {
			System.out.println("result : B");
		}else {
			System.out.println("not found!");
		}
		
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(1);
		
		ArrayList<Student> list3=new ArrayList<Student>();
		
		Student obj1=new Student("Su Su", 20);
		list3.add(obj1);
		
		Student obj2=new Student();
		obj2.setName("Mg Mg");
		obj2.setAge(20);
		list3.add(obj2);
		
		list3.add(new Student("Ag Ag", 20));
		System.out.println(list3.get(0).getName()+", "+list3.get(0).getAge());
		
		
		for (Student obj : list3) {
			System.out.println(obj);
		}
		
		
	}
}
