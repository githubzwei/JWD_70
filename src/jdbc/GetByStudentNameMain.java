package jdbc;

import java.util.List;
import java.util.Scanner;

public class GetByStudentNameMain {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = scan.nextLine();
		List<StudentBean> list = StudentRepository.getStudentsByName(name);
		if (list.isEmpty()) {
			System.out.println("Student Not Found!");
		} else {
			System.out.println(list);
		}

	}
}
