package com.sist.data;
// 오라클 연결
import java.util.*;
import java.sql.*;
public class FoodDAO {
	private Connection conn; // 오라클 연결
	private PreparedStatement ps; // SQL전송
	private final String URL="jdbc:oracle:thin:@211.238.142.202:1521:XE";
	//
	// 1. 드라이버 등록
	public FoodDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 등록
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	// 2. 연결
	public void getConnection()
	{
		
	}
	// 3. 닫기
	public void disConnection()
	{
		
	}
	
}
