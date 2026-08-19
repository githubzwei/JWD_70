package jdbc;

public class SoftDeleteMain {
public static void main(String[] args) {
	System.out.println("before soft delete: ");
	StudentRepository.getAllStudents();
	
	StudentRepository.softDeleteStudent(1);
	System.out.println("after soft delete: ");
	StudentRepository.getAllStudents();
}
}
