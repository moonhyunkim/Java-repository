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
		System.out.println("오라클 JDBC드라이버 로딩중...");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 JDBC 드라아버 로딩 실퍼");
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
			System.out.println("에러 : " + e.getMessage());
		}

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
