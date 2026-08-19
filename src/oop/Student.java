package oop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
	String name;
	int age;
	
	

	public Student() {
		System.out.println("Default constructor");
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.name = "Su Su";
		obj1.age = 20;
		System.out.println(obj1.name + "\n" + obj1.age);

		Student obj2 = new Student("Mg Mg", 23);
		System.out.println(obj2.name + "\n" + obj2.age);

	}

	/*
	 * @Override public String toString() { return "Student [name=" + name +
	 * ", age=" + age + "]"; }
	 */
	
	
	
}
