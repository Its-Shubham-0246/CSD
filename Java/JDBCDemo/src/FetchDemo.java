import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Shubham23#");
		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String name = rs.getString("name");
			String email = rs.getString("email");
			String pass = rs.getString("password");
			String gender = rs.getString("gender");
			String city = rs.getString("city");
			System.out.println("Name: " + name + " Email:" + email + " password: " + pass + " gender: " + gender
					+ " city: " + city);
		}
		con.close();
	}
}
