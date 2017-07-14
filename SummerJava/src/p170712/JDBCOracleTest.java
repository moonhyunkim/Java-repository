package p170712;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOracleTest {
	static final String sid = "TestDB";
	static final String id = "scott";
	static final String pass = "tiger";

	public static void main(String[] args) {
		System.out.println("����Ŭ JDBC����̹� �ε���...");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����Ŭ JDBC ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ JDBC ���ƹ� �ε� ����");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select *from student";
 
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:" + sid;
			connection = DriverManager.getConnection(url, id, pass);
			stmt = connection.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ":" + rs.getString(2));
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("���� : " + e.getMessage());
		}

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
