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
			// ������ ����Ÿ���̽��� URL ����
			String url = "jdbc:oracle:thin:@localhost:1521:" + sid;
			// ����
			connection = DriverManager.getConnection(url, id, pass);
		} catch (SQLException e) {
			System.out.println("����:" + e.getMessage());
		}
		String query = "select * from test1";
		Statement stmt = null;
		String pquery = "insert into test_validate values (?,?)";
		PreparedStatement pstmt = null;
		try {
			stmt = connection.createStatement();
			pstmt = connection.prepareStatement(pquery);
			pstmt.setInt(1, 4);
			pstmt.setString(2, "�ڹ���");
			pstmt.executeUpdate();
			System.out.println("���༺��");
		} catch (SQLException e) {
			System.err.println("Query ���� ����: " + e.getMessage());
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
			System.err.println("��� ȹ�����");
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
			System.err.println("�ݱ� ����~!!");
		}
	}
}
