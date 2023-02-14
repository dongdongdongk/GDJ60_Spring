package com.iu.s1.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
		mv.addObject("list",ar);
		return mv;
	}
	
//	@RequestMapping(value = "member Delete",method = RequestMethod.GET )
//	public void memeberDelete() { 
//		
//	}
	

	@RequestMapping(value = "memberLogin", method = RequestMethod.GET)
	public ModelAndView getMemberLogin()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/memberLogin");
		return mv;
	}
	
	
//	@RequestMapping(value = "memberLogin,",method = RequestMethod.POST)
//	public ModelAndView memberLogin(MemberDTO memberDTO,HttpServletRequest request) throws Exception{
//		ModelAndView mv = new ModelAndView();
//		memberDTO = memberService.memberLogin(memberDTO);
//		HttpSession session = request.getSession();
//		session.setAttribute("member", memberDTO);
//		
//		mv.setViewName("redirect:../");
//		return mv;	
//	}
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public ModelAndView getMemberLogin(MemberDTO memberDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.getMemberLogin(memberDTO);
		mv.setViewName("redirect:../");
		return mv;
	}
	
//	@RequestMapping(value = "memberLogout",method = RequestMethod.GET)
//	public ModelAndView getMemberLogout(HttpSession session)throws Exception {
//		ModelAndView mv = new ModelAndView();
//		session.invalidate();
//		return 
//	}


	@RequestMapping(value = "memberUpdate",method = RequestMethod.GET)
	public ModelAndView setMemberUpdate(MemberDTO memberDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.get(memberDTO);
		mv.setViewName("member/memberUpdate");
		mv.addObject("dto",memberDTO);
		return mv;	
	}
	
	public void getMemberDetail()throws Exception { 
		ModelAndView mv = new ModelAndView();
		
	}
	
}

	
//	@RequestMapping(value = "member Delete",method = RequestMethod.POST)
//	public String memberDelete(MemberDTO memberDTO) throws Exception { 
//		int result = memberService.memberDelete(memberDTO);
//		return "reditect:/memberDelete";
//	}
//	public String setAddMember() { 
//		return "member/Addmember";
//	}

