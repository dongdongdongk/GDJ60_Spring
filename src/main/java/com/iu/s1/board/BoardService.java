package com.iu.s1.board;

import java.util.List;

import com.iu.s1.util.Pager;

public interface BoardService extends BbsService {

	public BoardDTO getBoardDetail(BoardDTO boardDTO)throws Exception;

}