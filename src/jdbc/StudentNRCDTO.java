package jdbc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class StudentNRCDTO {
	private int studentId;
	private String name;
	private String regionCode;
	private String township;
	private String nrcNumber;
}
