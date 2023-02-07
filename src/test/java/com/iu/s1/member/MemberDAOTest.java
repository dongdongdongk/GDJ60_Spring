package com.iu.s1.member;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.product.ProductDTO;

public class MemberDAOTest {
	@Autowired
	private MemeberDAO memeberDAO;
	
	@Test
	public void memberJoinTest() throws Exception { 
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setName("test");
		memberDTO.setPw("");
		memberDTO.setPhone("");
		memberDTO.getEmail();
		int test = memeberDAO.setAddMenber(memberDTO); 
		assertEquals(1, test);
		
	}
}
