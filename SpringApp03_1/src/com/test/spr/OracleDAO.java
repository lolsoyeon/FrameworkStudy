/*
 	OracleDAO.java
 	- DAO 역할 내 DBCONN
 */

package com.test.spr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.util.spr.DBConn;

public class OracleDAO implements IDAO
{
	
	@Override
	public ArrayList<MemberDTO> list() throws ClassNotFoundException, SQLException
	{
		Connection conn = DBConn.getConnection();
		
		ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
		
		String sql = "";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			
			// 쿼리문 준비
			sql = "SELECT ID, NAME, TEL, EMAIL FROM TBL_MEMBERLIST";
			
			// prepredStatment 생성
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				MemberDTO dto = new MemberDTO();
				
				dto.setID(rs.getString("ID"));
				dto.setNAME(rs.getString("NAME"));
				dto.setTEL(rs.getString("TEL"));
				dto.setEMAIL(rs.getString("EMAIL"));
			
				result.add(dto);
			}
			rs.close();
			pstmt.close();
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}

	
	
	
	
	
	
	
}
