package com.iu.s1.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.product.ProductDTO;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTO> getBankBookList() throws Exception {
		return bankBookDAO.getBankBookeList();
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
