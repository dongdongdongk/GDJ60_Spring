package com.iu.s1.board;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.iu.s1.util.Pager;

public interface BoardService extends BbsService {

	public BoardDTO getBoardDetail(BoardDTO boardDTO)throws Exception;

	public BoardFileDTO getBoardFileDetail(BoardFileDTO boardFileDTO)throws Exception;
}