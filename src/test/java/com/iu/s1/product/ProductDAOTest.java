package com.iu.s1.product;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyTestCase;
import com.iu.s1.bankBook.BankBookDAO;
import com.iu.s1.bankBook.BankBookDTO;

public class ProductDAOTest extends MyTestCase {

	@Autowired
	private ProductDAO productDAO;
	private 
	
	@Test
	public void getProductListTest() throws Exception {
		List<ProductDTO> ar = productDAO.getProductList();
		//단정문
		assertNotEquals(0, ar.size());
	}
	
	@Test
	public void getProductDetailTest() throws Exception {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductNum(11L);
		
		productDTO = productDAO.getProductDetail(productDTO);
		assertNotNull(productDTO);
	}
	
	@Test
	public void setProductAddTest() throws Exception { 
		for(int i =0;i<30;i++ ) {
			Random r = new Random();
			double d = r.nextDouble();//0.1234
//			d = d*100;//123.4
			int num = (int)(d*1000);//123
			d = num/100.0;
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookName("동현은행"+num);
			bankBookDTO.setBookRate(d);
			bankBookDTO.setBookSale(1);
			bankBookDTO.setBookDetail("dong");
			
		}

	}
}
