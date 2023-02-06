package com.iu.s1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s1.utill.DBConnection;

@Repository
public class MemeberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s1.member.MemberDAO.";
	
	public void memberJoin() { 
		
	}
	
	public void getMemberID() { 
		
	}
	
	
	
	
	
	public int setAddMenber(MemberDTO memberDTO) throws Exception { 
		
		return SqlSession.
	}
		
//	public static void main(String[] args) {
//		MemeberDAO memberDAO = new MemeberDAO();
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("id1");
//		memberDTO.setPw("pw1");
//		memberDTO.setName("name1");
//		memberDTO.setAddress("address1");
//		memberDTO.setPhone("phone1");
//		memberDTO.setEmail("Email1");
//		
//		int result = memberDAO.setAddMenber(memberDTO);
//		System.out.println(result ==1);
//	}
	
}