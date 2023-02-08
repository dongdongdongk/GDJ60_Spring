package com.iu.s1.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "memberJoin", method=RequestMethod.GET)
	public void setAddMember() { 
	}
	
	@RequestMapping(value = "memberJoin", method=RequestMethod.POST)
	public String setAddMember(MemberDTO memberDTO) throws Exception { 
		int result = memberService.setAddMember(memberDTO);
		return "redirect:./memberList";
	}
	
	
	
	
	@RequestMapping
	public ModelAndView memberPage() { 
	ModelAndView mv = new ModelAndView();
	mv.setViewName("member/memberPage");
	return mv;
	}
	
	@RequestMapping(value = "memberList")
	public ModelAndView memberList(ModelAndView mv) {
		List<MemberDTO> ar = memberService.getMemberList();
		mv.setViewName("member/memberList");
		mv.addObject("mlist",ar);
		return mv;
	}
	
	
//	public String setAddMember() { 
//		return "member/Addmember";
//	}
}
