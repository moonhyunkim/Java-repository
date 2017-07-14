package p170713;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Member1DAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testDB";
	String userid = "scott";
	String passwd = "tiger";

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	public Member1DAO() {
		try {
			Class.forName(driver);
			// 드라이버를 로딩
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Member1DTO> listAll() {
		ArrayList<Member1DTO> list = new ArrayList<Member1DTO>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			String query = "Select name, age, weight, height, sex from member1";
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				int height = rs.getInt("height");
				int weight = rs.getInt("weight");
				String sex = rs.getString("sex");
				Member1DTO dto = new Member1DTO();
				dto.setName(name);
				dto.setAge(age);
				dto.setHeight(height);
				dto.setWeight(weight);
				dto.setSex(sex);
				list.add(dto);
			}
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public boolean isExist(String name) {
		boolean result = false;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			String query = "select * from member where name = '" + name + "'";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				result = true;
			} // end while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}// end isExist

	public Member1DTO search(String name) throws RecordNotFoundException{
		if(! isExist(name)) throw new RecordNotFoundException("찾는 레코드가 없다.");
		
		Member1DTO dto = new Member1DTO();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs =null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			String query = "select *from member1 where name = "+ name+"";
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				dto.setName(rs.getString("name"));
				
			}
		}
	}

}
