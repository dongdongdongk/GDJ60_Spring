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
		
		return memeberDAO.setMemberAdd(memberDTO);
	
	}
	
	public List<MemberDTO> getMemberList() { 
		return memeberDAO.getMemberList();
	} 
	
	public int setMemeberAdd(MemberDTO memberDTO) throws Exception {
		
		int result = memeberDAO.setMemberAdd(memberDTO);
		result = memeberDAO.setMemberRoleAdd(memberDTO);
		return result;
		
				
	}
	//패스워드를 서비스에서 검색하는 경우 
	public MemberDTO getMemberLogin(MemberDTO memberDTO)throws Exception{
		//memberDTO : client 에서 입력한 id,pw
		MemberDTO result = memeberDAO.getMemberLogin(memberDTO);
		//result id 와 일치하는 모든 정보 
		if(result != null && memberDTO.getPw().equals(result.getPw())) {
			memberDTO.setPw(null);
			memberDTO.setRoleDTO(result.getRoleDTO());
			return memberDTO;
		}else { 
			return null;
		}
	}
	public MemberDTO getMemberPage(MemberDTO memberDTO) throws Exception{
		return memeberDAO.getMemberLogin(memberDTO);
	}
	
	public int setMemberUpdate(MemberDTO memberDTO) throws Exception {
		return memeberDAO.setMemberUpdate(memberDTO);
	}
	
}
