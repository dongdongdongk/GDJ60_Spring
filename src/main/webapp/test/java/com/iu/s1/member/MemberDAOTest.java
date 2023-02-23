package com.iu.s1.member;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.product.ProductDTO;

public class MemberDAOTest {
	@Autowired
	private MemeberDAO memeberDAO;
	
	@Test
	public void memberJoinTest() throws Exception { 
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setName("test23");
		memberDTO.setPw("12324");
		memberDTO.setPhone("34235");
		memberDTO.setEmail("dhk9309@ga");
		assertNotNull(memberDTO);
		
	}
	

	
}
