import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
		String name1 = "Sarvesh";
		String email1 = "sarvesh@gmail.com";
		String pass1 = "sar123";
		String gender1 = "Male";
		String city1 = "Gorakhpur";
		Class.forName("com.mysql.cj.jdbc.Driver");// load and register Driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Shubham23#");
		PreparedStatement ps = con.prepareStatement(
				"insert into register values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("success");
		} else {
			System.out.println("failed");
		}
		con.close();
	}
}
