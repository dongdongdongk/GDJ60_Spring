package com.iu.s1.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
//	@RequestMapping(value = "memberJoin", method=RequestMethod.GET)
//	public void setAddMember() { 
//	}
	
	@PostMapping("memberIdCheck")
	public ModelAndView getMemberIdCheck(MemberDTO memberDTO) throws Exception {
		boolean check = memberService.getMemberIdCheck(memberDTO);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", check);
		mv.setViewName("common/ajaxresult");
		return mv;
		
	}
	
	
	
	@RequestMapping(value="memberAgree", method = RequestMethod.GET)
	public void setMemberAgerr() throws Exception{
		
	}
	
	
	
	@RequestMapping(value = "memberJoin",method = RequestMethod.GET)
	public ModelAndView setMemberAdd() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/memberJoin");
		return mv;
	}
	
	
	@RequestMapping(value = "memberJoin",method = RequestMethod.POST)
	public ModelAndView setMemberAdd(MemberDTO memberDTO)throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = memberService.setMemeberAdd(memberDTO);
		mv.setViewName("redirect:./");
		return mv;
		
	}
	
	
//	@RequestMapping(value = "memberJoin", method=RequestMethod.POST)
//	public String setAddMember(MemberDTO memberDTO) throws Exception { 
//		int result = memberService.setAddMember(memberDTO);
//		return "redirect:./memberList";
//	}
//	
	
	
	
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
	
	@RequestMapping(value = "memberLogin",method = RequestMethod.POST)
	public ModelAndView getMemberLogin(MemberDTO memberDTO,HttpServletRequest request)throws Exception { 
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.getMemberLogin(memberDTO);
		if(memberDTO != null) {
			
			HttpSession session = request.getSession();
			session.setAttribute("member", memberDTO);
		}
		mv.setViewName("redirect:../");
		return mv;
	}
	
//	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
//	public ModelAndView memberLogin(MemberDTO memberDTO, HttpServletRequest request) throws Exception {
//	    ModelAndView mv = new ModelAndView();
//	    memberDTO = memberService.getMemberLogin(memberDTO);
//	    if (memberDTO == null) {  // 로그인 실패시
//	        mv.setViewName("redirect:memberLogin");  // 로그인 페이지로 다시 보내줌
//	        return mv;
//	    }
//	    HttpSession session = request.getSession();
//	    session.setAttribute("member", memberDTO);
//	    mv.setViewName("redirect:/");  // 홈으로 보내줌
//	    return mv;
//	}
	
	
//	
//	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
//	public ModelAndView getMemberLogin(MemberDTO memberDTO)throws Exception{
//		ModelAndView mv = new ModelAndView();
//		memberDTO = memberService.getMemberLogin(memberDTO);
//		mv.setViewName("redirect:../");
//		return mv;
//	}
	
//	@RequestMapping(value = "memberLogout",method = RequestMethod.GET)
//	public ModelAndView getMemberLogout(HttpSession session)throws Exception {
//		ModelAndView mv = new ModelAndView();
//		session.invalidate();
//		return 
//	}


	@RequestMapping(value = "memberUpdate",method = RequestMethod.GET)
	public ModelAndView setMemberUpdate(HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO =(MemberDTO)session.getAttribute("member");
		memberDTO = memberService.getMemberPage(memberDTO);
		mv.addObject("member",memberDTO);
		mv.setViewName("member/memberUpdate");
		
		return mv;	
	}
	
	@RequestMapping(value = "memberUpdate",method = RequestMethod.POST)
	public ModelAndView setMemberUpdate(MemberDTO memberDTO,HttpSession session)throws Exception {
		ModelAndView mv = new ModelAndView();
		MemberDTO sessionMemberDTO = (MemberDTO)session.getAttribute("member");
		memberDTO.setId(sessionMemberDTO.getId());
		int result = memberService.setMemberUpdate(memberDTO);
//		if(result>0) {
//			session.setAttribute("member", memberDTO);
//		}
		mv.setViewName("redirect:./memberPage");
		return mv;
		
	}
	
	@RequestMapping(value = "memberLogout", method = RequestMethod.GET)
	public ModelAndView getMemberLogout(HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		session.invalidate();
		mv.setViewName("redirect:../");
		return mv;
	}

	@RequestMapping(value = "memberPage", method = RequestMethod.GET)
	public ModelAndView getMemberPage(HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO= (MemberDTO)session.getAttribute("member");
		
		memberDTO = memberService.getMemberPage(memberDTO);
		mv.addObject("dto",memberDTO);
		mv.setViewName("member/memberPage");
		return mv;
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

