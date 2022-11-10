


package com.test.spr;

import java.sql.SQLException;
import java.util.ArrayList;

public class MemberList 
{
	// 인터페이스 형태의 자료형 구성
	//public ArrayList<MemberDTO> list();
	private IDAO dao;
	
	public void setDAO(IDAO dao)
	{
		this.dao = dao;
	}
	
	public void print() throws ClassNotFoundException, SQLException
	{
		ArrayList<MemberDTO> dto = dao.list();
		
		System.out.println("아이디    이름     전화번호      이메일");
		for (MemberDTO item : dto)
		{
			item.getID();
			System.out.printf("%6s  %s  %10s  %10s%n"
					, item.getID(),item.getNAME(), item.getTEL(), item.getEMAIL());
		}
	}

	
}
