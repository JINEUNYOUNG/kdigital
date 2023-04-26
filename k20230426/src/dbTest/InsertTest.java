package dbTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scanner.nextLine().trim();
		System.out.println("비밀번호: ");
		String password = scanner.nextLine().trim();
		System.out.println("메모: ");
		String memo = scanner.nextLine().trim();
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		conn = DBUtil.getMySQLConnection();
		if (conn != null) {
			
			try {
//				String sql = "insert into memo(name, password, memo) values ('" + name +"','"+password+"','"+memo+"')";
//				stmt = conn.createStatement();
//				stmt.executeUpdate(sql);
				
				String sql = "insert into memo(name, password, memo) values (?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, password);
				pstmt.setString(3, memo);
				pstmt.executeUpdate();
				System.out.println("입력성공");
			} catch (SQLException e) {
			}
			
			
		} else { 
			System.out.println("우우 연결 실패");
		}
		
	}

}
