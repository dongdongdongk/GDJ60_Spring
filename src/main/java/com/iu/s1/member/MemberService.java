package com.iu.s1.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

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
	
//	public ModelAndView setMemeberAdd(MemberDTO memberDTO) throws Exception {
//		ModelAndView mv = new ModelAndView();
//		int result = memberDTO.set(memberDTO);
//		mv.setViewName("redirect:../");
//		return mv;
//				
//	}
	
	public MemberDTO getMemberLogin(MemberDTO memberDTO)throws Exception{
		return memeberDAO.getMemberLogin(memberDTO);
	}
	
	public int setMemberUpdate(MemberDTO memberDTO) throws Exception {
		return memeberDAO.setMemberUpdate(memberDTO);
	}
	
}
