


package com.test.spr;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDAO
{
	/*
	// ID, PW, NAME, TEL, EMAIL;
	public void setId(String id);
	public String getId();
	
	public void setPw(String pw);
	public String getPw();
	
	public void setName(String Name);
	public String getName();
	
	public void setTel(String tel);
	public String getTel();
	
	public void setEmail(String Email);
	public String getEmail();
	*/
	
	// public void setMemberDTO(MemberDTO dto);
	public ArrayList<MemberDTO> list() throws ClassNotFoundException, SQLException;
	// public int print();
}
