import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args) throws Exception {
		String name1 = "Shubham";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Shubham23#");
		PreparedStatement ps = con.prepareStatement("delete from register where name = ?");
		ps.setString(1, name1);
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Deleted Successfully");
		} else {
			System.out.println("Failed");
		}
		con.close();

	}
}
