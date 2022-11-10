/*
 	Main.java
 	Main() 메소드를 포함하는 클래스
 */


package com.test.spr;

import java.sql.SQLException;

public class Main
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		IDAO dao1 = new OracleDAO();
		IDAO dao2 = new MssqlDAO();
		
		MemberList member = new MemberList();
		
//		member.setDAO(dao1);
		member.setDAO(dao2);
		
		member.print();
	}
}
