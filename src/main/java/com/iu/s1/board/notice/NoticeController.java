package com.iu.s1.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.board.BbsDTO;
import com.iu.s1.board.BbsService;
import com.iu.s1.board.BoardDTO;
import com.iu.s1.board.BoardFileDTO;
import com.iu.s1.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@ModelAttribute("boardName")
	public String getBoardName() {
		return "notice";
	}
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public ModelAndView getBoardList(Pager pager) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BbsDTO> ar = noticeService.getBoardList(pager);
		
		mv.addObject("list", ar);
		mv.setViewName("board/list");
		return mv;
	}
	
	@GetMapping("add")
	//메소드명을 명시하는 @GetMapping이 나옴
	public ModelAndView setBoardAdd() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/add");
		return mv;
	}
	
	@PostMapping("add")
	//메소드명을 명시하는 @PostMapping이 나옴
	public ModelAndView setBoardAdd(NoticeDTO noticeDTO,MultipartFile[] files ,HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setBoardAdd(noticeDTO, files, session);
		
		String message = "등록 실패";
		
		if(result>0) {
			message = "글이 등록 되었습니다";		
		}
		mv.addObject("result", message);
		mv.addObject("result",result);
		mv.setViewName("common/result");
		return mv;
	}
	@GetMapping("detail")
	public ModelAndView getDetial(NoticeDTO noticeDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		BoardDTO boardDTO  = noticeService.getBoardDetail(noticeDTO);
		mv.addObject("dto",boardDTO);
		mv.setViewName("board/detail");
		return mv;
		
	}
	@GetMapping("fileDown")
	public ModelAndView getFileDown(BoardFileDTO boardFileDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		boardFileDTO = noticeService.getBoardFileDetail(boardFileDTO);
		mv.addObject("boardFile",boardFileDTO);
		mv.setViewName("fileDownView");
		
		return mv;
	}
	@GetMapping("update")
	public ModelAndView setBoardUpdate(BoardDTO boardDTO)throws Exception {
		ModelAndView mv = new ModelAndView();
		boardDTO = noticeService.getBoardDetail(boardDTO);
		
		mv.addObject("dto", boardDTO);
		mv.setViewName("board/update");
		return mv;
		
	}
	
}