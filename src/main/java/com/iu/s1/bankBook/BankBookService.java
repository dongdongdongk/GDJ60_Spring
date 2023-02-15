package com.iu.s1.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.product.ProductDTO;
import com.iu.s1.utill.Pager;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTO> getBankBookList(Pager pager) throws Exception {
//		long page=pager.getPage();
//		long perPage=10L;
//		long s=(page-1)*perPage+1;
//		long l=page*perPage;
//		long rpage = (page-1)*10+s;
//		long rpage2 = page*10;
		pager.makeRow();
		Long totalCount = bankBookDAO.getBankBookCount(pager);
		pager.makeNum(totalCount);
		pager.setTotalCount(totalCount);
//		pager.setStartRow(s);
//		pager.setLastRow(l);
		return bankBookDAO.getBankBookeList(pager);
	}

	public BankBookDTO getBankBookDetail(BankBookDTO bankBookDTO) throws Exception { 
		return bankBookDAO.getBankBookDetail(bankBookDTO);
	}

	public int setBankBookAdd(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setBankBookAdd(bankBookDTO);
	}

	public int setBankBookUpdate(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setBankBookUpdate(bankBookDTO);
	}
	public int setBankBookDelete(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setBankBookDelete(bankBookDTO);
	}
}
