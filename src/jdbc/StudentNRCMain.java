package jdbc;

public class StudentNRCMain {
	public static void main(String[] args) {

		StudentNRCDTO obj = StudentRepository.getStudentInformationbyId(2);
		if (obj == null) {
			System.out.println("Student Not Found!");
		} else {
			System.out.println(obj);

		}

	}
}
