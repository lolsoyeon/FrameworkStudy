/*
 	Main.java
 	- main() 메소드를 포함하는 테스트 클래스
 	
 */

package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		// IDAO dao1 = new OracleDAO();
		IDAO dao2 = new MssqlDAO();
		
		MemberList member = new MemberList();
//		member.setDao(dao1);
		member.setDao(dao2);
		
		member.print();
		
		
		
		
	}
}
