package com.iu.s1.bankBook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyTestCase;


public class BankBookDAOTest extends MyTestCase {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
//	@Test
//	public void setBankBookAdd() throws Exception{ 
//		BankBookDTO bankBookDTO = new BankBookDTO();
//		
//		bankBookDTO.setBookDetail("fd");
//		bankBookDTO.setBookName("kdh");
//		bankBookDTO.setBookRate(3.21);
//		bankBookDTO.setBookSale(1);
//		int test = bankBookDAO.setBankBookAdd(bankBookDTO);
//		assertEquals(1,test);
//	}
//	@Test
//	public void getBankBookDetail() throws Exception {
//		BankBookDTO bankBookDTO = new BankBookDTO();
//		bankBookDTO.setBookNumber(1L);
//		bankBookDTO = bankBookDAO.getBankBookDetail(bankBookDTO);
//		assertNotNull(bankBookDTO);
//	
//	}
	
	@Test
	public void setProductAddTest() throws Exception { 
		int a= 0;
		for(int i =0;i<30;i++ ) {
			Random r = new Random();
			double d = r.nextDouble();//0.1234
//			d = d*100;//123.4
			int num = (int)(d*1000);//123
			d = num/100.0;
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookName("동K은행"+num);
			bankBookDTO.setBookRate(d);
			bankBookDTO.setBookSale(1);
			bankBookDTO.setBookDetail("dong");
			a=bankBookDAO.setBankBookAdd(bankBookDTO);
			assertEquals(1,a);
		}

	}

}
