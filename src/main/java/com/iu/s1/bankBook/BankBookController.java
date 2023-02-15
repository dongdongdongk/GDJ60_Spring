package com.iu.s1.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.product.ProductDTO;
import com.iu.s1.utill.Pager;

@Controller
@RequestMapping("/bankBook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;

	
	@RequestMapping(value = "list")
	public ModelAndView getBankBookList(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		
		List<BankBookDTO> ar = bankBookService.getBankBookList(pager);
		mv.setViewName("bankBook/bankBookList");
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		return mv;
	}
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView setBankBookAdd(ModelAndView mv) throws Exception {
		mv.setViewName("bankBook/bankBookAdd");		
		return mv; 
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setBankBookAdd(BankBookDTO bankBookDTO) throws Exception  {
		ModelAndView mv = new ModelAndView();
		int result  = bankBookService.setBankBookAdd(bankBookDTO);
		mv.setViewName("redirect:./list");
		return mv;
		
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setBankBookUpdate(BankBookDTO bankBookDTO, ModelAndView mv)throws Exception {
		
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setBankBookUpdate(BankBookDTO bankBookDTO) throws Exception {
		bankBookDTO = bankBookService.getBankBookDetail(bankBookDTO);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bankBook/bankBookUpdate");
		mv.addObject("dto",bankBookDTO);
		return mv;
	}
	
	
	

	@RequestMapping(value = "delete",method = RequestMethod.POST)
	public ModelAndView setBankBookDelete(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setBankBookDelete(bankBookDTO);
		mv.setViewName("redirect./list");
		return mv;
	}
	
	@RequestMapping(value = "delete",method = RequestMethod.GET)
	public ModelAndView setBankBookDelete(BankBookDTO bankBookDTO, ModelAndView mv)throws Exception {
		mv.setViewName("bankBook/bankBookDelete");
		mv.addObject("delete",bankBookDTO);
		return mv;
	}
	@RequestMapping(value = "detail" , method = RequestMethod.GET)
	public ModelAndView getBankBookDetail(BankBookDTO bankBookDTO , ModelAndView mv) throws Exception {
		bankBookDTO = bankBookService.getBankBookDetail(bankBookDTO);
		mv.setViewName("bankBook/bankBookDetail");
		mv.addObject("dto",bankBookDTO);
		return mv;	
	}
}
