package com.min.edu.service;

import java.util.List;

import com.min.edu.vo.BoardVo;

public interface IBoardService {
	
public List<BoardVo> boardList();
	
	public BoardVo boardDetail(String seq);
	
	public int writeBoard(BoardVo vo);

}
