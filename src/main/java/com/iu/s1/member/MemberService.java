package com.iu.s1.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.product.ProductDTO;

@Service
public class MemberService {
	@Autowired
	private MemeberDAO memeberDAO;
	
	public int setAddMember(MemberDTO memberDTO) throws Exception { 
		
		return memeberDAO.setAddMember(memberDTO);
	
	}
	
	public List<MemberDTO> getMemberList() { 
		return memeberDAO.getMemberList();
	}
	
	

}
