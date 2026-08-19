package jdbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@NoArgsConstructor
public class StudentBean {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String address;
	private String status;
	
	public StudentBean(String name, int age, String gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	
}
