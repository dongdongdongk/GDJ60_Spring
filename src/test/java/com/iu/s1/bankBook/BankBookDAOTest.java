package com.iu.s1.bankBook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyTestCase;


public class BankBookDAOTest extends MyTestCase {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test
	public void setBankBookAdd() throws Exception{ 
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(32L);
		bankBookDTO.setBookDetail("fd");
		bankBookDTO.setBookName("kdh");
		bankBookDTO.setBookRate(3.21);
		bankBookDTO.setBookSale(3);
		int test = bankBookDAO.setBankBookAdd(bankBookDTO);
		assertEquals(1,test);
	}
}