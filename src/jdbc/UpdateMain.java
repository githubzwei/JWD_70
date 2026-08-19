package jdbc;

public class UpdateMain {
	public static void main(String[] args) {

		StudentBean obj = StudentRepository.getStudentbyId(2);
		if (obj == null) {
			System.out.println("Student Not Found!");
		} else {
			System.out.println("Before update : ");
			System.out.println(obj);

			obj.setAddress("Mandalay");
			obj.setName("Mg Ag Myo");

			StudentRepository.updateStudent(obj);
			System.out.println("After update : ");
			System.out.println(StudentRepository.getStudentbyId(obj.getId()));

		}

	}
}
