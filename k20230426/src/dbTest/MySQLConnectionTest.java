package dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MySQLConnectionTest {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver"); // mysql 5.x 버전
			String url = "jdbc:mysql://localhost:3306/java";
			conn = DriverManager.getConnection(url, "root", "1234");

			System.out.println("연결성공: " + conn);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스가 없거나 읽어올 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 접속 정보가 올바르지 않습니다.");
		} finally {
			if (conn != null) { try { conn.close(); } catch (SQLException e) { }}
			if (stmt != null) { try { conn.close(); } catch (SQLException e) { }}
			if (pstmt != null) { try { conn.close(); } catch (SQLException e) { }}
			if (rs != null) { try { conn.close(); } catch (SQLException e) { }}
		}

	}

}
