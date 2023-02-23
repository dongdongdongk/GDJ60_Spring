package com.iu.s1.bankBook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.board.BbsDTO;
import com.iu.s1.board.notice.NoticeDAO;
import com.iu.s1.board.notice.NoticeDTO;
import com.iu.s1.util.Pager;
import com.md.s1.MyTestCase;

public class BankBookCommentDAOTest extends MyTestCase {
	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	private NoticeDAO noticeDAO;
	
	@Test
	public void getBoardListTest() throws Exception {
		Pager pager = new Pager();
		pager.setBookNum(309L);
		pager.setKind("writer");
		pager.setSearch("ch");
		pager.makeRow();
		//long count = bankBookCommentDAO.getTotalCount(pager);
		List<BbsDTO> ar = bankBookCommentDAO.getBoardList(pager);
		assertNotEquals(0,ar.size());
	}
	
}
