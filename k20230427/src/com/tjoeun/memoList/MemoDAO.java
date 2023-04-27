package com.tjoeun.memoList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemoDAO {

	public static boolean insert(MemoVO vo) {

		boolean result = true;

		Connection conn = null;
		PreparedStatement pstmt = null;

		conn = DBUtil.getMySQLConnection();

		String sql = "insert into memo(name, password, memo) values (?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getMemo());
			pstmt.executeUpdate();
			System.out.println(vo.getName() + "님 글 저장완료");
		} catch (SQLException e) {
//			System.out.println("sql명령이 올바르게 실행되지 않았습니다.");
			result = false;
		} finally {
			DBUtil.close(conn);
		}

		return result;

	}

	public static ArrayList<MemoVO> select() {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // 결과를 받아서 처리
//		메모 목록을 저장해서 리턴시킬 ArrayList 선언
		ArrayList<MemoVO> list = null;
		try {
			conn = DBUtil.getMySQLConnection();
			String sql = "select * from memo order by idx desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			list = new ArrayList<>();

//			1. resultset 객체에 데이터가 있는 동안 반복=> next()메소드 사용, Resultset 객체에 저장된 다음 데이터로 접근 
//			(다음데이터가 있으면 true, 없으면 false)
//			2. 저장된 데이터를 MemoVO 클래스객체로 만들어서 ArrayList에 저장		
			while (rs.next()) {
				MemoVO vo = new MemoVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setMemo(rs.getString("memo"));
				vo.setWriteDate(rs.getTimestamp("writeDate"));
//				System.out.println(vo);

				list.add(vo);

			}

		} catch (SQLException e) {
			System.out.println("sql명령이 올바르게 실행되지 않았습니다.");
		} finally {
			DBUtil.close(conn);
		}

		return list;
	}

	public static MemoVO selectByIdx(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // 결과를 받아서 처리
		MemoVO vo = null;

		conn = DBUtil.getMySQLConnection();
		String sql = "select * from memo where idx = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new MemoVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setMemo(rs.getString("memo"));
				vo.setWriteDate(rs.getTimestamp("writeDate"));
			}
		} catch (SQLException e) {
		} finally {
			DBUtil.close(conn);
		}

		return vo;
	}

	public static void delete(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getMySQLConnection();
			String sql = "delete from memo where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();

			System.out.println(idx+"번 메모 삭제완료.");
		} catch (SQLException e) {
			System.out.println(idx+"sql명령이 실행되지 않았습니다.");
		} finally {
			DBUtil.close(conn);
		
		}
	}

	public static void update(int idx, String memo) {	
		Connection conn = null;
		PreparedStatement pstmt = null;
	
		try {
			conn = DBUtil.getMySQLConnection();
			String sql = "update memo set memo = ? where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memo);
			pstmt.setInt(2, idx);
		
			pstmt.executeUpdate();
	
			System.out.println(idx+"번 메모 수정완료.");
		} catch (SQLException e) {
			System.out.println(idx+"sql명령이 실행되지 않았습니다.");
		} finally {
			DBUtil.close(conn);
		
		} 
	}
}