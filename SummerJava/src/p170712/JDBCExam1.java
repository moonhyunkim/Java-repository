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
		//Ŀ���� statement�� ���������ν� ����� ������ ������� �����ִ� ��ü
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			//SQL���� ���� statement ��ü�� ����
			String querry ="SELECT studno , name from student";
			rs = stmt.executeQuery(querry);
			//�־��� querry�� ������ ������� Resultset���� Return ���ִ� �޼ҵ�
			System.out.println("�л���ȣ\t�л��̸�\n=============");
			while(rs.next()) {
				//Resultset.next() �� �������� Ŀ���� �����̴� �޼ҵ� , ���� ����  ������ true ������ false
				int studno = rs.getInt("studno");
				//SQL���� column�� �ڹ��� int������ �������� �Լ�
				String name = rs.getString("name");
				System.out.println(studno +"\t"+ name );
			}
			 querry ="SELECT profno , name from professor";
			rs = stmt.executeQuery(querry);
			//�־��� querry�� ������ ������� Resultset���� Return ���ִ� �޼ҵ�
			System.out.println("�л���ȣ\t�л��̸�\n=============");
			while(rs.next()) {
				//Resultset.next() �� �������� Ŀ���� �����̴� �޼ҵ� , ���� ����  ������ true ������ false
				int studno = rs.getInt("profno");
				//SQL���� column�� �ڹ��� int������ �������� �Լ�
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
