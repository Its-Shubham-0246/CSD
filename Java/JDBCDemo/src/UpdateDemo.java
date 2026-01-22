import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception {
		String city1 = "Noide";
		String email1 = "sarvesh@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Shubham23#");
		PreparedStatement ps = con.prepareStatement("update register set city = ? where email = ?");
		ps.setString(1, city1);
		ps.setString(2, email1);
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Update fails");
		}
		con.close();
	}
}
