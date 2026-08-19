package jdbc;

public class InsertStudentsMain {
	public static void main(String[] args) {

		StudentBean obj = new StudentBean("Htet Htet Moe Oo", 30, "female", "Yangon");
		StudentRepository.insertStudent(obj);

		StudentRepository.getAllStudents();
	}
}
