package p170712;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOracleInsert {
	static final String sid = "TestDB";
	static final String id = "scott";
	static final String pass = "tiger";

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

		Connection connection = null;
		try {
			// 접속할 데이타베이스의 URL 생성
			String url = "jdbc:oracle:thin:@localhost:1521:" + sid;
			// 접속
			connection = DriverManager.getConnection(url, id, pass);
		} catch (SQLException e) {
			System.out.println("에러:" + e.getMessage());
		}
		String query = "select * from test1";
		Statement stmt = null;
		String pquery = "insert into test_validate values (?,?)";
		PreparedStatement pstmt = null;
		try {
			stmt = connection.createStatement();
			pstmt = connection.prepareStatement(pquery);
			pstmt.setInt(1, 4);
			pstmt.setString(2, "박문석");
			pstmt.executeUpdate();
			System.out.println("실행성공");
		} catch (SQLException e) {
			System.err.println("Query 실행 에러: " + e.getMessage());
		}
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				System.out.println(num + " : " + name);
			}
		} catch (SQLException ee) {
			System.err.println("결과 획득실패");
		}
		try {
			rs.close();
			pstmt.close();
			stmt.close();
			if (connection != null) {
				if (!connection.isClosed()) {
					connection.close();
				}
				connection = null;
			}
		} catch (SQLException ee) {
			System.err.println("닫기 실패~!!");
		}
	}
}
