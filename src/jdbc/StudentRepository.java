package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository {

	public static int insertStudent(StudentBean obj) {

		int i = 0;

		String sql = "insert into student(name,age,gender,address) values(?,?,?,?)";

		try (Connection con = DBConnection.getConnection(); 
				PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, obj.getName());
			ps.setInt(2, obj.getAge());
			ps.setString(3, obj.getGender());
			ps.setString(4, obj.getAddress());

			i = ps.executeUpdate();
			System.out.println("i : " + i);

		} catch (SQLException e) {
			System.out.println("insert error : " + e.getMessage());
		}

		return i;

	}

	public static int updateStudent(StudentBean obj) {

		int i = 0;

		String sql = "update student set name =?,address=? where id=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, obj.getName());
			ps.setString(2, obj.getAddress());
			ps.setInt(3, obj.getId());

			i = ps.executeUpdate();

			System.out.println("i : " + i);

		} catch (SQLException e) {
			System.out.println("update error : " + e.getMessage());
		}

		return i;

	}

	public static int softDeleteStudent(int id) {

		int i = 0;

		String sql = "update student set status=? where id=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, "inactive");
			ps.setInt(2, id);

			i = ps.executeUpdate();

			System.out.println("i : " + i);

		} catch (SQLException e) {
			System.out.println("soft delete error : " + e.getMessage());
		}

		return i;

	}

	public static List<StudentBean> getAllStudents() {
		List<StudentBean> list = new ArrayList<StudentBean>();

		String sql = "SELECT * FROM student where status='active'";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentBean obj = new StudentBean();
				obj.setId(rs.getInt("id"));
				obj.setName(rs.getString("name"));
				obj.setGender(rs.getString("gender"));
				obj.setAge(rs.getInt("age"));
				obj.setAddress(rs.getString("address"));

				list.add(obj);
			}

			System.out.println("list : " + list);

		} catch (SQLException e) {
			System.out.println("select error : " + e.getMessage());
		}

		return list;
	}

	public static List<StudentBean> getStudentsByName(String name) {
		List<StudentBean> list = new ArrayList<StudentBean>();

		String sql = "select * from student where status='active' and NAME=?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentBean obj = new StudentBean();
				obj.setId(rs.getInt("id"));
				obj.setName(rs.getString("name"));
				obj.setGender(rs.getString("gender"));
				obj.setAge(rs.getInt("age"));
				obj.setAddress(rs.getString("address"));

				list.add(obj);
			}

			// System.out.println("list : "+list);

		} catch (SQLException e) {
			System.out.println("get by name error : " + e.getMessage());
		}

		return list;
	}

	public static StudentBean getStudentbyId(int id) {
		StudentBean obj = null;

		String sql = "SELECT * FROM jwd70.student where status=? and id=?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, "active");
			ps.setInt(2, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				obj = new StudentBean();
				obj.setId(rs.getInt("id"));
				obj.setName(rs.getString("name"));
				obj.setGender(rs.getString("gender"));
				obj.setAge(rs.getInt("age"));
				obj.setAddress(rs.getString("address"));
				obj.setStatus(rs.getString("status"));

			}

			// System.out.println("list : "+list);

		} catch (SQLException e) {
			System.out.println("get by id error : " + e.getMessage());
		}

		return obj;
	}
	
	
	public static StudentNRCDTO getStudentInformationbyId(int studentId) {
		StudentNRCDTO obj = null;

		String sql = "select s.id,s.name,n.region_code,n.township,n.nrc_number \r\n"
				+ "from student s\r\n"
				+ "join nrc n\r\n"
				+ "on s.nrc_id = n.id\r\n"
				+ "where s.id =?;\r\n"
				+ "";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			
			ps.setInt(1, studentId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				obj = new StudentNRCDTO();
				obj.setStudentId(rs.getInt("id"));
				obj.setName(rs.getString("name"));
				obj.setRegionCode(rs.getString("region_code"));
				obj.setTownship(rs.getString("township"));
				obj.setNrcNumber(rs.getString("nrc_number"));
			}

			// System.out.println("list : "+list);

		} catch (SQLException e) {
			System.out.println("get student nrc by id error : " + e.getMessage());
		}

		return obj;
	}
}
