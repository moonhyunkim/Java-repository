package p170712;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sound.midi.Synthesizer;

public class JDBCExam1 {

	public static void main(String [] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testDB";
		String userid = "scott";
		String passwd ="tiger";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		//커리의 statement를 실행함으로써 생기는 데이터 결과들을 보여주는 객체
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			//SQL문을 보낼 statement 객체를 생성
			String querry ="SELECT studno , name from student";
			rs = stmt.executeQuery(querry);
			//주어진 querry를 실행해 결과값을 Resultset으로 Return 해주는 메소드
			System.out.println("학생번호\t학생이름\n=============");
			while(rs.next()) {
				//Resultset.next() 는 다음열로 커서를 움직이는 메소드 , 다음 열이  있으면 true 없으면 false
				int studno = rs.getInt("studno");
				//SQL문의 column을 자바의 int값으로 가져오는 함수
				String name = rs.getString("name");
				System.out.println(studno +"\t"+ name );
			}
			 querry ="SELECT profno , name from professor";
			rs = stmt.executeQuery(querry);
			//주어진 querry를 실행해 결과값을 Resultset으로 Return 해주는 메소드
			System.out.println("학생번호\t학생이름\n=============");
			while(rs.next()) {
				//Resultset.next() 는 다음열로 커서를 움직이는 메소드 , 다음 열이  있으면 true 없으면 false
				int studno = rs.getInt("profno");
				//SQL문의 column을 자바의 int값으로 가져오는 함수
				String name = rs.getString("name");
				System.out.println(studno +"\t"+ name );
			}
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		finally {
			try{
				rs.close();
				stmt.close();
				con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
