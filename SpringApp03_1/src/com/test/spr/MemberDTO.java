/*
 	MemberDTO.java
 -- 속성만 존재하는 DTO 클래스 
 */

package com.test.spr;

public class MemberDTO
{
	// 주요 속성 구성
	//-- ID, PW, NAME, TEL,EMAIL
	private String ID, PW, NAME, TEL, EMAIL;

	/*
	 default 생성자
	public MemberDTO(MemberDTO dto)
	{	
		
	}
	*/
	
	// gettet/ setter 구성
	
	public String getID()
	{
		return ID;
	}

	public void setID(String iD)
	{
		ID = iD;
	}

	public String getPW()
	{
		return PW;
	}

	public void setPW(String pW)
	{
		PW = pW;
	}

	public String getNAME()
	{
		return NAME;
	}

	public void setNAME(String nAME)
	{
		NAME = nAME;
	}

	public String getTEL()
	{
		return TEL;
	}

	public void setTEL(String tEL)
	{
		TEL = tEL;
	}

	public String getEMAIL()
	{
		return EMAIL;
	}

	public void setEMAIL(String eMAIL)
	{
		EMAIL = eMAIL;
	}
	
	

}
